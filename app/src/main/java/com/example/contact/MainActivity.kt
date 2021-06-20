package com.example.contact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rvcontacts=findViewById<RecyclerView>(R.id.rvcontacts)
        var contactList= listOf(
            Contacts("jane","0729829834","jane@gmail.com"),
            Contacts("peter","072767637","peter@gmail.com"),
            Contacts("Ruth","0729829834","ruth@gmail.com"),
            Contacts("Lema","0729829834","lema@gmail.com"),
            Contacts("Ian","07675669778","ian@gmail.com"),
            Contacts("Nolari","07768638865","nolari@gmail.com"),
            Contacts("Shady","0767554543","shady@gmail.com"),
            Contacts("Ada","07675669778","ada@gmail.com"),
            Contacts("Dama","070988877763","dama@gmail.com"),
            Contacts("Kay","07654334455","kay@gmail.com"),
        )

        var contactAdapter=ContactAdapter(contactList)
        rvcontacts.layoutManager=LinearLayoutManager(baseContext)
        rvcontacts.adapter=contactAdapter







    }
}