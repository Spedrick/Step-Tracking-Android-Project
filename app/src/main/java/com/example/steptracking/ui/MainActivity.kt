package com.example.steptracking.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.example.steptracking.R
import com.example.steptracking.db.RunDAO
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var runDAO: RunDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("runDao", "RUNDAO: ${runDAO.hashCode()}")
        val button : Button = findViewById(R.id.button)

        button.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_LONG).show()
        }
    }
}