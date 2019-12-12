package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.myapplication.MyService
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button: Button? = findViewById(R.id.button)
        button!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, MyService::class.java)
            startService(intent)
            Toast.makeText(this@MainActivity, "啟動SERVICE", Toast.LENGTH_LONG).show()
            finish()
        })
    }
}
