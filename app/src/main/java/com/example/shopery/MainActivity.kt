package com.example.shopery

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.io.FileOutputStream

class MainActivity : AppCompatActivity() {
    lateinit var et_Name: EditText
    lateinit var et_Email: EditText
    lateinit var et_Password: EditText

    lateinit var btn_Save:Button
    lateinit var btn_to_Login:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et_Name=findViewById(R.id.et_Name)
        et_Email=findViewById(R.id.et_Email)
        et_Password=findViewById(R.id.et_Password)

        btn_Save=findViewById(R.id.btn_Save)
        btn_to_Login=findViewById(R.id.btn_to_Login)


        btn_to_Login.setOnClickListener {
            val intent1=Intent(this,LoginActivity::class.java)
            startActivity(intent1)
        }

        btn_Save.setOnClickListener {
            val str1: String = et_Email.text.toString()

            val fos1: FileOutputStream = openFileOutput("username.txt", Context.MODE_PRIVATE)
            fos1.write(str1.toByteArray())
            fos1.close()


            val str2:String=et_Password.text.toString()

            val fos2: FileOutputStream = openFileOutput("password.txt", Context.MODE_PRIVATE)
            fos2.write(str2.toByteArray())
            fos2.close()

            if(str1.equals("") and str2.equals(""))
            {
                Toast.makeText(this,"This Fields can not be Empty",Toast.LENGTH_LONG).show()
            }
            else {
                Toast.makeText(this, "User Registered Succesfully", Toast.LENGTH_LONG).show()
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }
        }






    }
}