package com.example.learning.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.speech.tts.TextToSpeech
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.learning.databinding.InnerAlphabetViewPagerBinding
import com.example.learning.databinding.InnerNumberViewPagerBinding
import java.util.*

class InnerNumberViewPagerAdapter(
    private val numberNameList: List<String>,
    private val numberImageList: List<Int>,
    private val context: Context

) : RecyclerView.Adapter<InnerNumberViewPagerAdapter.ViewPagerViewHolder>(),
    TextToSpeech.OnInitListener {
    class ViewPagerViewHolder(val binding: InnerNumberViewPagerBinding) :
        RecyclerView.ViewHolder(binding.root)

    private var tts: TextToSpeech? = null

    init {
        tts = TextToSpeech(context, this)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewPagerViewHolder {
        return ViewPagerViewHolder(
            InnerNumberViewPagerBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    @SuppressLint("LogNotTimber", "SetTextI18n")
    override fun onBindViewHolder(
        holder: InnerAlphabetViewPagerAdapter.ViewPagerViewHolder,
        position: Int
    ) {
        val currentname = numberNameList[position]
        holder.binding.txtTitle.text = currentname
        holder.binding.imgAlphabet.setImageResource(numberImageList[position])
        holder.binding.txtPagination.text = "${position + 1} / ${numberNameList.size}"
        speakOut(currentname)
    }

    override fun getItemCount() = numberNameList.size

    @SuppressLint("LogNotTimber")
    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            // set US English as language for tts
            val result = tts!!.setLanguage(Locale.US)

            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e("TTS", "The Language specified is not supported!")
            } else {

            }

        } else {
            Log.e("TTS", "Initilization Failed!")
        }
    }

    private fun speakOut(text: String) {
        tts!!.speak(text, TextToSpeech.QUEUE_FLUSH, null, "")
    }

//    override fun onBindViewHolder(
//        holder: InnerAlphabetViewPagerAdapter.ViewPagerViewHolder,
//                                    position: Int) {
//        val currentname = numberNameList[position]
//        holder.binding.txtTitle.text = currentname
//        holder.binding.imgAlphabet.setImageResource(numberImageList[position])
//        holder.binding.txtPagination.text = "${position + 1} / ${numberNameList.size}"
//        speakOut(currentname)
//    }
//
//    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
//        TODO("Not yet implemented")
//    }

}