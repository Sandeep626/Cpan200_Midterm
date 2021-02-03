package com.example.cpan200_midterm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        var btn: Button = findViewById(R.id.btnSign)
        btn.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this, "Clicked", 10).show()
            val intent2 = Intent(this, home::class.java).apply {
            }
            startActivity(intent2);
        })
    }
}