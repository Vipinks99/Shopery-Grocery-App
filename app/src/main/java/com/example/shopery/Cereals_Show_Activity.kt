package com.example.shopery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.shopery.databinding.ActivityMainBinding

class Cereals_Show_Activity : AppCompatActivity() {

    lateinit var listview: ListView
    private lateinit var binding1: ActivityMainBinding
    private lateinit var userArrayList:ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cereals_show)

        title="Cereals"

        binding1= ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_fruit_show)


        title="Cereals"

        val ImgId= intArrayOf(
            R.drawable.cereals,
            R.drawable.cereals,
            R.drawable.cereals,
            R.drawable.cereals,
            R.drawable.cereals,
            R.drawable.cereals,
            R.drawable.cereals,
            R.drawable.cereals,
            R.drawable.cereals,
            R.drawable.cereals,
            R.drawable.cereals,
            R.drawable.cereals,
            R.drawable.cereals,
            R.drawable.cereals,
            R.drawable.cereals,
            R.drawable.cereals,
            R.drawable.cereals,
            R.drawable.cereals,
            R.drawable.cereals,
            R.drawable.cereals,
            R.drawable.cereals,
            R.drawable.cereals,
            R.drawable.cereals,
            R.drawable.cereals,
            R.drawable.cereals,
            R.drawable.cereals

            )

        val name= arrayOf(
            "Wheat",
            "Oats",
            "Rice",
            "Maize",
            "Sorghum",
            "Barley",
            "Grasses",
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



        userArrayList=ArrayList()

        for(i in name.indices){
            val user=User(name[i],lastmsg[i],lastmsgtime[i],ImgId[i])
            userArrayList.add(user)
        }
        listview=findViewById(R.id.listview1)

        listview.isClickable=true
//        binding.listview.adapter=MyAdapter(this,userArrayList)
        listview.adapter=MyAdapter(this,userArrayList)

    }
}