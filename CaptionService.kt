package com.example.livecaption

import android.app.Service
import android.content.Intent
import android.graphics.PixelFormat
import android.os.IBinder
import android.view.*
import android.widget.TextView

class CaptionService : Service() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        val wm = getSystemService(WINDOW_SERVICE) as WindowManager
        val textView = TextView(this).apply {
            text = "Listening for Japanese..."
            textSize = 16f
            setBackgroundColor(0xAA000000.toInt())
            setTextColor(0xFFFFFFFF.toInt())
            setPadding(20, 10, 20, 10)
        }

        val params = WindowManager.LayoutParams(
            WindowManager.LayoutParams.WRAP_CONTENT,
            WindowManager.LayoutParams.WRAP_CONTENT,
            WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY,
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
            PixelFormat.TRANSLUCENT
        )

        wm.addView(textView, params)

        return START_STICKY
    }

    override fun onBind(intent: Intent?): IBinder? = null
}
