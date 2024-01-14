package com.bigmeco.website.components

import androidx.compose.runtime.Composable
import com.bigmeco.website.util.Res
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.silk.SilkStyleSheet.style
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.shapes.clip
import kotlinx.browser.window
import org.jetbrains.compose.web.css.LineStyle.Companion.Solid
import org.jetbrains.compose.web.css.dppx
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Style
import org.w3c.dom.clipboard.Clipboard

@Composable
fun OpenSourceCard(images: List<Pair<String, String>>) {
    val breakpoint = rememberBreakpoint()

    Box(
        modifier = Modifier.margin(top = 24.px, bottom = 64.px)
            .background(Res.Theme.ROOT.color)
            .borderRadius(r = Res.Dimens.BORDER_RADIUS_GREEN.px)
            .boxShadow(
                color = (Res.Theme.ROOT.color).toRgb().copy(alpha = 40),
                blurRadius = 6.px,
                spreadRadius = 6.px
            )
            .border(8.px, Solid, Res.Theme.ROOT.color)
            .fillMaxWidth()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth(
                    if (breakpoint <= Breakpoint.MD) 100.percent
                    else Res.Dimens.MAX_CARD_WIDTH.px
                )
                .borderRadius(r = Res.Dimens.BORDER_RADIUS.px)
                .background(Res.Theme.BLACK.color)
                .padding(leftRight = 12.px, topBottom = 28.px)
        ) {
            Row( horizontalArrangement = Arrangement.Center) {
                if (breakpoint >= Breakpoint.MD) {
                    SpanText(
                        modifier = Modifier
                            .color(Res.Theme.ROOT.color)
                            .fontSize(30.px)
                            .textAlign(TextAlign.Center),
                        text = "Open source projects"
                    )
                }
                Image(
                    modifier = Modifier
                        .width(140.px)
                        .objectFit(ObjectFit.Fill)
                        .borderRadius(r = Res.Dimens.PHOTO_RADIUS.px)
                        .padding(leftRight = 8.px)
                        .margin(bottom = 16.px)
                        .onClick { window.open("https://github.com/bigmeco", "_blank") },
                    src = Res.Image.GIT_HUB_PHOTO
                )
            }
            if (breakpoint >= Breakpoint.MD) {
                bigSize(images)
            } else {
                littleSize(images)
            }
        }
    }
}

@Composable
private fun bigSize(images: List<Pair<String, String>>) {
    Row {
        images.forEach {
            val (imageUrl, targetUrl) = it
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
@Composable
private fun littleSize(images: List<Pair<String, String>>) {
    Column {
        images.forEach {
            val (imageUrl, targetUrl) = it
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
