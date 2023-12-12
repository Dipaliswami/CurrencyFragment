package com.example.currencyfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlin.math.absoluteValue
import kotlin.random.Random

class CurrencyFragment : Fragment() {
    private lateinit var txtINR: TextView
   private lateinit var txtINRCurrency:TextView
    private lateinit var txtUSD:TextView
    private lateinit var txtUSDCurrency:TextView
    private lateinit var btnRefresh:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,  savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.currency_fragment, null)

       txtINRCurrency = view.findViewById(R.id.txtINRCurrency)
     txtUSDCurrency = view.findViewById(R.id.txtUSBCurrency)
        btnRefresh= view.findViewById(R.id.btnRefresh)

        btnRefresh.setOnClickListener {
            txtUSDCurrency.text = "${Random.nextFloat().absoluteValue}"
        }
        return view

    }

}
