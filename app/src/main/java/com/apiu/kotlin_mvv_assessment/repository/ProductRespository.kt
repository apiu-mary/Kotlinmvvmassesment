package com.apiu.kotlin_mvv_assessment.repository

import com.apiu.kotlin_mvv_assessment.api.ApiClient
import com.apiu.kotlin_mvv_assessment.api.ApiInterface
import com.apiu.kotlin_mvv_assessment.model.ProductResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class ProductRespository {


    class ProductRepository {
    }
    val apiclient=ApiClient.buildClient(ApiInterface::class.java)
//enables kotlin 2 pause the function and allow another function to use the thread

    suspend fun  getProduct(): Response<ProductResponse> {
        return withContext(Dispatchers.IO){
            apiclient.getProduct()
        }
    }

}