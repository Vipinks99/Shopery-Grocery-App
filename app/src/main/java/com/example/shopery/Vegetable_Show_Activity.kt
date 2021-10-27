package com.example.shopery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.shopery.databinding.ActivityMainBinding

class Vegetable_Show_Activity : AppCompatActivity() {

    private lateinit var listview: ListView
    private lateinit var binding: ActivityMainBinding
    private lateinit var userArrayList1:ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)

        setContentView(R.layout.activity_vegetable_show)

        title="Vegetable"

        val imgId= intArrayOf(
            R.drawable.vegetables,
            R.drawable.vegetables,
            R.drawable.vegetables,
            R.drawable.vegetables,
            R.drawable.vegetables,
            R.drawable.vegetables,
            R.drawable.vegetables,
            R.drawable.vegetables,
            R.drawable.vegetables,
            R.drawable.vegetables,
            R.drawable.vegetables,
            R.drawable.vegetables,
            R.drawable.vegetables,
            R.drawable.vegetables,
            R.drawable.vegetables,
            R.drawable.vegetables,
            R.drawable.vegetables,
            R.drawable.vegetables,
            R.drawable.vegetables,
            R.drawable.vegetables,
            R.drawable.vegetables,
            R.drawable.vegetables,
            R.drawable.vegetables,
            R.drawable.vegetables,
            R.drawable.vegetables,
            R.drawable.vegetables,
            R.drawable.vegetables
        )

        val name= arrayOf(
            "Onion",
            "Carrot",
            "Patato",
            "Tomato",
            "Cauliflower",
            "Brinjal",
            "Pumpkin",
            "Cucumber",
            "Durum",
            "Triticale",
            "Common Wheat",
            "Quonia",
            "Pearl millet",
            "Soybean",
            "Amarnath",
            "Spelt",
            "Teff",
            "Broom-corn",
            "Adlay",
            "Wild Rice",
            "Finger Millet",
            "Proso millet",
            "Corn",
            "Millet",
            "Rye",
            "Buckwheat",
            "Granola"

        )
        val lastmsg= arrayOf(
            "Hello",
            "How are You",
            "Hello",
            "How are You",
            "Hello",
            "How are You",
            "Hello",
            "How are You",
            "Hello",
            "How are You",
            "Hello",
            "How are You",
            "Hello",
            "How are You",
            "Hello",
            "How are You",
            "Hello",
            "How are You",
            "Hello",
            "How are You",
            "Hello",
            "How are You",
            "Hello",
            "How are You",
            "Hello",
            "How are You",
            "Hello"

            )
        val lastmsgtime= arrayOf(
            "₹50",
            "₹60",
            "₹45",
            "₹55",
            "₹70",
            "₹60",
            "₹75",
            "₹85",
            "₹50",
            "₹60",
            "₹45",
            "₹55",
            "₹70",
            "₹60",
            "₹75",
            "₹85",
            "₹50",
            "₹60",
            "₹45",
            "₹55",
            "₹70",
            "₹60",
            "₹75",
            "₹85",
            "₹60",
            "₹75",
            "₹85"
        )

        userArrayList1=ArrayList()

        for(i in name.indices){
            val user=User(name[i],lastmsg[i],lastmsgtime[i],imgId[i])
            userArrayList1.add(user)
        }
        listview=findViewById(R.id.listview2)

        listview.isClickable=true
//        binding.listview.adapter=MyAdapter(this,userArrayList)
        listview.adapter=MyAdapter(this,userArrayList1)

    }
}