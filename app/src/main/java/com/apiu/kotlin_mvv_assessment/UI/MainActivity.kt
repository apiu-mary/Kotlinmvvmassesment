
package com.apiu.kotlin_mvv_assessment.UI

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.apiu.kotlin_mvv_assessment.databinding.ActivityMainBinding
import com.apiu.kotlin_mvv_assessment.viewmodel.ProductsViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val productsViewModel: ProductsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()
        setupObservers()
    }

     fun setupRecyclerView() {
        binding.rvrecyclerview.layoutManager = LinearLayoutManager(this)
    }

     fun setupObservers() {
        productsViewModel.errLiveData.observe(this, Observer { err ->
            Toast.makeText(this, err, Toast.LENGTH_SHORT).show()
        })

        productsViewModel.postsLiveData.observe(this, Observer { postsList ->
            val adapter = ProductAdapter(postsList, this)
            binding.rvrecyclerview.adapter = adapter
        })

        productsViewModel.fetchPosts()
    }
}
