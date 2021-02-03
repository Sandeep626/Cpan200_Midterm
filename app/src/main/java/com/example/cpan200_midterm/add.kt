package com.example.cpan200_midterm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView

class add : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        var enter: ImageButton = findViewById(R.id.imageButton7)
        enter.setOnClickListener(View.OnClickListener {
            finish();
        })

        var backbtn: ImageButton = findViewById(R.id.imageButton11)
        backbtn.setOnClickListener(View.OnClickListener {
            finish();
        })
    }
}