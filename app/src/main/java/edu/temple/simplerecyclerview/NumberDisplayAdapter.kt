package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter (_numberArray: Array<Int>): RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() {
    private val numberArray = _numberArray
    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {
    }

    //Step 3b: Complete function definitions for adapter
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder{
        return NumberViewHolder (
            TextView(
                parent.context
            ).apply {
                setPadding(10,10,10,10)
                textSize=30f
            }
        )
    }
    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        val number = numberArray[position]
        holder.textView.text = number.toString()
    }
    override fun getItemCount(): Int{
        return numberArray.size;
    }
}