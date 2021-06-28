package com.example.learning.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.learning.R
import com.example.learning.databinding.FragmentHomepageBinding


class Homepage : Fragment(R.layout.fragment_homepage) {
    private lateinit var binding: FragmentHomepageBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomepageBinding.bind(view)

        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_homepage_to_learnAndFun)
        }
    }
}