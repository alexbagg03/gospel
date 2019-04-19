package com.abagg.gospel.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abagg.gospel.GospelApplication
import com.abagg.gospel.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GospelApplication.component
                .mainActivitySubcomponentFactory
                .create(MainActivityModule())
    }

}
