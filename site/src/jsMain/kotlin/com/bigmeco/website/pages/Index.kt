package com.bigmeco.website.pages

import androidx.compose.runtime.Composable
import com.bigmeco.website.components.AnimatedCanvas
import com.bigmeco.website.components.ProfileCard
import com.bigmeco.website.util.Res
import com.varabyte.kobweb.compose.css.functions.radialGradient
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundImage
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page

@Page
@Composable
fun HomePage() {
    Box(
        Modifier.fillMaxSize().backgroundImage(
            radialGradient(
                from = Res.Theme.GRADIENT_ONE.color,
                to =  Res.Theme.GRADIENT_TWO.color
            )
        ),
        contentAlignment = Alignment.Center
    ) {
        AnimatedCanvas(listOf(
            Pair("https://play-lh.googleusercontent.com/Hu2na-3r4QYinz9uqkG7aVAB2ruldukmkQeDbZNHOAt9MjmDRrVbnMhbDFO1SKKijH8", "https://play.google.com/store/apps/details?id=com.electrocars.superapp&hl"),
            Pair("https://play-lh.googleusercontent.com/2DmeQ8zbjSJwtP4Akv2N8S-VXx2mJnKZnIjaN3wGE8eHC2PdnPolxW8rm7CKvsU4WLo","https://play.google.com/store/apps/details?id=com.en.cars"),
            Pair("https://play-lh.googleusercontent.com/qIK0Gqh3LvgNu1GkOKKYIY6n9ek1tZEjOfXKbio78yb7Yocda4cVzNHXMODjVCxPew","https://play.google.com/store/apps/details?id=com.electrocars.evolute"),
            Pair("https://play-lh.googleusercontent.com/0Ar49Rbpf2aFN3ZlKrwAk8E_3KhZsFrA6h8-nhOefs4qIFKQO14r4brG-IAKdj3ecSE","https://play.google.com/store/apps/details?id=zaryad.service"),
            Pair("https://play-lh.googleusercontent.com/kMeJv0E5GqhbKkfxYazLnh2gn3O4WgmiftSRBexVRpQY4hZUYKWAkrvmWu7KxunKU1U","https://play.google.com/store/apps/details?id=alfa.car"),
            Pair("https://play-lh.googleusercontent.com/lrzRX6AA_DHVqCECSnODbXxeq0AqH7245X0HFJFjFu_nZfmyRqfOOL6zdlDCBa_aL7o","https://play.google.com/store/apps/details?id=electro.cars.ndapp&hl"),
            Pair("https://play-lh.googleusercontent.com/fIIZAgTYclr8qm9aHVI3RV6KgeTvl0Bw_-tIWLtWE9fle48L5Enkz1DoUzULaLe56RTo","https://play.google.com/store/apps/details?id=com.alphavending.partizanmaster"),
            Pair("https://play-lh.googleusercontent.com/1DlNUCQTLseLRK9wy-8QKHH-CXotaN3y2r_EVODyUJyQo_tCT9--7WQEauzovGF2WA","https://play.google.com/store/apps/details?id=ru.tele2.mytele2"),
            Pair("https://play-lh.googleusercontent.com/wsVnZNg00TOx7Hod42NH9QuhSAt2kdn9ICICBfr7M023NR6_LGl1Ddv1f4cLU1Igy8I","https://play.google.com/store/apps/details?id=com.alonelegion.partizan"),
            Pair("https://play-lh.googleusercontent.com/9UB15ocYn4K-21UqXtXGN9FHr95USH94K_v8IrTHlpdKQV7gTz5auOZ51WW66O_UrwqK","https://play.google.com/store/apps/details?id=com.bigmeco.firstdatequestions"),
            Pair("https://play-lh.googleusercontent.com/PEV6NY7X9ZFhOpewL3if2ctGRubGqp5exsRLegeyRYMlEVXuLKGSv_Urfrc5wVRBag","https://play.google.com/store/apps/details?id=com.bigmeco.questconstructor"),
            Pair("https://play-lh.googleusercontent.com/WxEKhhqc5HycgcrnreOt98phVVArZ0w8mqzD3YdY8tGx7TnMBJPArI2uC2b3itPf4gE3","https://play.google.com/store/apps/details?id=com.bigmeco.bigi.kinotop"),
            Pair("https://play-lh.googleusercontent.com/2VQyt58Khky-xONDW5PQdQr2f0oZk6z_TGf2aIvgEw6JILTXI0DS8aGCgLhBfq2DWw","https://play.google.com/store/apps/details?id=bigi.fizika"),
            Pair("https://play-lh.googleusercontent.com/qhdEmO9xd8f3SpPdHUALJlu1B40iUlP9Apm4VokBY4_7EsHAKJLyXDM3kcvOOzD0aXOP","https://play.google.com/store/apps/details?id=com.planfixng"),
            Pair("https://play-lh.googleusercontent.com/z1UlZNmXDJoKJyKBlEiL5LZYHOjktKm6EQTp_ZbmC5mKe-fJzSPika3PkqVsIyddKA","https://play.google.com/store/apps/details?id=bigi.slonovoz"),
            Pair("https://play-lh.googleusercontent.com/2nTQBbRbcPjIhgwpEWrf_9kf03UMVunalpEu5Y37CozKQ0oMI_er8KjSdpx788yMsag","https://apk.support/app-ru/com.complead.repairy"),
            Pair("https://play-lh.googleusercontent.com/hjI3Cbsy88nxp-2u4s5oRJxqLFKM2t4h3Dhv7CR9_q6pMGm5WHkh8yPjBLyt7xjhI4A","https://apkcombo.com/ru/смартнарод-умный-дом/com.smartnarod/"),

        ),100.0,100.0,6.0,6.0)
        ProfileCard()
    }
}

//ref {
//    canvasRef = it
//    onDispose { }
//}