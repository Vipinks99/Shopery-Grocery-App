package com.example.shopery

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(private val context: Activity,private val arrayList:ArrayList<User>):ArrayAdapter<User>(context
                     ,R.layout.list_item,arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater:LayoutInflater= LayoutInflater.from(context)
        val view:View=inflater.inflate(R.layout.list_item,parent,false)

        val imageView:ImageView=view.findViewById(R.id.profile_pic)
        val username:TextView=view.findViewById(R.id.personName)
        val lastmsg:TextView=view.findViewById(R.id.last_message)
        val lastMsgTime:TextView=view.findViewById(R.id.last_msg_time)


        imageView.setImageResource(arrayList[position].imgId)
        username.text=arrayList[position].name
        lastmsg.text=arrayList[position].lastmsg
        lastMsgTime.text=arrayList[position].lastmsgTime


        return view


    }
}