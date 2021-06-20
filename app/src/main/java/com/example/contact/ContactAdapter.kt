package com.example.contact

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(var contactList: List<Contacts>):RecyclerView.Adapter<ContactViewHolder>() {
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


    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}

class ContactViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvNames)
    var tvphoneNumber=itemView.findViewById<TextView>(R.id.tvPhoneNumbers)
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)

}