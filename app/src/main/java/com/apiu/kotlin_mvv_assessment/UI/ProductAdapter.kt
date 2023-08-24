package com.apiu.kotlin_mvv_assessment.UI

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.apiu.kotlin_mvv_assessment.databinding.ActivityItemviewBinding
import com.apiu.kotlin_mvv_assessment.model.Product


class ProductAdapter (var ProductList:List<Product>,var  context: Context): RecyclerView.Adapter<ProductAdapter.ProductViewHolder>(){
        @SuppressLint("SuspiciousIndentation")
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
            var binding=ActivityItemviewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
            return  ProductViewHolder(binding)
        }

        override fun getItemCount(): Int {
            return ProductList.size

        }

        override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
            var detail=ProductList[position]
            holder.binding.apply {
                tvid.text=detail.id.toString()
                tvtitle.text=detail.title.toString()
                tvuserid.text=detail.userId.toString()




            }

//            holder.binding.cvProducts.setOnClickListener {
//                val intent=Intent(context,ProductDetailActivity::class.java)
//
//                intent.putExtra("PRODUCT_ID",detail.id)
//                intent.putExtra("PRODUCT_TITLE", detail.title)
//
//                context.startActivity(intent)
//            }



        }




        class  ProductViewHolder(var binding: ActivityItemviewBinding): RecyclerView.ViewHolder(binding.root){
        }}





