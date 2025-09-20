package com.example.practicauno.ui.notifications

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.practicauno.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // SharedPreferences para guardar tema
        val prefs = requireActivity().getSharedPreferences("settings", 0)
        val darkMode = prefs.getBoolean("dark_mode", false)
        binding.switchTema.isChecked = darkMode

        // 🔹 Función para aplicar colores según tema
        fun applyTheme(isDark: Boolean) {
            if(isDark){
                binding.root.setBackgroundColor(Color.DKGRAY)
                binding.textDescripcion.setTextColor(Color.WHITE)
                binding.textResultado.setTextColor(Color.WHITE)
                binding.checkBoxEstudio.setTextColor(Color.WHITE)
                binding.radioChocolate.setTextColor(Color.WHITE)
                binding.radioVanilla.setTextColor(Color.WHITE)
                binding.switchTema.setTextColor(Color.WHITE)
            } else {
                binding.root.setBackgroundColor(Color.WHITE)
                binding.textDescripcion.setTextColor(Color.BLACK)
                binding.textResultado.setTextColor(Color.BLACK)
                binding.checkBoxEstudio.setTextColor(Color.BLACK)
                binding.radioChocolate.setTextColor(Color.BLACK)
                binding.radioVanilla.setTextColor(Color.BLACK)
                binding.switchTema.setTextColor(Color.BLACK)
            }
        }

        applyTheme(darkMode)

        // Función para actualizar el TextView según los elementos seleccionados
        val updateResult = {
            // CheckBox
            val estudioMsg = if (binding.checkBoxEstudio.isChecked) {
                "¡Genial que te guste estudiar Sistemas!"
            } else {
                "¡Animo tu puedes! Seguro le tomaras gusto pronto "
            }

            // RadioButton
            val heladoMsg = when (binding.radioGroupHelado.checkedRadioButtonId) {
                binding.radioChocolate.id -> "Te gusta más el helado de Chocolate 🍫"
                binding.radioVanilla.id -> "Te gusta más el helado de Vanilla 🍦"
                else -> "No seleccionaste tu helado favorito"
            }

            val temaMsg = if(binding.switchTema.isChecked)
                "Modo Oscuro Activado 🌚"
            else
                "Modo Claro Activado 🌛"

            binding.textResultado.text = "$estudioMsg\n$heladoMsg\n$temaMsg"
        }

        // Listeners
        binding.checkBoxEstudio.setOnCheckedChangeListener { _, _ -> updateResult() }
        binding.radioGroupHelado.setOnCheckedChangeListener { _, _ -> updateResult() }
        binding.switchTema.setOnCheckedChangeListener { _, isChecked ->
            // Guardar la preferencia
            prefs.edit().putBoolean("dark_mode", isChecked).apply()
            // Aplicar colores al fragment
            applyTheme(isChecked)
            // Actualizar el resultado con todos los mensajes
            updateResult()
        }

        // 🔹 Mostrar resultado inicial
        updateResult()

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}