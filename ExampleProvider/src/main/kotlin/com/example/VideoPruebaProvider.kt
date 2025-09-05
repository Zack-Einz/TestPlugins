package com.jose.videoprueba

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.*

class VideoPruebaProvider : MainAPI() {
    override var mainUrl = "https://example.com"
    override var name = "Video de prueba"
    override var lang = "es"
    override val supportedTypes = setOf(TvType.Movie)

    override suspend fun load(url: String): LoadResponse {
        return MovieLoadResponse(
            name = "Pulgarcito",
            url = url,
            apiName = name,
            type = TvType.Movie,
            dataUrl = "https://sample-videos.com/video321/mp4/720/big_buck_bunny_720p_1mb.mp4"
        )
    }
}
