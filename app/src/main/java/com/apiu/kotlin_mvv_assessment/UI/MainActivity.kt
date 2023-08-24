////package com.apiu.kotlin_mvv_assessment.UI
////
////import androidx.appcompat.app.AppCompatActivity
////import android.os.Bundle
////import android.widget.Toast
////import androidx.activity.viewModels
////import androidx.lifecycle.Observer
////import androidx.lifecycle.ViewModel
////import androidx.lifecycle.ViewModelStore
////import androidx.recyclerview.widget.LinearLayoutManager
////import com.apiu.kotlin_mvv_assessment.Viewmodel.ProductsViewmodel
////import com.apiu.kotlin_mvv_assessment.databinding.ActivityMainBinding
////import com.apiu.kotlin_mvv_assessment.model.Product
////
////class MainActivity : AppCompatActivity() {
////    val productsViewModel:ProductsViewmodel by ViewModel()
////    lateinit var binding: ActivityMainBinding
////    var products:List<Product> =emptyList()
////
////    override fun onCreate(savedInstanceState: Bundle?) {
////        super.onCreate(savedInstanceState)
////        binding=ActivityMainBinding.inflate(layoutInflater)
////        setContentView(binding.root)
////    }
////
////    override fun onResume() {
////        super.onResume()
////        productsViewModel.fetchProducts()
////        productsViewModel.errLiveData.observe(this, observer{ err->
////            Toast.makeText(baseContext, err, Toast.LENGTH_LONG).show()
////        })
////        productsViewModel.productsLiveData.observe(this, Observer { productList->
////            var  adapter=ProductAdapter(productList?: emptyList(),this)
////            binding.rvrecyclerview.adapter = adapter
////            binding.rvrecyclerview.layoutManager = LinearLayoutManager(this@MainActivity)
////        })
////
////
////    }
////
////
////}
////
////
////
////
////
////
////
//package com.apiu.kotlin_mvv_assessment.UI
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Toast
//import androidx.activity.viewModels
//import androidx.lifecycle.Observer
//import androidx.lifecycle.ViewModelProvider
//import androidx.recyclerview.widget.LinearLayoutManager
//import com.apiu.kotlin_mvv_assessment.Viewmodel.ProductsViewModel
//
//import com.apiu.kotlin_mvv_assessment.databinding.ActivityMainBinding
//import com.apiu.kotlin_mvv_assessment.model.Product
//
//class MainActivity : AppCompatActivity() {
//    private lateinit var binding: ActivityMainBinding
// private val productsViewModel: ProductsViewmodel by viewModels()
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        setupObservers()
//    }
//
//    private fun setupObservers() {
//        productsViewModel.errLiveData.observe(this, Observer { err ->
//            Toast.makeText(this@MainActivity, err, Toast.LENGTH_LONG).show()
//        })
//
//        productsViewModel.productsLiveData.observe(this, Observer { productList ->
//            val adapter = ProductAdapter(productList ?: emptyList(), this@MainActivity)
//            binding.rvrecyclerview.adapter = adapter
//            binding.rvrecyclerview.layoutManager = LinearLayoutManager(this@MainActivity)
//        })
//    }
//
//    override fun onResume() {
//        super.onResume()
//        productsViewModel.fetchProducts()
//    }
//}
//
