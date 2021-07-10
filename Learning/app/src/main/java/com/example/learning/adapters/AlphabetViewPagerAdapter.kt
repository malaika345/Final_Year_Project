package com.example.learning.adapters

import android.content.Context
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.learning.data.AlphabetData
import com.example.learning.databinding.AlphabetViewPagerBinding

class AlphabetViewPagerAdapter(
    private val list: List<AlphabetData>,
    private val context: Context
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
//
        val adapter=InnerAlphabetViewPagerAdapter(currentItem.alphabetNameString,currentItem.image,context = context)
        holder.binding.innerViewPager.adapter=adapter
    }

    override fun getItemCount() = list.size
}