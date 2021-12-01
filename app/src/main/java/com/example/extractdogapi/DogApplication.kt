package com.example.extractdogapi

import android.app.Application
import com.example.extractdogapi.database.AppDatabase


//this one line is what we use to access our database
class DogApplication : Application() {
    val database: AppDatabase by lazy { AppDatabase.getDatabase(this)}

}