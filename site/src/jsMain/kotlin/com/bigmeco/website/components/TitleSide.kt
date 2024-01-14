package com.bigmeco.website.components

import androidx.compose.runtime.Composable
import com.bigmeco.website.styles.ButtonStyle
import com.bigmeco.website.styles.SocialIconStyle
import com.bigmeco.website.util.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.window
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun TitleSide(
    breakpoint: Breakpoint
) {
    Column(
        modifier = Modifier
            .fillMaxSize()

            .padding(all = 50.px),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = if (breakpoint <= Breakpoint.SM)
            Alignment.CenterHorizontally else Alignment.Start
    ) {
        SpanText(
            text = Res.String.NAME,
            modifier = Modifier
                .margin(bottom = 12.px)
                .color(Res.Theme.ROOT.color)
                .fontSize(50.px)
                .fontWeight(FontWeight.Bold)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                )
        )
        SpanText(
            text = Res.String.PROFESSION,
            modifier = Modifier
                .margin(bottom = 24.px)
                .fontWeight(FontWeight.Normal)
                .color(Colors.White)
                .fontSize(18.px)
        )
        Surface(
            modifier = Modifier
                .height(4.px)
                .thenIf(
                    condition = breakpoint > Breakpoint.MD,
                    other = Modifier.width(400.px)
                )
                .thenIf(
                    condition = breakpoint <= Breakpoint.MD,
                    other = Modifier.width(200.px)
                )
                .margin(bottom = 24.px)
                .boxShadow(
                    color = (Res.Theme.ROOT.color).toRgb().copy(alpha = 30),
                    blurRadius = 4.px,
                    spreadRadius = 4.px
                )
                .borderRadius(r = Res.Dimens.BORDER_RADIUS.px)
                .background(Res.Theme.ROOT.color)
                .align(
                    if (breakpoint <= Breakpoint.SM) Alignment.CenterHorizontally
                    else Alignment.Start
                )
        ) {}
        SpanText(
            modifier = Modifier
                .fontSize(14.px)
                .color( Colors.White)
                .opacity(80.percent)
                .lineHeight(2)
                .margin(bottom = 36.px)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                ),
            text = Res.String.ABOUT_ME
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .gap(15.px),
            horizontalArrangement = if (breakpoint <= Breakpoint.SM)
                Arrangement.Center else Arrangement.Start
        ) {
            SocialIcon.entries.forEach {
                IconButton(
                    modifier = SocialIconStyle.toModifier(),
                    icon = it.icon,
                    link = it.link
                )
            }
        }
    }
}