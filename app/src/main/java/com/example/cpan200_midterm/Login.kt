package com.example.cpan200_midterm

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var sign: TextView = findViewById(R.id.txtSignUp)
        sign.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this, "Clicked", 10).show()
            sign.setTextColor(Color.RED);
            val intent1 = Intent(this, Signup::class.java).apply {
            }
            startActivity(intent1);
        })

        var btn: Button = findViewById(R.id.button)
        btn.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this, "Clicked", 10).show()
            val intent2 = Intent(this, home::class.java).apply {
            }
            startActivity(intent2);
        })
    }
}