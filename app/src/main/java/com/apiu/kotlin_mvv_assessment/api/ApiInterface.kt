package com.apiu.kotlin_mvv_assessment.api

import com.apiu.kotlin_mvv_assessment.model.Product
import com.apiu.kotlin_mvv_assessment.model.ProductResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {
    @GET("/product")
    //allow suspension
    suspend fun getProduct(): Response<ProductResponse>
    @GET("product/{id}")
    suspend fun getProductsById(@Path("id") productId: Int): Response<Product>
}



