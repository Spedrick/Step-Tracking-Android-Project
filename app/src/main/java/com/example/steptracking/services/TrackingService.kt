package com.example.steptracking.services

import android.content.Intent
import androidx.lifecycle.LifecycleService
import com.example.steptracking.other.Constants.ACTION_PAUSE_SERVICE
import com.example.steptracking.other.Constants.ACTION_START_OR_RESUME_SERVICE
import com.example.steptracking.other.Constants.ACTION_STOP_SERVICE
import timber.log.Timber

class TrackingService : LifecycleService() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        intent?.let {
            when(it.action) {
                ACTION_START_OR_RESUME_SERVICE -> {
                    Timber.d("Started or resumed service")
                }
                ACTION_PAUSE_SERVICE -> {
                    Timber.d("Paused service")
                }
                ACTION_STOP_SERVICE -> {
                    Timber.d("Stopped service")
                }
            }
        }
        return super.onStartCommand(intent, flags, startId)
    }
}