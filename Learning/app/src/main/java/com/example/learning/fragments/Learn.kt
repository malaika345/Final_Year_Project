package com.example.learning.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.learning.R
import com.example.learning.databinding.FragmentLearnBinding


class Learn : Fragment(R.layout.fragment_learn) {

    private lateinit var binding: FragmentLearnBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentLearnBinding.bind(view)

        binding.button4.setOnClickListener {
            findNavController().navigate(R.id.action_learn_to_alphabet)
        }
        binding.button5.setOnClickListener {
            findNavController().navigate(R.id.action_learn_to_numbers)
        }
    }

}