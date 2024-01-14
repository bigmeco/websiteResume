package com.bigmeco.website

import androidx.compose.runtime.*
import com.bigmeco.website.util.Res
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.theme.colors.palette.button
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Style

@App
@Composable
fun MyApp(content: @Composable () -> Unit) {
    SilkApp {
        Style {
            universal style {
                property("font-family", "monospace")
            }
        }
        Surface(SmoothColorStyle.toModifier().minHeight(100.vh).background(
            Res.Theme.TRANSPARENT.color,

            )) {
            content()
        }
    }
}

@InitSilk
fun overrideSilkTheme(context: InitSilkContext) {
    context.apply {
        theme.palettes.apply {
            light.apply {
                button.apply {
                    default = Res.Theme.BLUE.color
                    hover = Res.Theme.BLUE.color
                    pressed = Res.Theme.BLUE.color
                }
            }

            dark.apply {
                button.apply {
                    default = Res.Theme.BLUE.color
                    hover = Res.Theme.BLUE.color
                    pressed = Res.Theme.BLUE.color
                }
            }
        }
    }
}