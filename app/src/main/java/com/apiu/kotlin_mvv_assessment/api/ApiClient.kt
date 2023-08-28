
package com.apiu.kotlin_mvv_assessment.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
//    private val retrofit = Retrofit.Builder()
//        .baseUrl("https://jsonplaceholder.typicode.com")
//        .addConverterFactory(GsonConverterFactory.create())
//        .build()
//
//    fun <T> buildClient(apiInterface: Class<T>): T {
//        return retrofit.create(apiInterface)
//    }
var retrofit = Retrofit.Builder()
    .baseUrl("https://jsonplaceholder.typicode.com")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

    fun <T> buildClient(apiInterface: Class<T>):T{
        return retrofit.create(apiInterface)
    }
}
