package com.example.contact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var contactList = listOf(
            Contacts("jane", "0729829834", "jane@gmail.com","https://images.pexels.com/photos/4668509/pexels-photo-4668509.jpeg?cs=srgb&dl=pexels-vlada-karpovich-4668509.jpg&fm=jpg" ),
            Contacts("peter", "072767637", "peter@gmail.com","https://images.pexels.com/photos/1699159/pexels-photo-1699159.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            Contacts("Ruth", "0729829834", "ruth@gmail.com","https://images.pexels.com/photos/1684323/pexels-photo-1684323.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            Contacts("Lema", "0729829834", "lema@gmail.com","https://images.pexels.com/photos/1684323/pexels-photo-1684323.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            Contacts("Ian", "07675669778", "ian@gmail.com","https://images.pexels.com/photos/1684323/pexels-photo-1684323.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            Contacts("Nolari", "07768638865", "nolari@gmail.com","https://images.pexels.com/photos/4560084/pexels-photo-4560084.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            Contacts("Shady", "0767554543", "shady@gmail.com","https://images.pexels.com/photos/4560084/pexels-photo-4560084.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            Contacts("Ada", "07675669778", "ada@gmail.com","https://images.pexels.com/photos/4668557/pexels-photo-4668557.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            Contacts("Dama", "070988877763", "dama@gmail.com","https://images.pexels.com/photos/4668509/pexels-photo-4668509.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            Contacts("Kay", "07654334455", "kay@gmail.com","https://images.pexels.com/photos/4668523/pexels-photo-4668523.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
        )
        var rvcontacts = findViewById<RecyclerView>(R.id.rvcontacts)

        rvcontacts.layoutManager = LinearLayoutManager(baseContext)
        val contactAdapter=ContactAdapter(contactList,baseContext)
        rvcontacts.adapter = contactAdapter


    }
}