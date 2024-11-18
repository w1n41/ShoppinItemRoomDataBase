package com.example.shoppinitemroomdatabase

import android.app.Application
import com.example.shoppinitemroomdatabase.utils.Graph

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        Graph.provide(this)
    }
}