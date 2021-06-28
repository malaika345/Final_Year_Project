package com.example.learning.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.learning.R
import com.example.learning.databinding.FragmentLearnAndFunBinding


class LearnAndFun : Fragment(R.layout.fragment_learn_and_fun) {

    private lateinit var binding: FragmentLearnAndFunBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLearnAndFunBinding.bind(view)

        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_learnAndFun_to_learn)
        }
        binding.button3.setOnClickListener {
            //findNavController().navigate(R.id.action)
        }
    }
}