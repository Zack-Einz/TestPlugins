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
            type = TvType.Movie
        ) {
            // Línea 37: rating ahora como Int? (antes Double)
            rating = 8.5.toInt()

            // Línea 40: mutable list en vez de list inmutable
            trailers = mutableListOf(
                TrailerData("Trailer oficial", "https://video.com/trailer.mp4")
            )

            // Línea 41: lista del tipo correcto (SearchResponse)
            recommendations = listOf(
                MovieSearchResponse(
                    name = "Otra película",
                    url = "https://video.com/otra",
                    apiName = this@VideoPruebaProvider.name,
                    type = TvType.Movie
                )
            )

            // Línea 44: mapa mutable vacío en vez de null
            extraInfo = mutableMapOf()
        }
    }
}
