package com.example.changebutton_background

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//initlize varible

        var button_background : Int = 1

        var button_change = findViewById(R.id.button) as Button;

        button.setOnClickListener {

            if(button_background==2){
                button_change.setBackgroundResource(R.drawable.btn_center_gradient)
                button_background=1
            } else if(button_background==1){
                button_change.setBackgroundResource(R.drawable.btn_oval_gradient)
                button_background=2
            }
        }

    }
}
