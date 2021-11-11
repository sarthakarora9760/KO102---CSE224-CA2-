package com.example.sarthak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast

class que2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_que2)

        val rb1=findViewById<RadioButton>(R.id.rb1);

        rb1.setOnClickListener(){
            Toast.makeText(this,""+rb1.text,Toast.LENGTH_SHORT).show();
        }

        val cb1=findViewById<CheckBox>(R.id.cb1);

        cb1.setOnClickListener(){
            if (cb1.isChecked){
                Toast.makeText(this,""+cb1.text,Toast.LENGTH_SHORT).show();
            }
        }

    }
}