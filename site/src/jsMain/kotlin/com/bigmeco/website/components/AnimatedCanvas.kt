package com.bigmeco.website.components

import androidx.compose.runtime.*
import kotlinx.browser.window
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.dom.Canvas
import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.Image
import org.w3c.dom.Path2D
import org.w3c.dom.events.Event
import org.w3c.dom.events.MouseEvent
import kotlin.js.Date
import kotlin.random.Random

data class MovingImage(var x: Double, var y: Double, val speed: Double, val image: Image, val url: String)

@Composable
fun AnimatedCanvas(imagesUrls: List<Pair<String, String>>, imageWidth: Double, imageHeight: Double, iconPadding: Double, cornerRadius: Double) {
    var canvasRef by remember { mutableStateOf<HTMLCanvasElement?>(null) }
    var windowWidth by remember { mutableStateOf(window.innerWidth) }
    val coroutineScope = rememberCoroutineScope()
    val loadedImages = remember { mutableStateListOf<Image>() }
    var resizeListener: ((Event) -> Unit)? = null
    val movingImages = mutableListOf<MovingImage>()

    LaunchedEffect(Unit) {
        resizeListener = {
            if (window.innerWidth != windowWidth) {
                windowWidth = window.innerWidth
                canvasRef?.let { canvas ->
                    canvas.width = window.innerWidth
                    canvas.height = window.innerHeight
                }
            }
        }

        window.addEventListener("resize", resizeListener)
    }

    SideEffect {
        val clickListener: (Event) -> Unit = { event ->
            val mouseEvent = event as MouseEvent
            val clickedImage = movingImages.find {
                mouseEvent.offsetX >= it.x && mouseEvent.offsetX <= it.x + imageWidth &&
                        mouseEvent.offsetY >= it.y && mouseEvent.offsetY <= it.y + imageHeight
            }
            clickedImage?.let {
                window.open(it.url)
            }
        }

        canvasRef?.addEventListener("click", clickListener)

    }
    LaunchedEffect(imagesUrls) {
        canvasRef?.let { canvas ->
            canvas.width = window.innerWidth
            canvas.height = window.innerHeight
        }
        imagesUrls.forEach { imageUrl ->
            val img = Image().apply {
                src = imageUrl.first
                onload = { loadedImages.add(this) }
                onerror = { _, _, _, _, _ -> console.log("Ошибка загрузки изображения: $imageUrl") }
            }
        }
    }
    val canvasAspectRatio = imageWidth / imageHeight

    Canvas(
        attrs = {
            ref {
                canvasRef = it
                onDispose {
                    window.removeEventListener("resize", resizeListener)

                }
            }
            style {
                property("width", "100vw")
                property("height", "100vw / $canvasAspectRatio")
            }
        }
    )

    if (loadedImages.size == imagesUrls.size) {
        canvasRef?.let { canvas ->
            val context = canvas.getContext("2d") as CanvasRenderingContext2D
            val actualNumberOfColumns = (canvas.width / (imageWidth + iconPadding)).toInt()
            val totalNumberOfColumns = actualNumberOfColumns + 2
            val leftPadding = (canvas.width - (imageWidth + iconPadding) * actualNumberOfColumns + iconPadding) / 2 - imageWidth

            for (columnIndex in 0 until totalNumberOfColumns) {
                val shuffledPairs = imagesUrls.shuffled(Random(columnIndex)) // Перемешивание списка пар URL
                val speed = if (columnIndex % 2 == 0) 1.0 else -1.0

                for ((imageIndex, pair) in shuffledPairs.withIndex()) {
                    val (imageUrl, targetUrl) = pair
                    val xPosition = leftPadding + columnIndex * (imageWidth + iconPadding)
                    val yPosition = if (speed > 0) {
                        -imageHeight * (imageIndex + 1) - iconPadding * imageIndex
                    } else {
                        canvas.height - (imageHeight + iconPadding) * (shuffledPairs.size - imageIndex)
                    }
                    val image = loadedImages.find { it.src == imageUrl } ?: continue

                    movingImages.add(
                        MovingImage(
                            x = xPosition,
                            y = yPosition,
                            speed = speed,
                            image = image,
                            url = targetUrl
                        )
                    )
                }
            }

            coroutineScope.launch {
                while (isActive) {
                    context.clearRect(0.0, 0.0, canvas.width.toDouble(), canvas.height.toDouble())

                    movingImages.forEach { movingImage ->
                        val path = Path2D()
                        path.moveTo(movingImage.x + cornerRadius, movingImage.y)
                        path.lineTo(movingImage.x + imageWidth - cornerRadius, movingImage.y)
                        path.arcTo(movingImage.x + imageWidth, movingImage.y, movingImage.x + imageWidth, movingImage.y + cornerRadius, cornerRadius)
                        path.lineTo(movingImage.x + imageWidth, movingImage.y + imageHeight - cornerRadius)
                        path.arcTo(movingImage.x + imageWidth, movingImage.y + imageHeight, movingImage.x + imageWidth - cornerRadius, movingImage.y + imageHeight, cornerRadius)
                        path.lineTo(movingImage.x + cornerRadius, movingImage.y + imageHeight)
                        path.arcTo(movingImage.x, movingImage.y + imageHeight, movingImage.x, movingImage.y + imageHeight - cornerRadius, cornerRadius)
                        path.lineTo(movingImage.x, movingImage.y + cornerRadius)
                        path.arcTo(movingImage.x, movingImage.y, movingImage.x + cornerRadius, movingImage.y, cornerRadius)
                        path.closePath()

                        context.save()
                        context.clip(path)
                        context.drawImage(movingImage.image, movingImage.x, movingImage.y, imageWidth, imageHeight)
                        context.restore()

                        movingImage.y += movingImage.speed

                        if (movingImage.speed > 0 && movingImage.y > canvas.height) {
                            movingImage.y -= loadedImages.size * imageHeight + 100
                        } else if (movingImage.speed < 0 && movingImage.y + imageHeight < 0) {
                            movingImage.y += loadedImages.size * imageHeight + 100
                        }
                    }

                    delay(16L)
                }
            }
        }
    }
}