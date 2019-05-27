package com.example.myapplication

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val typeface = Typeface.createFromAsset(assets, "impact_font.ttf")
        tv.typeface = typeface
        tv.text = "177865465465"
    }
}
