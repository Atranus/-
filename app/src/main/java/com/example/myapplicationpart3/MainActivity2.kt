package com.example.myapplicationpart3

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplicationpart3.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var activityMain2Binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        activityMain2Binding = ActivityMain2Binding.inflate(layoutInflater)

        setContentView(activityMain2Binding.root)

        Log.i("MainActivity2", "onCreate")

        activityMain2Binding.textView.text = intent.getStringExtra("Activity 1")

        activityMain2Binding.button.setOnClickListener {
            //Переход между экранами
            val intent = Intent(
                //Откуда
                this,
                //куда
                MainActivity::class.java
            )
            intent.putExtra("Activity 2", activityMain2Binding.editTextText.text.toString())
            //Запуск активности
            startActivity(intent)
            //уничтожение активности
            finish()
        }
    }
    override fun onPause() {
        super.onPause()
        Log.i("MainActivity2", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity2", "onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity2", "onDestroy")
    }
}