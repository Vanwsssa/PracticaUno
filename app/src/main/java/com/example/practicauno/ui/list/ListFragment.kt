package com.example.practicauno.ui.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.practicauno.databinding.FragmentListBinding
import androidx.recyclerview.widget.LinearLayoutManager


class ListFragment : Fragment() {

    private var _binding: FragmentListBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentListBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Lista de ejemplo
        val datos = listOf(
            "Fragment 1: TextFields ",
            "Fragment 2: Botones",
            "Fragment 3: Elementos de seleccion ",
            "Fragment 4: Listas",
            "Fragment 5: Elementos de información "
        )

        // Configurar RecyclerView
        binding.recyclerViewLista.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerViewLista.adapter = ListaAdapter(datos)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
