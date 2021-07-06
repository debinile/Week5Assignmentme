package com.ajoritsedebi.W4Ass

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ajoritsedebi.week5assignmentme.databinding.ContactListItemBinding

class ContactRecyclerViewAdapter (val contacts: List<ContactModel>) : RecyclerView.Adapter<ContactRecyclerViewAdapter.ContactViewHolder>() {
    class ContactViewHolder (val binding: ContactListItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind (contacts: ContactModel) {
            binding.textFirstName.text = contacts.firstName
            binding.textLastName.text = contacts.lastName
            binding.contactImage.setImageResource(R.drawable.ic_launcher_background)




        }

    }
    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding: ContactListItemBinding = ContactListItemBinding.inflate(LayoutInflater.from(parent.context))
        return ContactViewHolder(binding)


    }

    override fun onBindViewHolder(
        holder: ContactViewHolder, position: Int) {
        val contact = contacts.get(position)
        holder.bind(contact)


    }

    override fun getItemCount(): Int {
        return contacts.size
    }
}
