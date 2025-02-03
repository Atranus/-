package com.example.myapplicationpart3

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplicationpart3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(activityMainBinding.root)

        Log.i("MainActivity", "onCreate")

        activityMainBinding.textView.text = intent.getStringExtra("Activity 2")

        activityMainBinding.button.setOnClickListener {
            //Переход между экранами
            val intent = Intent(
                //Откуда
                this,
                //куда
                MainActivity2::class.java
            )
            //Передача сообщений
            intent.putExtra("Activity 1", activityMainBinding.editTextText.text.toString())
            //Запуск активности
            startActivity(intent)
            finish()
        }
    }
    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy")
    }
}