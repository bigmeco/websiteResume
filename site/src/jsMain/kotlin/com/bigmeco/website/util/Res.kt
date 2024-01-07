package com.bigmeco.website.util

import com.varabyte.kobweb.compose.ui.graphics.Color

object Res {
    enum class Theme(val color: Color) {
        BLUE(color = Color.rgb(r = 33, g = 150, b = 243)),
        ROOT(color = Color.rgb(r = 157, g = 245, b = 1)),
        BLACK(color = Color.rgb(r = 24, g = 25, b = 24)),
        SOCIAL_ICON_BACKGROUND(color = Color.rgb(r = 230, g = 230, b = 230)),
        GRADIENT_ONE(color = Color.rgb(r = 24, g = 25, b = 24)),
        GRADIENT_TWO(color = Color.rgb(r = 40, g = 42, b = 40)),
    }

    object Icon {
        const val EMAIL = "mail.svg"
        const val GITHUB = "github.svg"
        const val INSTAGRAM = "instagram.svg"
        const val GITLAB = "gitlab.svg"

    }

    object Image {
        const val PROFILE_PHOTO = "photo.png"
    }

    object String {
        const val NAME = "Nikolai Ilin"
        const val PROFESSION = "Android (Kotlin) Developer"
        const val ABOUT_ME =
            "Lorem ipsum dolor sit amet, nisl tempus lorem adipiscing elit. Donec sollicitudin blandit tellus, ac sagittis ligula egestas consequat. Lorem ipsum dolor sit amet."
        const val BUTTON_TEXT = "Get in touch"
        const val ROBOTO_CONDENSED = "RobotoCondensedBold"
        const val ROBOTO_REGULAR = "RobotoRegular"
        const val MY_EMAIL = "mailto:stefan.jovanavich@gmail.com"
        const val SAVED_THEME = "theme"
    }

    object Dimens {
        const val BORDER_RADIUS_GREEN = 10
        const val BORDER_RADIUS = 8
        const val PHOTO_RADIUS = 6
        const val MAX_CARD_WIDTH = 1200
        const val MAX_CARD_HEIGHT = 600
        const val ICON_SIZE = 24
        const val ICON_SIZE_LG = 32
    }
}