package com.example.moneyt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Categories : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)

        supportActionBar!!.setTitle("Categories")
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
    }

    // Switch to MainActivity.kt page
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        overridePendingTransition(R.anim.nothing, R.anim.bottom_down) // Setting Transition
        return true
    }
}
