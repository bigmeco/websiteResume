package com.bigmeco.website.components

import androidx.compose.runtime.Composable
import com.bigmeco.website.util.Res
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
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.css.LineStyle.Companion.Solid
import org.jetbrains.compose.web.css.dppx
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Style
import org.w3c.dom.clipboard.Clipboard

@Composable
fun WorkExperienceCard() {
    val breakpoint = rememberBreakpoint()

    Column(
        modifier = Modifier.margin(top = 24.px, bottom = 24.px)
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
                .borderRadius(r = Res.Dimens.BORDER_RADIUS.px)
                .background(Res.Theme.BLACK.color)
                .padding(leftRight = 12.px, topBottom = 28.px)
        ) {
            CompanyLogoSide(
                Res.Image.ELECTRO_CARS_PHOTO,
                listOf(
                    Pair(
                        "https://play-lh.googleusercontent.com/Hu2na-3r4QYinz9uqkG7aVAB2ruldukmkQeDbZNHOAt9MjmDRrVbnMhbDFO1SKKijH8",
                        "https://play.google.com/store/apps/details?id=com.electrocars.superapp&hl"
                    ),
                    Pair(
                        "https://play-lh.googleusercontent.com/2DmeQ8zbjSJwtP4Akv2N8S-VXx2mJnKZnIjaN3wGE8eHC2PdnPolxW8rm7CKvsU4WLo",
                        "https://play.google.com/store/apps/details?id=com.en.cars"
                    ),
                    Pair(
                        "https://play-lh.googleusercontent.com/qIK0Gqh3LvgNu1GkOKKYIY6n9ek1tZEjOfXKbio78yb7Yocda4cVzNHXMODjVCxPew",
                        "https://play.google.com/store/apps/details?id=com.electrocars.evolute"
                    ),
                    Pair(
                        "https://play-lh.googleusercontent.com/0Ar49Rbpf2aFN3ZlKrwAk8E_3KhZsFrA6h8-nhOefs4qIFKQO14r4brG-IAKdj3ecSE",
                        "https://play.google.com/store/apps/details?id=zaryad.service"
                    ),
                    Pair(
                        "https://play-lh.googleusercontent.com/kMeJv0E5GqhbKkfxYazLnh2gn3O4WgmiftSRBexVRpQY4hZUYKWAkrvmWu7KxunKU1U",
                        "https://play.google.com/store/apps/details?id=alfa.car"
                    ),
                    Pair(
                        "https://play-lh.googleusercontent.com/lrzRX6AA_DHVqCECSnODbXxeq0AqH7245X0HFJFjFu_nZfmyRqfOOL6zdlDCBa_aL7o",
                        "https://play.google.com/store/apps/details?id=electro.cars.ndapp&hl"
                    ),
                )
            )
            CompanyInfoSide(
                period = "May 2021 — present",
                position = "Team Lead/Senior Android developer",
                technologies = "mvvm | kotlin | firebase | android | compose | material | canvas | coroutines | okhttp | retrofit | deeplink | tensorflow | lifecycle | koin | lottie | (google, Huawei) maps | modules",
                description = "SOLUTIONS FOR THE MARKET ELECTRIC VEHICLES:\nCharging stations, electric cars and an IT platform for efficient management",
                breakpoint = breakpoint
            )
        }
        SpaseJob()
        SimpleGrid(
            numColumns = numColumns(base = 1, md = 2),
            modifier = Modifier
                .fillMaxWidth(
                    if (breakpoint <= Breakpoint.MD) 100.percent
                    else Res.Dimens.MAX_CARD_WIDTH.px
                )
                .borderRadius(r = Res.Dimens.BORDER_RADIUS.px)
                .background(Res.Theme.BLACK.color)
                .padding(leftRight = 12.px, topBottom = 28.px)
        ) {
            CompanyLogoSide(
                Res.Image.E_LEGION_PHOTO,
                listOf(
                    Pair(
                        "https://play-lh.googleusercontent.com/1DlNUCQTLseLRK9wy-8QKHH-CXotaN3y2r_EVODyUJyQo_tCT9--7WQEauzovGF2WA",
                        "https://play.google.com/store/apps/details?id=ru.tele2.mytele2"
                    )
                )
            )
            CompanyInfoSide(
                period = "Aug 2020 — Apr 2021",
                position = "Android developer",
                technologies = "mvp | kotlin | firebase | android | coroutines | okhttp | retrofit | room | deeplink | moxy | lifecycle | koin | webim | eSim | lottie | mockito | modules",
                description = "e-legion is a pioneer in the creation of mobile products in Russia.\n" +
                        "\n" +
                        "Our clients are leading companies in their industries: Alfa—Investments, Tinkoff, Tele2, Pyaterochka, Auchan, Burger King, Yandex and others.\n" +
                        "\n" +
                        "We are among the top three mobile app developers in the country.",
                breakpoint = breakpoint
            )
        }
        SpaseJob()
        SimpleGrid(
            numColumns = numColumns(base = 1, md = 2),
            modifier = Modifier
                .fillMaxWidth(
                    if (breakpoint <= Breakpoint.MD) 100.percent
                    else Res.Dimens.MAX_CARD_WIDTH.px
                )
                .borderRadius(r = Res.Dimens.BORDER_RADIUS.px)
                .background(Res.Theme.BLACK.color)
                .padding(leftRight = 12.px, topBottom = 28.px)
        ) {
            CompanyLogoSide(
                Res.Image.VICE_CODE_PHOTO,
                listOf(
                    Pair(
                        "https://play-lh.googleusercontent.com/fIIZAgTYclr8qm9aHVI3RV6KgeTvl0Bw_-tIWLtWE9fle48L5Enkz1DoUzULaLe56RTo",
                        "https://play.google.com/store/apps/details?id=com.alphavending.partizanmaster"
                    ),
                    Pair(
                        "https://play-lh.googleusercontent.com/wsVnZNg00TOx7Hod42NH9QuhSAt2kdn9ICICBfr7M023NR6_LGl1Ddv1f4cLU1Igy8I",
                        "https://play.google.com/store/apps/details?id=com.alonelegion.partizan"
                    ),
                    Pair(
                        "https://play-lh.googleusercontent.com/2nTQBbRbcPjIhgwpEWrf_9kf03UMVunalpEu5Y37CozKQ0oMI_er8KjSdpx788yMsag",
                        "https://apk.support/app-ru/com.complead.repairy"
                    ),
                    Pair("https://play-lh.googleusercontent.com/HDtIoIS3I1hAqP8EKAJWydGVOTC8oNmxQosiRJkEEEg4_2O85L-I7mjrkUkStmVxJ9k",
                        "https://apkcombo.com/ru/profi-service/com.vicecode.profiservice"),

                    )
            )
            CompanyInfoSide(
                period = "Apr 2018 — Jul 2020",
                position = "Team Lead/Senior Android developer",
                technologies = "mvp | kotlin | firebase | androidX | coroutines | retrofit | mvp | googleMaps | mapKit | mvi | flow | modules",
                description = "We develop complex ones IT solutions for your business\nDatabases, mobile applications and websites from ViceCode",
                breakpoint = breakpoint
            )
        }
        SpaseJob()
        SimpleGrid(
            numColumns = numColumns(base = 1, md = 2),
            modifier = Modifier
                .fillMaxWidth(
                    if (breakpoint <= Breakpoint.MD) 100.percent
                    else Res.Dimens.MAX_CARD_WIDTH.px
                )
                .borderRadius(r = Res.Dimens.BORDER_RADIUS.px)
                .background(Res.Theme.BLACK.color)
                .padding(leftRight = 12.px, topBottom = 28.px)
        ) {
            CompanyLogoSide(
                Res.Image.BEAUIT_PHOTO,
                listOf(
                    Pair(
                        "https://play-lh.googleusercontent.com/hjI3Cbsy88nxp-2u4s5oRJxqLFKM2t4h3Dhv7CR9_q6pMGm5WHkh8yPjBLyt7xjhI4A",
                        "https://apkcombo.com/ru/смартнарод-умный-дом/com.smartnarod/"
                    )
                )
            )
            CompanyInfoSide(
                period = "Jan 2018 — Apr 2018",
                position = "Android developer",
                technologies = "Android | React native | JS | C++ | kotlin | realm | redux | Bluetooth Low Energy | IoT | modules",
                description = "Company specializes in projects of high complexity. High qualification of the technical director and the system architect allows us to create programs that can work long and stably, can withstand considerable loads and resist hacking attempts.",
                breakpoint = breakpoint
            )
        }
        SpaseJob()
        SimpleGrid(
            numColumns = numColumns(base = 1, md = 2),
            modifier = Modifier
                .fillMaxWidth(
                    if (breakpoint <= Breakpoint.MD) 100.percent
                    else Res.Dimens.MAX_CARD_WIDTH.px
                )
                .borderRadius(r = Res.Dimens.BORDER_RADIUS.px)
                .background(Res.Theme.BLACK.color)
                .padding(leftRight = 12.px, topBottom = 28.px)
        ) {
            CompanyLogoSide(
                Res.Image.COMPAERO_PHOTO,
                listOf(
                    Pair(
                        "https://play-lh.googleusercontent.com/9CEXIWI4pG0I6TtBMhnmqbzmsDrbpt2dwur6vxoHVjj7T7WckIsD3ILdhyZk9Lj-hbii",
                        "https://apksfull.com/emercoin-secure-wallet/com.aspanta.emcsec"
                    ),
                    Pair(
                        "https://play-lh.googleusercontent.com/qhdEmO9xd8f3SpPdHUALJlu1B40iUlP9Apm4VokBY4_7EsHAKJLyXDM3kcvOOzD0aXOP",
                        "https://play.google.com/store/apps/details?id=com.planfixng"
                    ),
                )
            )
            CompanyInfoSide(
                period = "Jun 2017 — Jan 2018",
                position = "React native/Android developer",
                technologies = "Android | React native | JS | C++ | JavaFx | Java | Retrofit | realm | redux | Bluetooth Low Energy | UML | IoT | modules",
                description = "We create for you: mobile applications, WEB solutions (portals, services), blockchain projects.",
                breakpoint = breakpoint
            )
        }
        SpaseJob()
        SimpleGrid(
            numColumns = numColumns(base = 1, md = 2),
            modifier = Modifier
                .fillMaxWidth(
                    if (breakpoint <= Breakpoint.MD) 100.percent
                    else Res.Dimens.MAX_CARD_WIDTH.px
                )
                .borderRadius(r = Res.Dimens.BORDER_RADIUS.px)
                .background(Res.Theme.BLACK.color)
                .padding(leftRight = 12.px, topBottom = 28.px)
        ) {
            CompanyLogoSide(
                Res.Image.SLONOVOZ_PHOTO,
                listOf(
                    Pair(
                        "https://play-lh.googleusercontent.com/z1UlZNmXDJoKJyKBlEiL5LZYHOjktKm6EQTp_ZbmC5mKe-fJzSPika3PkqVsIyddKA",
                        "https://play.google.com/store/apps/details?id=bigi.slonovoz"
                    )
                )
            )
            CompanyInfoSide(
                period = "Jan 2016 — Oct 2016",
                position = "Android developer",
                technologies = "Java | Android | JavaScript | REST | XML",
                description = "We carry out all types of crossings: apartment, office, country, warehouse.",
                breakpoint = breakpoint
            )
        }
        SpaseJob()
        SimpleGrid(
            numColumns = numColumns(base = 1, md = 2),
            modifier = Modifier
                .fillMaxWidth(
                    if (breakpoint <= Breakpoint.MD) 100.percent
                    else Res.Dimens.MAX_CARD_WIDTH.px
                )
                .borderRadius(r = Res.Dimens.BORDER_RADIUS.px)
                .background(Res.Theme.BLACK.color)
                .padding(leftRight = 12.px, topBottom = 28.px)
        ) {
            CompanyLogoSide(
                Res.Image.BRABENS_DEV_PHOTO,
                listOf(
                )
            )
            CompanyInfoSide(
                period = "Jun 2016 — Sep 2016",
                position = "Android developer",
                technologies = "Retrofit | Java | Android | XML",
                description = "Development of highload projects.",
                breakpoint = breakpoint
            )
        }
    }
}

