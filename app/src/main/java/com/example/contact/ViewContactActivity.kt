package com.example.contact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class ViewContactActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_contact)
        var nameintent=intent.getStringExtra("name")
        var phoneintent=intent.getStringExtra("phoneNumber")
        var emailintent=intent.getStringExtra("emailAddress")
        var imageintent=intent.getStringExtra("imageUrl")

        val name=findViewById<TextView>(R.id.tvname2)
        val phoneNumbers=findViewById<TextView>(R.id.tvphones)
        val emailAddress=findViewById<TextView>(R.id.tvemails)
        val imgPlaceholder=findViewById<ImageView>(R.id.imgPlaceholder)


        name.text=nameintent
        phoneNumbers.text=phoneintent
        emailAddress.text=emailintent
        Picasso.get().load(imageintent).into(imgPlaceholder)
    }
}