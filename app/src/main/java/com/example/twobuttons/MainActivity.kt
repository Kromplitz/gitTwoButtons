package com.example.twobuttons

import android.app.Activity
import android.graphics.Insets.add
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : Activity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
        var res =0
        val addButton:Button = findViewById(R.id.addButton)
        addButton.setOnClickListener{

            Toast.makeText(this, "${res++}", Toast.LENGTH_SHORT).show()

        }
        val subButton:Button = findViewById(R.id.subButton)
        subButton.setOnClickListener{

            if (res<1){Toast.makeText(this, "Помилка", Toast.LENGTH_SHORT).show()
            }
            else {Toast.makeText(this, "${res--}", Toast.LENGTH_SHORT).show()}
        }

    }

}