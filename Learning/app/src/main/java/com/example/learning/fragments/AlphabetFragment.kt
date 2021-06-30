package com.example.learning.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.learning.R
import com.example.learning.adapters.AlphabetViewPagerAdapter
import com.example.learning.data.AlphabetData
import com.example.learning.databinding.FragmentAlphabetBinding


class AlphabetFragment : Fragment(R.layout.fragment_alphabet) {

    private lateinit var binding: FragmentAlphabetBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAlphabetBinding.bind(view)

        val alphabetList = listOf<AlphabetData>(
            AlphabetData(
                nameChar = 'A',
                image = R.drawable.alphabet_apple,
                alphabetNameString = arrayListOf(
                    "Apple",
                    "Axe",
                    "Ant"
                )
            ),
            AlphabetData(
                nameChar = 'B',
                image = R.drawable.alphabet_apple,
                alphabetNameString = arrayListOf(
                    "Bucket",
                    "Ball",
                    "Bus"
                )
            )
        )

        val adapter = AlphabetViewPagerAdapter(alphabetList)
        binding.viewpager.adapter = adapter
    }

}

