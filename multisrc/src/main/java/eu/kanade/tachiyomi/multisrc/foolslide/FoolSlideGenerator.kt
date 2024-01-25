package eu.kanade.tachiyomi.multisrc.foolslide

import generator.ThemeSourceData.MultiLang
import generator.ThemeSourceGenerator

class FoolSlideGenerator : ThemeSourceGenerator {

    override val themePkg = "foolslide"

    override val themeClass = "FoolSlide"

    override val baseVersionCode: Int = 3

    override val sources = listOf(
        MultiLang("FoolSlide Customizable", "", listOf("other")),
    )

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            FoolSlideGenerator().createAll()
        }
    }
}
