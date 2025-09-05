package com.example

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.api.*
import com.lagradost.cloudstream3.utils.*

class VideoPruebaProvider : MainAPI() {
    override var mainUrl = "https://video.com"
    override var name = "VideoPrueba"
    override val hasMainPage = false
    override var lang = "es"
    override val supportedTypes = setOf(TvType.Movie)

    override suspend fun search(query: String): List<SearchResponse> {
        return listOf(
            newMovieSearchResponse(
                name = "Película de prueba",
                url = "$mainUrl/pelicula",
                type = TvType.Movie
            ) {
                posterUrl = "$mainUrl/poster.jpg"
                year = 2023
                plot = "Una película de prueba para el plugin"
                rating = 8
                contentRating = "PG-13"
            }
        )
    }

    override suspend fun load(url: String): LoadResponse {
        return newMovieLoadResponse(
            name = "Película de prueba",
            url = url,
            type = TvType.Movie,
            posterUrl = "$mainUrl/poster.jpg"
        ) {
            plot = "Esta es la película principal cargada desde el plugin"
            year = 2023
            rating = 8
            contentRating = "PG-13"

            recommendations = listOf(
                newMovieSearchResponse(
                    name = "Otra película",
                    url = "$mainUrl/otra",
                    type = TvType.Movie
                ) {
                    posterUrl = "$mainUrl/otra-poster.jpg"
                    year = 2023
                    plot = "Película recomendada"
                    rating = 7
                    contentRating = "PG"
                }
            )
        }
    }
}
