package com.bigmeco.website.components

import androidx.compose.runtime.Composable
import com.bigmeco.website.styles.ButtonStyle
import com.bigmeco.website.styles.SocialIconStyle
import com.bigmeco.website.util.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.*
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
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun CompanyInfoSide(
    period: String,
    position: String,
    technologies: String,
    description: String,
    breakpoint: Breakpoint
) {
    Column(
        modifier = Modifier
            .padding(leftRight = 50.px)
            .thenIf(
                condition = breakpoint <= Breakpoint.MD,
                other = Modifier.padding(top = 16.px)
            ),
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = if (breakpoint <= Breakpoint.MD)
                Alignment.CenterHorizontally else Alignment.Start
        ) {
            SpanText(
                modifier = Modifier
                    .color(Res.Theme.ROOT.color)
                    .fontSize(30.px)
                    .margin(bottom = 12.px)
                    .textAlign(
                        if (breakpoint <= Breakpoint.SM) TextAlign.Center
                        else TextAlign.Start
                    ),
                text = "Period of work: $period"
            )
            SpanText(
                modifier = Modifier
                    .color(Colors.White)
                    .fontSize(18.px)
                    .margin(bottom = 36.px)
                    .textAlign(
                        if (breakpoint <= Breakpoint.SM) TextAlign.Center
                        else TextAlign.Start
                    ),
                text = "Position: $position"
            )
            Box(
                modifier = Modifier.fillMaxWidth()
                    .background(Res.Theme.ROOT.color)
                    .borderRadius(r = Res.Dimens.BORDER_RADIUS_GREEN.px)
                    .boxShadow(
                        color = (Res.Theme.ROOT.color).toRgb().copy(alpha = 40),
                        blurRadius = 4.px,
                        spreadRadius = 4.px
                    )
                    .border(8.px, LineStyle.Solid, Res.Theme.ROOT.color)
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth().padding(all = 8.px)
                        .background(Res.Theme.BLACK.color)
                        .borderRadius(r = Res.Dimens.BORDER_RADIUS.px),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    SpanText(
                        modifier = Modifier
                            .fontSize(18.px)
                            .color(Colors.White)
                            .lineHeight(2)
                            .margin(topBottom = 8.px)
                            .textAlign(TextAlign.Center),
                        text = "TECHNOLOGIES"
                    )
                    SpanText(
                        modifier = Modifier
                            .fontSize(14.px)
                            .color(Colors.White)
                            .opacity(90.percent)
                            .lineHeight(2)
                            .margin(bottom = 36.px)
                            .padding(leftRight = 8.px)
                            .textAlign(TextAlign.Center),
                        text = technologies
                    )
                }
            }
            SpanText(
                modifier = Modifier
                    .fontSize(14.px)
                    .color(Colors.White)
                    .opacity(80.percent)
                    .lineHeight(2)
                    .margin(topBottom = 36.px)
                    .textAlign(
                        if (breakpoint <= Breakpoint.SM) TextAlign.Center
                        else TextAlign.Start
                    ),
                text = "Description of the company: $description"
            )

        }
        Surface(
            modifier = Modifier
                .height(1.px)
                .thenIf(
                    condition = breakpoint > Breakpoint.MD,
                    other = Modifier.width(800.px)
                )
                .thenIf(
                    condition = breakpoint <= Breakpoint.MD,
                    other = Modifier.fillMaxWidth()
                )
                .background(Res.Theme.BLACK.color)
        ) {}
    }
}