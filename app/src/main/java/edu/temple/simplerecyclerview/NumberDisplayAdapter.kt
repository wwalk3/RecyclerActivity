package edu.temple.simplerecyclerview

import android.content.Context
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter(private val numberArray: Array<Int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>()  /* Step 3a: Provide Adapter Parent */ {

    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {
        val numberView = layout.findViewById<TextView>(R.id.numberView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
       return NumberViewHolder(
           TextView(parent.context).apply { setPadding(5, 10, 0, 10) }
       )
    }

    override fun getItemCount(): Int {
        return numberArray.size
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.numberView.text = numberArray[position]
    }

    //Step 3b: Complete function definitions for adapter

}