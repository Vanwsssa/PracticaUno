package com.example.practicauno.ui.element

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.practicauno.databinding.FragmentElementBinding

class ElementFragment : Fragment() {
    private var _binding: FragmentElementBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentElementBinding.inflate(inflater,container,false)
        val root: View = binding.root

        // Animación de ProgressBar
        var progress = 0
        val handler = Handler(Looper.getMainLooper())
        val runnable = object : Runnable {
            override fun run() {
                if (progress <= 100) {
                    binding.progressBarElement.progress = progress
                    binding.tvPorcentajeElement.text = "$progress% Completado"
                    progress++
                    handler.postDelayed(this, 30) // velocidad de llenado
                }else{
                    binding.imgFinal.visibility = View.VISIBLE
                }
            }
        }
        handler.post(runnable)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}