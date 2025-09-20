package com.example.practicauno.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.practicauno.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Botón para cambiar el texto
        binding.buttonCambiarTexto.setOnClickListener {
            binding.textHome.text = "Si presionas el boton cambias el texto"
        }
        // ImageButton para mostrar u ocultar la imagen
        binding.imageButtonToggle.setOnClickListener {
            if (binding.imageViewDemo.visibility == View.GONE) {
                binding.imageViewDemo.visibility = View.VISIBLE
            } else {
                binding.imageViewDemo.visibility = View.GONE
            }
        }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}