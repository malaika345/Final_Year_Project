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
    private val context: Context

) : RecyclerView.Adapter<InnerAlphabetViewPagerAdapter.ViewPagerViewHolder>(),
    TextToSpeech.OnInitListener {
    class ViewPagerViewHolder(val binding: InnerAlphabetViewPagerBinding) :
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
            InnerAlphabetViewPagerBinding.inflate(
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
        val currentname = alphabetsNameList[position]
        holder.binding.txtTitle.text = currentname
        holder.binding.imgAlphabet.setImageResource(alphabetImageList[position])
        holder.binding.txtPagination.text = "${position+1} / ${alphabetsNameList.size}"
        speakOut(currentname)
    }

    override fun getItemCount() = alphabetsNameList.size

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
}





