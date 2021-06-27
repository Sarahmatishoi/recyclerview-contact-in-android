package com.example.contact

import android.content.Context
import android.content.Intent
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactAdapter(var contactList: List<Contacts>,var context:Context):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
            var itemView =
                LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item, parent, false)
            return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact = contactList.get(position)
        holder.tvName.text = currentContact.Names
        holder.tvphoneNumber.text = currentContact.phoneNumbers
        holder.tvEmail.text = currentContact.emailAddress
        Picasso
            .get()//it instantiate PICASSO class
            .load(currentContact.imageUrl)
            //.placeholder(R.drawable.placeholder)
            .into(holder.imgContacts)
        holder.cvContacts.setOnClickListener {
         var intent=Intent(context,ViewContactActivity::class.java)
            intent.putExtra("name",currentContact.Names)
            intent.putExtra("phone",currentContact.phoneNumbers)
            intent.putExtra("Email",currentContact.emailAddress)
            intent.putExtra("Image",currentContact.imageUrl)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}

class ContactViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvNames)
    var tvphoneNumber=itemView.findViewById<TextView>(R.id.tvPhoneNumbers)
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)
    var imgContacts=itemView.findViewById<ImageView>(R.id.imgContacts)
    var cvContacts=itemView.findViewById<CardView>(R.id.cvContacts)

}