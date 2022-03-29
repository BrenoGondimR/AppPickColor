package com.example.apppickcolor

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.SeekBar


class MainActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {

    private lateinit var mShowColor: View
    private lateinit var mPickColor1: SeekBar
    private lateinit var mPickColor2: SeekBar
    private lateinit var mPickColor3: SeekBar

    private var red = 0
    private var green = 0
    private var blue = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mShowColor = findViewById(R.id.main_view_color)
        mPickColor1 = findViewById(R.id.main_seekBar_R)
        mPickColor2 = findViewById(R.id.main_seekbar_G)
        mPickColor3 = findViewById(R.id.main_seekbar_B)

        mPickColor1.setOnSeekBarChangeListener(this)
        mPickColor2.setOnSeekBarChangeListener(this)
        mPickColor3.setOnSeekBarChangeListener(this)


    }

    override fun onProgressChanged(seekbar: SeekBar?, progresso: Int, p2: Boolean) {
        when(seekbar?.id){
            R.id.main_seekBar_R -> red = progresso
            R.id.main_seekbar_G -> green = progresso
            R.id.main_seekbar_B -> blue = progresso
        }
        mShowColor.setBackgroundColor(Color.rgb(red, green, blue))
    }

    override fun onStartTrackingTouch(p0: SeekBar?) {
        Log.i("App", "Clikou na seekbar")
    }

    override fun onStopTrackingTouch(p0: SeekBar?) {
        Log.i("App", "Soltou a seekbar")
    }


}