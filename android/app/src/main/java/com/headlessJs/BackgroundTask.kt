package com.headlessJs

import android.content.Intent
import android.os.Bundle
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class BackgroundTask(private val reactContext: ReactApplicationContext) :
    ReactContextBaseJavaModule(reactContext) {
    override fun getName(): String {
        return "BackgroundTask"
    }

    @ReactMethod
    fun startService() {
        var service = Intent(reactContext, BackgroundTaskService::class.java)
        var extras = Bundle()
        service.putExtras(extras)

        reactContext.startService(service)
    }
}