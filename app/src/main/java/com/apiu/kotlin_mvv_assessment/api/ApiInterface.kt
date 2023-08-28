package com.apiu.kotlin_mvv_assessment.api

import com.apiu.kotlin_mvv_assessment.model.Product
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
//    @POST("/product")
//    //allow suspension
//    suspend fun getProduct(): Response<ProductResponse>
@GET("/posts")
suspend fun getPosts(): Response<List<Product>>
}





