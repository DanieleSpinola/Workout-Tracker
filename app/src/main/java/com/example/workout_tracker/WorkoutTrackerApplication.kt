package com.example.workout_tracker

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class WorkoutTrackerApplication : Application(){
    override fun onCreate() {
        super.onCreate()

    }
}