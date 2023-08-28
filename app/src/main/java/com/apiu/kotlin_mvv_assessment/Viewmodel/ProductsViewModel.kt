

package com.apiu.kotlin_mvv_assessment.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.apiu.kotlin_mvv_assessment.model.Product
import com.apiu.kotlin_mvv_assessment.repository.ProductRepository
import kotlinx.coroutines.launch

class ProductsViewModel : ViewModel() {

    private val repo = ProductRepository()
    val postsLiveData = MutableLiveData<List<Product>>()
    val errLiveData = MutableLiveData<String>()

    fun fetchPosts() {
        viewModelScope.launch {
            val response = repo.getPosts() // Fixed variable name
            if (response.isSuccessful) {
                val posts = response.body() ?: emptyList()
                postsLiveData.postValue(posts)
            } else {
                errLiveData.postValue(response.errorBody()?.string())
            }
        }
    }
}
