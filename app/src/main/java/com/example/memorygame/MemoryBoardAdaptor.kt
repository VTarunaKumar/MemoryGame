package com.example.memorygame

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MemoryBoardAdaptor(private val context: Context, private val numPieces: Int) :
    RecyclerView.Adapter<MemoryBoardAdaptor.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view : View = LayoutInflater.from(context).inflate(R.layout.memory_card,parent,false)
       return ViewHolder(view)
    }

    override fun getItemCount() = numPieces


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(position: Int) {
            //NO-OP
        }
    }

}
