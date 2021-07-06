package com.ajoritsedebi.W4Ass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var mycontactRecyclerViewAdapter: ContactRecyclerViewAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val contacts: List<ContactModel> = listOf(
            ContactModel("Jonathan", "Taiwo", "R.drawable.ic_launcher_background"))
        ContactModel("Edwin", "Kolo", "R.drawable.ic_launcher_background")
        ContactModel("Tuoyo", "Fregene", "R.drawable.ic_launcher_background")
        ContactModel("Sunday", "Fregene", "R.drawable.ic_launcher_background")
        ContactModel("Emma", "Fregene", "R.drawable.ic_launcher_background")
        ContactModel("Tuoyo", "Fregene", "R.drawable.ic_launcher_background")
        ContactModel("Tony", "Fregene", "R.drawable.ic_launcher_background")
        ContactModel("Temile", "Fregene", "R.drawable.ic_launcher_background")
        ContactModel("Tunde", "Fregene", "R.drawable.ic_launcher_background")
        ContactModel("Timothy", "Fregene", "R.drawable.ic_launcher_background")
        ContactModel("Tega", "Fregene", "R.drawable.ic_launcher_background")
        ContactModel("Obodo", "Fregene", "R.drawable.ic_launcher_background")
        ContactModel("Monday", "Fregene", "R.drawable.ic_launcher_background")
        ContactModel("Tijani", "Fregene", "R.drawable.ic_launcher_background")
        ContactModel("Tuoyo", "taiwo", "R.drawable.ic_launcher_background")
        ContactModel("Tuoyo", "tunde", "R.drawable.ic_launcher_background")
        ContactModel("Tuoyo", "michael", "R.drawable.ic_launcher_background")
        ContactModel("Tuoyo", "Francis", "R.drawable.ic_launcher_background")
        ContactModel("Tuoyo", "Okotie", "R.drawable.ic_launcher_background")
        ContactModel("Tuoyo", "Bawo", "R.drawable.ic_launcher_background")









        mycontactRecyclerViewAdapter = ContactRecyclerViewAdapter(contacts)
        binding.contactRecyclerView.adapter = mycontactRecyclerViewAdapter


    }

}