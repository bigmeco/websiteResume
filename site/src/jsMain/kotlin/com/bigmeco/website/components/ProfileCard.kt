package com.bigmeco.website.components

import androidx.compose.runtime.Composable
import com.bigmeco.website.util.Res
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.css.LineStyle.Companion.Solid
import org.jetbrains.compose.web.css.dppx
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.w3c.dom.clipboard.Clipboard

@Composable
fun ProfileCard() {
    val breakpoint = rememberBreakpoint()

    Box(
        modifier = Modifier.margin(top = 64.px, bottom = 24.px)
            .background(Res.Theme.ROOT.color)
            .borderRadius(r = Res.Dimens.BORDER_RADIUS_GREEN.px)
            .boxShadow(
                color = (Res.Theme.ROOT.color).toRgb().copy(alpha = 40),
                blurRadius = 6.px,
                spreadRadius = 6.px
            )
            .border(8.px, Solid, Res.Theme.ROOT.color)
    ) {
        SimpleGrid(
            numColumns = numColumns(base = 1, md = 2),
            modifier = Modifier
                .fillMaxWidth(
                    if (breakpoint <= Breakpoint.MD) 100.percent
                    else Res.Dimens.MAX_CARD_WIDTH.px
                )
                .thenIf(
                    condition = breakpoint > Breakpoint.MD,
                    other = Modifier.height(Res.Dimens.MAX_CARD_HEIGHT.px)
                )

                .borderRadius(r = Res.Dimens.BORDER_RADIUS.px)
                .background(Res.Theme.BLACK.color)
                .padding(all = 12.px)
        ) {
            PhotoSide(breakpoint = breakpoint)
            TitleSide(breakpoint = breakpoint)
        }
    }
}