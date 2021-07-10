package com.example.learning.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.ImageDecoder
import android.speech.tts.TextToSpeech
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.learning.Utils.TAG
import com.example.learning.databinding.AlphabetViewPagerBinding
import com.example.learning.databinding.InnerAlphabetViewPagerBinding
import org.w3c.dom.NameList
import java.util.*

class InnerAlphabetViewPagerAdapter(
    private val alphabetsNameList: List<String>,
    private val alphabetImageList: List<Int>,
    private val context:Context

): RecyclerView.Adapter<InnerAlphabetViewPagerAdapter.ViewPagerViewHolder>(),TextToSpeech.OnInitListener{
    class ViewPagerViewHolder(val binding:InnerAlphabetViewPagerBinding) :RecyclerView.ViewHolder(binding.root)
    private var tts: TextToSpeech? = null
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): InnerAlphabetViewPagerAdapter.ViewPagerViewHolder {
        return ViewPagerViewHolder(
            InnerAlphabetViewPagerBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ))

    }

    @SuppressLint("LogNotTimber")
    override fun onBindViewHolder(
        holder: InnerAlphabetViewPagerAdapter.ViewPagerViewHolder,

        position: Int
    ) {
        tts = TextToSpeech(context, this)
        val currentname=alphabetsNameList[position]
        Log.i(TAG,"${alphabetsNameList.size}")
        Log.i(TAG,"${alphabetImageList.size}")
        holder.binding.txtTitle.text = currentname
        holder.binding.imgAlphabet.setImageResource(alphabetImageList[position])
        textToSpeech(currentname)

    }

    override fun getItemCount()= alphabetsNameList.size

         override fun onInit(status: Int) {
            if(status == TextToSpeech.SUCCESS){
                val result = tts!!.setLanguage(Locale.US)

                if(result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED){
                    Log.i("check","The Language specified is not support")
                }
            }else{
                Log.i("check","Initilization Failed!")
            }
        }
    fun textToSpeech(text: String) {
        tts!!.speak(text, TextToSpeech.QUEUE_FLUSH, null,"")
    }
    }





