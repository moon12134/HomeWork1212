package com.example.myapplication

import android.app.Service
import android.content.Intent
import android.os.IBinder

import com.example.myapplication.Main2Activity

class MyService : Service() {
    override fun onCreate() {
        super.onCreate()
        Thread(Runnable {
            try {
                Thread.sleep(5000)

                val intent = Intent(this@MyService, Main2Activity::class.java)

                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                this@MyService.startActivity(intent)

            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
        }).start()

        stopSelf()
    }

    override fun onStartCommand(intent: Intent, flags: Int, StartId: Int): Int {
        super.onStartCommand(intent, flags, StartId)
        return Service.START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onBind(intent: Intent): IBinder? {
        // TODO: Return the communication channel to the service.
        throw UnsupportedOperationException("Not yet implemented")
    }
}