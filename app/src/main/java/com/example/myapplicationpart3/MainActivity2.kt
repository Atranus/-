package com.example.myapplicationpart3

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