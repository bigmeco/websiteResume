package com.bigmeco.website.components

import androidx.compose.runtime.Composable
import com.bigmeco.website.util.Res
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px

@Composable
fun CompanyLogoSide(logo:String,images: List<Pair<String, String>>) {
    Column(horizontalAlignment = Alignment.CenterHorizontally ) {
        Image(
            modifier = Modifier
                .width(200.px)
                .height(140.px)
                .objectFit(ObjectFit.Fill)
                .borderRadius(r = Res.Dimens.PHOTO_RADIUS.px)
                .padding(4.px)
                .margin(bottom = 16.px),
            src = logo
        )
        Box(
            modifier = Modifier
                .background(Res.Theme.ROOT.color)
                .borderRadius(r = Res.Dimens.BORDER_RADIUS_GREEN.px)
                .boxShadow(
                    color = (Res.Theme.ROOT.color).toRgb().copy(alpha = 40),
                    blurRadius = 4.px,
                    spreadRadius = 4.px
                )
                .border(8.px, LineStyle.Solid, Res.Theme.ROOT.color)
        ) {
        Box(
            modifier = Modifier.padding(all = 8.px)
                .background(Res.Theme.BLACK.color)
                .borderRadius(r = Res.Dimens.BORDER_RADIUS.px)

        ) {
            CustomGrid(images)
        }
        }
    }
}