package andres.otalora.moviedb.repository

import andres.otalora.moviedb.api.RetrofitInstance
import andres.otalora.moviedb.models.Movie

class Repository {

    suspend fun getMovie() : Movie {
        return RetrofitInstance.api.getMovie(550, "46a23677fa5e36d0a2d48e8e065a4777")
    }

}