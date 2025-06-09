package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class Evento(val titulo: String, val descripcion: String, val imagenRes: Int)

class adapterActivities(private val listaEventos: List<Evento>) :
    RecyclerView.Adapter<adapterActivities.EventoViewHolder>() {

    class EventoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imagen: ImageView = itemView.findViewById(R.id.imageEvento)
        val titulo: TextView = itemView.findViewById(R.id.tituloEvento)
        val descripcion: TextView = itemView.findViewById(R.id.descripcionEvento)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_activities, parent, false)
        return EventoViewHolder(view)
    }

    override fun onBindViewHolder(holder: EventoViewHolder, position: Int) {
        val evento = listaEventos[position]
        holder.titulo.text = evento.titulo
        holder.descripcion.text = evento.descripcion
        holder.imagen.setImageResource(evento.imagenRes)
    }

    override fun getItemCount(): Int = listaEventos.size
}
