package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FgActivities : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fg_activities, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerEventos)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val eventos = listOf(
            Evento("Ceremonia de Inauguración", "Evento institucional que marca el inicio de las actividades académicas, culturales y recreativas organizadas por la escuela de ingeniería. Durante este acto, se presentan las autoridades universitarias, docentes y representantes estudiantiles, quienes ofrecen palabras de bienvenida y reflexionan sobre el rol de la ingeniería en el desarrollo científico y social.", R.drawable.img_inauguracion),
            Evento("Conferencias Presenciales", "Charlas realizadas por docentes universitarios especializados en distintas ramas de la ingeniería, que tienen como objetivo compartir conocimientos actualizados, experiencias profesionales y avances en investigación aplicada, con énfasis en los desafíos y oportunidades que enfrenta la ingeniería en el contexto actual.", R.drawable.img_conferencia),
            Evento("Misa de Celebración", "Acto litúrgico que invita a la comunidad universitaria a dar gracias y reflexionar espiritualmente en el marco de esta conmemoración. En este espacio de recogimiento, se agradece por los logros alcanzados, pedir por el bienestar de la comunidad universitaria y reflexionar sobre el compromiso ético y social de la profesión.", R.drawable.img_misa),
            Evento("Campeonato Interescuelas", "Se realizarán encuentros deportivos con la participación de estudiantes, docentes y egresados. Estas competencias tienen como propósito fomentar la integración, el compañerismo y el espíritu deportivo dentro de la comunidad académica. Las disciplinas incluirán deportes colectivos como fútbol, voleibol y básquetbol.", R.drawable.img_camp)
        )

        recyclerView.adapter = adapterActivities(eventos)
    }
}