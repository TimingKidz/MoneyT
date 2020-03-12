package com.example.moneyt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_transaction_add.*
import android.app.DatePickerDialog
import android.os.Build
import android.widget.Button
import androidx.annotation.RequiresApi
import java.util.*

class TransactionAdd : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transaction_add)

        setSupportActionBar(transaction_add_toolbar)
        supportActionBar!!.setTitle("Add transaction")
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)

        // Switch to Calculator.kt page
        number_input.setOnClickListener {
            startActivity(Intent(this@TransactionAdd, Calculator::class.java))
        }

        // Switch to Categories.kt page
        categories_page.setOnClickListener {
            startActivity(Intent(this@TransactionAdd, Categories::class.java))
        }

        // DatePickerDialog
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)
        datepicker.setText("" + day + "/" + (month+1) + "/" + year)
        datepicker.setOnClickListener {
            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener{view, mYear, mMonth, mDay ->
                datepicker.setText("" + mDay + "/" + (mMonth+1) + "/" + mYear)
            }, year, month, day)
            dpd.show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_with_save_button, menu)
        return super.onCreateOptionsMenu(menu)
    }

    // Switch to MainActivity.kt page
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        overridePendingTransition(R.anim.nothing, R.anim.bottom_down) // Setting Transition
        return true
    }

    // Fragment
    private fun addFragment(fragment: Fragment){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }
}
