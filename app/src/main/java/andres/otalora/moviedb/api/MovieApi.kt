package andres.otalora.moviedb.api

import andres.otalora.moviedb.models.Movie
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieApi {

    @GET("movie/{id}")
    suspend fun getMovie(@Path("id") id: Int, @Query("api_key")  api_key :String): Movie

}