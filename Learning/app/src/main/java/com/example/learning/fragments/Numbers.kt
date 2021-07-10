package com.example.learning.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.learning.R
import com.example.learning.data.NumbersData
import com.example.learning.databinding.FragmentNumbersBinding


class Numbers : Fragment (R.layout.fragment_numbers) {
    private lateinit var binding: FragmentNumbersBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentNumbersBinding.bind(view)

        val numerals = listOf<NumbersData>(
            NumbersData(
                numericName = "1",
                numericNameString = "One",
                ),
            NumbersData(
                numericName = "2",
                numericNameString = "Two",
                ),
            NumbersData(
                numericName = "3",
                numericNameString = "Three",
            ),
            NumbersData(
                numericName = "4",
                numericNameString = "Four",
            ),
            NumbersData(
                numericName = "5",
                numericNameString = "Five",
            ),
            NumbersData(
                numericName = "6",
                numericNameString = "Six",
            ),
            NumbersData(
                numericName = "7",
                numericNameString = "Seven",
            ),
            NumbersData(
                numericName = "8",
                numericNameString = "Eight",
            ),
            NumbersData(
                numericName = "9",
                numericNameString = "Nine",
            ),
            NumbersData(
                numericName = "10",
                numericNameString = "Ten",
            ),
            )

    }

}