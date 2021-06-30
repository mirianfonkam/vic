package com.sandyara.aula18

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FirstFragment : Fragment(R.layout.fragment_first){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val rvListPeople = view.findViewById<RecyclerView>(R.id.rvListPeople)
        val listAdapter = ListAdapter(listOf("Nome: Sandy, Idade: 21", "Nome: Joana, Idade: 23"))
        rvListPeople.adapter = listAdapter
    }
}