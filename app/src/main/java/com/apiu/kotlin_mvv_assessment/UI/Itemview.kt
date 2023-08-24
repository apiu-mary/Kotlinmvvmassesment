package com.apiu.kotlin_mvv_assessment.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.apiu.kotlin_mvv_assessment.R
import com.apiu.kotlin_mvv_assessment.databinding.ActivityItemviewBinding
import com.apiu.kotlin_mvv_assessment.databinding.ActivityMainBinding

class Itemview : AppCompatActivity() {
    lateinit var binding: ActivityItemviewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityItemviewBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}