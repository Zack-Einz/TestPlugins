return newMovieLoadResponse(
    name = name,
    url = url,
    type = TvType.Movie,
    dataUrl = dataUrl
) {
    posterUrl = posterUrl
    year = year
    plot = plot
    rating = rating
    tags = tags
    duration = duration
    trailers = trailers
    recommendations = recommendations
    actors = actors
    comingSoon = comingSoon
    syncData = syncData
    posterHeaders = posterHeaders
    backgroundPosterUrl = backgroundPosterUrl
    contentRating = "PG-13" // o el que corresponda
}
