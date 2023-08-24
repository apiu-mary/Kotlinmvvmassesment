package com.apiu.kotlin_mvv_assessment.model

data class ProductResponse(
    var products: List<Product>,
    var total: Int,
    var limit:Int
)



