package com.example.heightconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var heightincm:EditText
    lateinit var button:Button
    lateinit var button2:Button
    lateinit var textview2:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        heightincm=findViewById(R.id.heightincm)
        button=findViewById(R.id.button)
        button2=findViewById(R.id.button2)
        textview2=findViewById(R.id.textView2)
        button.setOnClickListener(){
            var temp=heightincm.editableText.toString()
            var cm=temp.toDouble()
            var temp1=30.48
            var feet=Math.floor(cm/temp1)
            var incht= cm/2.54
            var inch=Math.round(incht-(feet*12))
            textview2.text="Height is $feet feet and $inch inches"
        }
        button2.setOnClickListener(){
            var temp=heightincm.editableText.toString()
            var metre1=temp.toDouble()
            var metre=metre1/100
            textview2.text="Height in metre is $metre"
        }
    }
}