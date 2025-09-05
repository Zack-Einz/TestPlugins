package com.example

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.*

class VideoPruebaProvider : MainAPI() {
    override var mainUrl = "https://tusitio.com"
    override var name = "VideoPrueba"
    override val supportedTypes = setOf(TvType.Movie)

    override suspend fun load(url: String): LoadResponse {
        return newMovieLoadResponse(
            name = "Película de prueba",
            url = url,
            type = TvType.Movie,
            dataUrl = "https://sample-videos.com/video321/mp4/720/big_buck_bunny_720p_1mb.mp4"
        ) {
            posterUrl = "https://tusitio.com/poster.jpg"
            year = 2024
            plot = "Una película de ejemplo para probar el plugin"
            rating = 8 // Int, no Double
            tags = listOf("Acción", "Aventura")
            duration = 120
            trailers = mutableListOf(
                TrailerData("Trailer oficial", "https://video.com/trailer.mp4")
            )
            recommendations = listOf(
                newMovieSearchResponse(
                    name = "Otra película",
                    url = "https://video.com/otra",
                    type = TvType.Movie,
                    apiName = this@VideoPruebaProvider.name,
                    raw = "https://video.com/otra"
                )
            )
            actors = emptyList()
            comingSoon = false
            syncData = mutableMapOf()
            posterHeaders = null
            backgroundPosterUrl = null
            contentRating = "PG-13"
        }
    }
}
