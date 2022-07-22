package com.example.trythree.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.trythree.R
import com.example.trythree.databinding.FragmentEnterBinding
import com.example.trythree.main.main.MainFragment

class EnterFragment : Fragment() {

    private var _binding: FragmentEnterBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentEnterBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnEnter.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.container,MainFragment()).addToBackStack(null).commit()
        }
        binding.btnReg.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.container, RegistrationFragment()).addToBackStack(null).commit()
        }
    }
}