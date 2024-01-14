package com.bigmeco.website.components

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.onClick
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.silk.components.graphics.Image
import kotlinx.browser.window
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.attributes.*
import org.jetbrains.compose.web.css.*

@Composable
fun CustomGrid(images: List<Pair<String, String>>) { // Пара URL изображения и целевой URL
    val numColumns = 2 // Количество столбцов
    val numRows = (images.size + numColumns - 1) / numColumns // Вычисление количества рядов

    Column {
        for (row in 0 until numRows) {
            Row {
                for (col in 0 until numColumns) {
                    val index = row * numColumns + col
                    if (index < images.size) {
                        val (imageUrl, targetUrl) = images[index]

                        Box(
                            modifier = Modifier
                                .onClick { window.open(targetUrl, "_blank") }
                                .width(50.percent)
                                .padding(4.px)
                        ) {
                            Image(
                                src = imageUrl,
                                modifier = Modifier.borderRadius(5.px),
                                width = 100,
                                height = 100,
                                alt = "Описание изображения"
                            )
                        }
                    }
                }
            }
        }
    }
}
