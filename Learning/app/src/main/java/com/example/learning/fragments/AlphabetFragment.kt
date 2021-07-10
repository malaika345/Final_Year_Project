package com.example.learning.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.learning.R
import com.example.learning.R.drawable.apple1
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
                image = arrayListOf(R.drawable.apple1, R.drawable.axe1,R.drawable.almond1),


                alphabetNameString = arrayListOf(
                    "Apple",
                    "Axe",
                    "Almond"
                )
            ),
            AlphabetData(
                nameChar = 'B',
                image = arrayListOf(R.drawable.bag,R.drawable.ball1, R.drawable.banana),

                alphabetNameString = arrayListOf(
                    "Bag",
                    "Ball",
                    "Banana",
                )
            ),
            AlphabetData(
                nameChar = 'C',
                image = arrayListOf(R.drawable.cat, R.drawable.cow,R.drawable.carrot) ,
                alphabetNameString = arrayListOf(
                    "Cat",
                    "Cow",
                    "Carrot",
                )
            ),
            AlphabetData(
                nameChar = 'D',
                image = arrayListOf(R.drawable.dog,R.drawable.deer,R.drawable.door),
                alphabetNameString = arrayListOf(
                    "Dog",
                    "Deer",
                    "Door",
                )
            ),
            AlphabetData(
                nameChar = 'E',
                image = arrayListOf(R.drawable.ear,R.drawable.egg,R.drawable.elephant),
                alphabetNameString = arrayListOf(
                    "Ear",
                    "Egg",
                    "Elephant",
                )
            ),
            AlphabetData(
                nameChar = 'F',
                image = arrayListOf(R.drawable.fan,R.drawable.fish,R.drawable.finger),
                alphabetNameString = arrayListOf(
                    "Fan",
                    "Fish",
                    "Finger",
                )
            ),
            AlphabetData(
                nameChar = 'G',
                image = arrayListOf(R.drawable.gate, R.drawable.goat, R.drawable.grapes),
                alphabetNameString = arrayListOf(
                    "Gate",
                    "Goat",
                    "Grapes",
                )
            ),
            AlphabetData(
                nameChar = 'H',
                image = arrayListOf(R.drawable.hen,R.drawable.hammer,R.drawable.horse),
                alphabetNameString = arrayListOf(
                    "Hen",
                    "Hammer",
                    "Horse",
                )
            ),
            AlphabetData(
                nameChar = 'I',
                image = arrayListOf(R.drawable.igloo,R.drawable.ice,R.drawable.insect),
                alphabetNameString = arrayListOf(
                    "Igloo",
                    "Ice",
                    "Insect",
                )
            ),
            AlphabetData(
                nameChar = 'J',
                image = arrayListOf(R.drawable.jug,R.drawable.jacket, R.drawable.jar),
                alphabetNameString = arrayListOf(
                    "Jug",
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
                image = arrayListOf(R.drawable.mango,R.drawable.mouse,R.drawable.mike),
                alphabetNameString = arrayListOf(
                    "Mango",
                    "Mouse",
                    "Mike",
                )
            ),
            AlphabetData(
                nameChar = 'N',
                image = arrayListOf(R.drawable.nose, R.drawable.nest, R.drawable.nail),
                alphabetNameString = arrayListOf(
                    "Nose",
                    "Nest",
                    "Nail",
                )
            ),
            AlphabetData(
                nameChar = 'O',
                image = arrayListOf(R.drawable.orange, R.drawable.onion, R.drawable.owl),
                alphabetNameString = arrayListOf(
                    "Orange",
                    "Onion",
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
                image = arrayListOf(R.drawable.queen, R.drawable.question, R.drawable.quill),
                alphabetNameString = arrayListOf(
                    "Queen",
                    "Question",
                    "Quill",
                )
            ),
            AlphabetData(
                nameChar = 'R',
                image = arrayListOf(R.drawable.rabbit, R.drawable.rainbow, R.drawable.ring),
                alphabetNameString = arrayListOf(
                    "Rabbit",
                    "Rainbow",
                    "Ring",
                )
            ),
            AlphabetData(
                nameChar = 'S',
                image = arrayListOf(R.drawable.spoon, R.drawable.sparrow, R.drawable.star),
                alphabetNameString = arrayListOf(
                    "Spoon",
                    "Sparrow",
                    "Star",
                )
            ),
            AlphabetData(
                nameChar = 'T',
                image = arrayListOf( R.drawable.tree,R.drawable.ten, R.drawable.table1),
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
                image = arrayListOf(R.drawable.van, R.drawable.vegetable, R.drawable.violin),
                alphabetNameString = arrayListOf(
                    "Van",
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
                image = arrayListOf(R.drawable.xmaxtree, R.drawable.xrays,R.drawable.xylophone),
                alphabetNameString = arrayListOf(
                    "X-Max",
                    "X-Rays",
                    "Xylophone",
                )
            ),
            AlphabetData(
                nameChar = 'Y',
                image = arrayListOf(R.drawable.yellow, R.drawable.yoyo, R.drawable.yougurt),
                alphabetNameString = arrayListOf(
                    "Yellow",
                    "Yo-Yo",
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

        val adapter = AlphabetViewPagerAdapter(alphabetList,requireContext())
        binding.viewpager.adapter = adapter
    }

}

