package com.example.practicauno.ui.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practicauno.databinding.ItemListaBinding

class ListaAdapter(private val items: List<String>) :
    RecyclerView.Adapter<ListaAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemListaBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemListaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.textItem.text = items[position]
    }

    override fun getItemCount() = items.size
}
