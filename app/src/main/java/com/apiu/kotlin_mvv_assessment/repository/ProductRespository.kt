package com.apiu.kotlin_mvv_assessment.repository

import com.apiu.kotlin_mvv_assessment.api.ApiClient
import com.apiu.kotlin_mvv_assessment.api.ApiInterface
import com.apiu.kotlin_mvv_assessment.model.Product
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response


class ProductRepository {


val apiClient = ApiClient.buildClient(ApiInterface::class.java)

    suspend fun getPosts(): Response<List<Product>> {
        return withContext(Dispatchers.IO){
            apiClient.getPosts()
        }
    }

}

