package com.example.shopery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.io.FileInputStream
import java.nio.charset.Charset

class LoginActivity : AppCompatActivity() {
    lateinit var email:EditText
    lateinit var password:EditText

    lateinit var btn_Login:Button
    lateinit var btn_to_Register:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        email=findViewById(R.id.email)
        password=findViewById(R.id.password)

        btn_Login=findViewById(R.id.btn_Login)
        btn_to_Register=findViewById(R.id.btn_to_Register)


        btn_to_Register.setOnClickListener {
            val intent2=Intent(this,MainActivity::class.java)
            startActivity(intent2)
        }

        btn_Login.setOnClickListener {
                val fis1: FileInputStream = openFileInput("username.txt")
                val content1 = fis1.readBytes().toString(Charset.defaultCharset())

                val fis2:FileInputStream=openFileInput("password.txt")
                val content2 = fis2.readBytes().toString(Charset.defaultCharset())

//                etName.setText(content.toString())

            if(email.text.toString().equals(content1) and password.text.toString().equals(content2)){
                Toast.makeText(this,"Login Success",Toast.LENGTH_LONG).show()
                val intent3=Intent(this,CategoryActivity::class.java)
                startActivity(intent3)
            }
            if (email.text.toString().equals("") and password.text.toString().equals("")){
                Toast.makeText(this,"Fields cannot be Empty",Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this,"Incorrect password",Toast.LENGTH_LONG).show()
            }
        }
    }
}