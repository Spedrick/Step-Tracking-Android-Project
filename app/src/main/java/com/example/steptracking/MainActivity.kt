package com.example.steptracking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.example.steptracking.db.RunDAO
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    private lateinit var runDAO: RunDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("runDAO", "RUNDAO: ${runDAO.hashCode()}")
    }
}