package com.example.learning.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.example.learning.R
import com.example.learning.adapters.AlphabetViewPagerAdapter
import com.example.learning.data.AlphabetData
import com.example.learning.databinding.FragmentAlphabetBinding
import kotlin.math.abs


class AlphabetFragment : Fragment(R.layout.fragment_alphabet) {

    private lateinit var binding: FragmentAlphabetBinding

    @SuppressLint("LogNotTimber")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAlphabetBinding.bind(view)


        val alphabetList = listOf<AlphabetData>(
            AlphabetData(
                nameChar = 'A',
                image = arrayListOf(R.drawable.apple, R.drawable.ant,R.drawable.almond),


                alphabetNameString = arrayListOf(
                    "Apple",
                    "Ant",
                    "Almond"
                )
            ),
            AlphabetData(
                nameChar = 'B',
                image = arrayListOf(R.drawable.bag,R.drawable.ball, R.drawable.banana),

                alphabetNameString = arrayListOf(
                    "Bag",
                    "Ball",
                    "Banana",
                )
            ),
            AlphabetData(
                nameChar = 'C',
                image = arrayListOf(R.drawable.cat1, R.drawable.cow,R.drawable.carrot) ,
                alphabetNameString = arrayListOf(
                    "Cat",
                    "Cow",
                    "Carrot",
                )
            ),
            AlphabetData(
                nameChar = 'D',
                image = arrayListOf(R.drawable.dog,R.drawable.drum,R.drawable.door1),
                alphabetNameString = arrayListOf(
                    "Dog",
                    "Drum",
                    "Door",
                )
            ),
            AlphabetData(
                nameChar = 'E',
                image = arrayListOf(R.drawable.ear2,R.drawable.egg1,R.drawable.elephant1),
                alphabetNameString = arrayListOf(
                    "Ear",
                    "Egg",
                    "Elephant",
                )
            ),
            AlphabetData(
                nameChar = 'F',
                image = arrayListOf(R.drawable.fan1,R.drawable.fish1,R.drawable.flower),
                alphabetNameString = arrayListOf(
                    "Fan",
                    "Fish",
                    "Flower",
                )
            ),
            AlphabetData(
                nameChar = 'G',
                image = arrayListOf(R.drawable.gate1, R.drawable.giraffe, R.drawable.grapes),
                alphabetNameString = arrayListOf(
                    "Gate",
                    "Giraffe",
                    "Grapes",
                )
            ),
            AlphabetData(
                nameChar = 'H',
                image = arrayListOf(R.drawable.hat,R.drawable.hammer1,R.drawable.horse1),
                alphabetNameString = arrayListOf(
                    "Hat",
                    "Hammer",
                    "Horse",
                )
            ),
            AlphabetData(
                nameChar = 'I',
                image = arrayListOf(R.drawable.igloo1,R.drawable.ice1,R.drawable.ink),
                alphabetNameString = arrayListOf(
                    "Igloo",
                    "Ice",
                    "Ink",
                )
            ),
            AlphabetData(
                nameChar = 'J',
                image = arrayListOf(R.drawable.jeep,R.drawable.jacket1, R.drawable.jar),
                alphabetNameString = arrayListOf(
                    "Jeep",
                    "Jacket",
                    "Jar",
                )
            ),
            AlphabetData(
                nameChar = 'K',
                image = arrayListOf( R.drawable.key, R.drawable.kite, R.drawable.kiwi),
                alphabetNameString = arrayListOf(
                    "key",
                    "Kite",
                    "kiwi",
                )
            ),
            AlphabetData(
                nameChar = 'L',
                image = arrayListOf(R.drawable.ladder,R.drawable.lamp, R.drawable.lion),
                alphabetNameString = arrayListOf(
                    "Ladder",
                    "lamp",
                    "Lion",
                )
            ),
            AlphabetData(
                nameChar = 'M',
                image = arrayListOf(R.drawable.mango,R.drawable.mat,R.drawable.mike),
                alphabetNameString = arrayListOf(
                    "Mango",
                    "Mat",
                    "Mike",
                )
            ),
            AlphabetData(
                nameChar = 'N',
                image = arrayListOf(R.drawable.net, R.drawable.nest, R.drawable.nine),
                alphabetNameString = arrayListOf(
                    "Net",
                    "Nest",
                    "Nine",
                )
            ),
            AlphabetData(
                nameChar = 'O',
                image = arrayListOf(R.drawable.orange, R.drawable.octopus, R.drawable.owl),
                alphabetNameString = arrayListOf(
                    "Orange",
                    "Octopus",
                    "Owl",
                )
            ),
            AlphabetData(
                nameChar = 'P',
                image = arrayListOf(R.drawable.panda, R.drawable.parrot, R.drawable.peanut),
                alphabetNameString = arrayListOf(
                    "Panda",
                    "Parrot",
                    "Peanut",
                )
            ),
            AlphabetData(
                nameChar = 'Q',
                image = arrayListOf(R.drawable.queen, R.drawable.question, R.drawable.quail),
                alphabetNameString = arrayListOf(
                    "Queen",
                    "Question",
                    "Quail",
                )
            ),
            AlphabetData(
                nameChar = 'R',
                image = arrayListOf(R.drawable.rabbit, R.drawable.rose, R.drawable.ring),
                alphabetNameString = arrayListOf(
                    "Rabbit",
                    "Rose",
                    "Ring",
                )
            ),
            AlphabetData(
                nameChar = 'S',
                image = arrayListOf(R.drawable.snail, R.drawable.sparrow, R.drawable.star),
                alphabetNameString = arrayListOf(
                    "Snail",
                    "Sparrow",
                    "Star",
                )
            ),
            AlphabetData(
                nameChar = 'T',
                image = arrayListOf( R.drawable.tree,R.drawable.ten, R.drawable.table),
                alphabetNameString = arrayListOf(
                    "Tree",
                    "Ten",
                    "Table",
                )
            ),
            AlphabetData(
                nameChar = 'U',
                image = arrayListOf(R.drawable.unicorn,R.drawable.unzip, R.drawable.umbrella),
                alphabetNameString = arrayListOf(
                    "Unicorn",
                    "Unzip",
                    "Umbrella",
                )
            ),
            AlphabetData(
                nameChar = 'V',
                image = arrayListOf(R.drawable.vase, R.drawable.vegetable, R.drawable.violin),
                alphabetNameString = arrayListOf(
                    "Vase",
                    "Vegetable",
                    "Violin",
                )
            ),
            AlphabetData(
                nameChar = 'W',
                image = arrayListOf (R.drawable.watch, R.drawable.whale, R.drawable.whistle),
                alphabetNameString = arrayListOf(
                    "Watch",
                    "Whale",
                    "Whistle",
                )
            ),
            AlphabetData(
                nameChar = 'X',
                image = arrayListOf(R.drawable.xmaxtree, R.drawable.xray,R.drawable.xylophone),
                alphabetNameString = arrayListOf(
                    "X-Max",
                    "X-Rays",
                    "Xylophone",
                )
            ),
            AlphabetData(
                nameChar = 'Y',
                image = arrayListOf(R.drawable.yellow, R.drawable.yarn, R.drawable.yougurt),
                alphabetNameString = arrayListOf(
                    "Yellow",
                    "Yarn",
                    "Yougurt",
                )
            ),
            AlphabetData(
                nameChar = 'Z',
                image = arrayListOf(R.drawable.zebra,R.drawable.zero, R.drawable.zoo),
                alphabetNameString = arrayListOf(
                    "Zebra",
                    "Zero",
                    "Zoo",
                )
            ),
            )
        binding.viewpager.isUserInputEnabled = false
        val adapter = AlphabetViewPagerAdapter(alphabetList,requireContext())
        binding.viewpager.adapter = adapter
        binding.btnBack.setOnClickListener {
            binding.viewpager.currentItem = getNextPossibleItemIndex(-1)
        }
        binding.btnNext.setOnClickListener {
            binding.viewpager.currentItem = getNextPossibleItemIndex(1)
        }
    }
    private fun getNextPossibleItemIndex(change: Int): Int {
        val currentIndex: Int = binding.viewpager.currentItem
        val total: Int? = binding.viewpager.adapter?.itemCount
        return if (currentIndex + change < 0) {
            0
        } else abs((currentIndex + change) % total!!)
    }
}

