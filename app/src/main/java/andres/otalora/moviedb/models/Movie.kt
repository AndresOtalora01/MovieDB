package andres.otalora.moviedb.models

import com.google.gson.annotations.SerializedName

data class Movie (
    @SerializedName("original_title")
    val title : String,
    @SerializedName("original_language")
    val language : String,
    val overview : String,
    val release_date : String
) {

}