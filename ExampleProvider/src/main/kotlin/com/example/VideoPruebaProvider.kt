package com.example

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.*

class VideoPruebaProvider : MainAPI() {
    override var mainUrl = "https://tuservidor.com"
    override var name = "Video Prueba"
    override var lang = "es"

    override suspend fun load(url: String): LoadResponse {
        val name = "Mi película"
        val dataUrl = "https://sample-videos.com/video321/mp4/720/big_buck_bunny_720p_1mb.mp4"
        val posterUrl = "https://tuservidor.com/poster.jpg"
        val year = 2024
        val plot = "Descripción de la película"
        val rating = 8.5
        val tags = listOf("Acción", "Aventura")
        val duration = 120
        val trailers = emptyList<TrailerData>()
        val recommendations = emptyList<LoadResponse>()
        val actors = emptyList<ActorData>()
        val comingSoon = false
        val syncData = null
        val posterHeaders = null
        val backgroundPosterUrl = null

        return newMovieLoadResponse(
            name = name,
            url = url,
            type = TvType.Movie,
            dataUrl = dataUrl
        ) {
            this.posterUrl = posterUrl
            this.year = year
            this.plot = plot
            this.rating = rating
            this.tags = tags
            this.duration = duration
            this.trailers = trailers
            this.recommendations = recommendations
            this.actors = actors
            this.comingSoon = comingSoon
            this.syncData = syncData
            this.posterHeaders = posterHeaders
            this.backgroundPosterUrl = backgroundPosterUrl
            this.contentRating = "PG-13"
        }
    }
}