@Composable
private fun SpaseJob() {
    Row(
        modifier = Modifier.height(8.px).fillMaxWidth().background(Res.Theme.BLACK.color)
    ) {

        Surface(
            modifier = Modifier.fillMaxWidth()
                .height(8.px)
                .boxShadow(
                    color = (Res.Theme.ROOT.color).toRgb().copy(alpha = 20),
                    blurRadius = 4.px,
                    spreadRadius = 4.px
                )
                .borderRadius(topRight = Res.Dimens.BORDER_RADIUS.px, bottomRight = Res.Dimens.BORDER_RADIUS.px)
                .background(Res.Theme.ROOT.color)

        ) {}
        Box(modifier = Modifier.fillMaxSize())
        Box(modifier = Modifier.fillMaxSize())
        Box(modifier = Modifier.fillMaxSize())
        Surface(
            modifier = Modifier.fillMaxWidth()
                .height(8.px)
                .boxShadow(
                    color = (Res.Theme.ROOT.color).toRgb().copy(alpha = 20),
                    blurRadius = 4.px,
                    spreadRadius = 4.px
                )
                .borderRadius(topLeft = Res.Dimens.BORDER_RADIUS.px, bottomLeft = Res.Dimens.BORDER_RADIUS.px)
                .background(Res.Theme.ROOT.color)

        ) {}
    }
}