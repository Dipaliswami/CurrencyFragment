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

class StockFragment :Fragment() {
    private lateinit var txtStockValue:TextView
    private lateinit var btnRefresh:Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       val view =inflater.inflate(R.layout.stock_fragment,null)
        txtStockValue=view.findViewById(R.id.txtStockVlaue)
        btnRefresh=view.findViewById(R.id.btnRefresh)

        btnRefresh.setOnClickListener {
            val randomValue = Random.nextFloat().absoluteValue
            txtStockValue.text = randomValue.toString()

        }
        return view
        }
}