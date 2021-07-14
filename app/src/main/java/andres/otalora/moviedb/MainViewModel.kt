package andres.otalora.moviedb

import andres.otalora.moviedb.models.Movie
import andres.otalora.moviedb.repository.Repository
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel (private val repository : Repository): ViewModel(){

    val myResponse : MutableLiveData<Movie> = MutableLiveData()

    fun getMovie(){
        viewModelScope.launch {
        val response = repository.getMovie()
            myResponse.value = response
        }
    }

}