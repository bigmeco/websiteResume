package com.bigmeco.website.util

import com.varabyte.kobweb.compose.ui.graphics.Color

object Res {
    enum class Theme(val color: Color) {
        BLUE(color = Color.rgb(r = 33, g = 150, b = 243)),
        ROOT(color = Color.rgb(r = 157, g = 245, b = 1)),
        BLACK(color = Color.rgb(r = 24, g = 25, b = 24)),
        SOCIAL_ICON_BACKGROUND(color = Color.rgb(r = 54, g = 56, b = 54)),
        GRADIENT_ONE(color = Color.rgb(r = 24, g = 25, b = 24)),
        GRADIENT_TWO(color = Color.rgb(r = 40, g = 42, b = 40)),
        TRANSPARENT(color = Color.argb(r = 40, g = 42, b = 40,a=0)),
    }

    object Icon {
        const val EMAIL = "mail.svg"
        const val GITHUB = "github.svg"
        const val INSTAGRAM = "instagram.svg"
        const val TELEGRAM = "telegram.svg"
        const val LINKEDIN = "linkedin.svg"

    }

    object Image {
        const val PROFILE_PHOTO = "photo.png"
        const val ELECTRO_CARS_PHOTO = "electro_cars.svg"
        const val E_LEGION_PHOTO = "e_legion.svg"
        const val VICE_CODE_PHOTO = "vice_code.svg"
        const val BEAUIT_PHOTO = "beauit.svg"
        const val COMPAERO_PHOTO = "compaero.svg"
        const val SLONOVOZ_PHOTO = "slonovoz.svg"
        const val BRABENS_DEV_PHOTO = "brabens_dev.svg"
        const val GIT_HUB_PHOTO = "github_name.svg"
    }

    object String {
        const val NAME = "Nikolai Ilin"
        const val PROFESSION = "Android (Kotlin) Developer"
        const val ABOUT_ME =
            "Hello, I am 27 years old and have been involved in software development for 11 years, including 8 years in commercial development. My primary focus has been on Kotlin development, and I also have experience with Python, Java, JavaScript, and C++."

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