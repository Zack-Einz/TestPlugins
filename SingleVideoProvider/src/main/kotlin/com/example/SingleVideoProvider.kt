package com.example

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.*

class SingleVideoProvider : MainAPI() {
    override var mainUrl = "https://miraculous.to"
    override var name = "MiraculousTest"
    override val supportedTypes = setOf(TvType.Movie)

    private val testVideoUrl = "https://ep-distribution.miraculous.to/episodes/video2/EN615/EN615.mp4"

    override suspend fun search(query: String): List<SearchResponse> {
        return listOf(
            MovieSearchResponse(
                "Miraculous Episodio 615",
                null,
                TvType.Movie,
                testVideoUrl
            )
        )
    }

    override suspend fun load(url: String): LoadResponse? {
        return MovieLoadResponse(
            "Miraculous Episodio 615",
            url,
            TvType.Movie,
            url,
            null,
            null
        )
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        callback.invoke(
            ExtractorLink(
                this.name,
                "Directo",
                testVideoUrl,
                referer = "",
                quality = Qualities.Unknown.value
            )
        )
        return true
    }
}
