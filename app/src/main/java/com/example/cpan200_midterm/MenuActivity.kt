package com.example.cpan200_midterm

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)

        var homebtn: ImageButton = findViewById(R.id.imageButton3)
        homebtn.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this, "Clicked", 10).show()
            val intent1 = Intent(this, home::class.java).apply {
            }
            startActivity(intent1);
        })

        var add: ImageButton = findViewById(R.id.imageButton)
        add.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this, "Clicked", 10).show()
            val intent2 = Intent(this, com.example.cpan200_midterm.add::class.java).apply {
            }
            startActivity(intent2);
    })
}}