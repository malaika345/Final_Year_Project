package com.example.learning.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.learning.data.AlphabetData
import com.example.learning.databinding.AlphabetViewPagerBinding

class AlphabetViewPagerAdapter(
    private val list: List<AlphabetData>
): RecyclerView.Adapter<AlphabetViewPagerAdapter.ViewPagerViewHolder>() {

    inner class ViewPagerViewHolder(
        val binding: AlphabetViewPagerBinding
    ):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AlphabetViewPagerAdapter.ViewPagerViewHolder {
        return ViewPagerViewHolder(AlphabetViewPagerBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ))
    }

    override fun onBindViewHolder(
        holder: AlphabetViewPagerAdapter.ViewPagerViewHolder,
        position: Int
    ) {
        val currentItem = list[position]
        holder.binding.txtCapital.text = currentItem.nameChar.toString()
        holder.binding.txtSmall.text = currentItem.nameChar.lowercaseChar().toString()
        holder.binding.txtTitle.text = currentItem.alphabetNameString[0]
        holder.binding.imgAlphabet.setImageResource(currentItem.image)
    }

    override fun getItemCount() = list.size
}