package com.example.crashactivity

import android.app.Application
import android.util.Log

class MyApplication : Application(){

    override fun onCreate(){
        super.onCreate()
        // Setup handler for uncaught exceptions.
        Thread.setDefaultUncaughtExceptionHandler(object : Thread.UncaughtExceptionHandler {
            override fun uncaughtException(t: Thread, e: Throwable) {
                Log.e("MyApplication",e.toString())
            }
        });
    }
}