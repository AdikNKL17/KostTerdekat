package com.merapitech.adik.kostterdekat

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.setContentView

class MainActivity : AppCompatActivity() {

    lateinit var ui: MainUI

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = MainUI()
        ui.setContentView(this)
    }
}
