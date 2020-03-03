package com.example.searchsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.core.view.inputmethod.EditorInfoCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var countryItem: ArrayList<CountryItem> = arrayListOf()
    var dropdown:ArrayList<String> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        searcCountry.imeOptions = EditorInfo.IME_ACTION_SEARCH
        fillCountryList()
        countryItem.mapTo(dropdown){
            it.name
        }
        val adapter: ArrayAdapter<String> =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, dropdown)
        searcCountry.setAdapter(adapter)

       /* searcCountry.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                println("Hello world ${searcCountry.text}")
            }

            true
        }*/
    }

    fun fillCountryList() {
        countryItem = arrayListOf()
        countryItem.add(CountryItem("India"))
        countryItem.add(CountryItem("Indonesia"))
        countryItem.add(CountryItem("Washington"))
        countryItem.add(CountryItem("Paris"))
        countryItem.add(CountryItem("China"))
        countryItem.add(CountryItem("Australia"))
        countryItem.add(CountryItem("America"))
    }
}
