package com.example.shopery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CategoryActivity : AppCompatActivity() {

    lateinit var tv_Fruits:TextView
    lateinit var tv_Vegetables:TextView
    lateinit var tv_Cereals:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        title="Category"

        tv_Fruits = findViewById(R.id.tv_Fruits)
        tv_Vegetables = findViewById(R.id.tv_Vegetables)
        tv_Cereals = findViewById(R.id.tv_Cereals)

        tv_Fruits.setOnClickListener {
            val intent5=Intent(this,Fruit_Show_Activity::class.java)
            startActivity(intent5)
        }
        tv_Vegetables.setOnClickListener{
            val intent6=Intent(this,Vegetable_Show_Activity::class.java)
            startActivity(intent6)
        }
        tv_Cereals.setOnClickListener {
            val intent7=Intent(this,Cereals_Show_Activity::class.java)
            startActivity(intent7)
        }
    }
}