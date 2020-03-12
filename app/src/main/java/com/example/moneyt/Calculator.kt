package com.example.moneyt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_calculator.*
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_transaction_add.*


class Calculator : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        setSupportActionBar(calculator_toolbar)
        supportActionBar!!.setTitle("")
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)

        val btn_0 = findViewById<Button>(R.id.Num0)
        val btn_1 = findViewById<Button>(R.id.Num1)
        val btn_2 = findViewById<Button>(R.id.Num2)
        val btn_3 = findViewById<Button>(R.id.Num3)
        val btn_4 = findViewById<Button>(R.id.Num4)
        val btn_5 = findViewById<Button>(R.id.Num5)
        val btn_6 = findViewById<Button>(R.id.Num6)
        val btn_7 = findViewById<Button>(R.id.Num7)
        val btn_8 = findViewById<Button>(R.id.Num8)
        val btn_9 = findViewById<Button>(R.id.Num9)
        val btn_00 = findViewById<Button>(R.id.Num00)
        val btn_dot = findViewById<Button>(R.id.NumDot)

        val btn_plus = findViewById<Button>(R.id.Num_Plus)
        val btn_minus = findViewById<Button>(R.id.Num_Minus)
        val btn_divide = findViewById<Button>(R.id.Num_Divide)
        val btn_multiply = findViewById<Button>(R.id.Num_Multiply)
        val btn_percent = findViewById<Button>(R.id.Num_Percent)

        val btn_clear = findViewById<Button>(R.id.Num_Clear)
        val btn_back = findViewById<ImageButton>(R.id.Num_Back)
        val btn_equal = findViewById<Button>(R.id.Num_Equal)

        var value1: Float = 0F
        var value2: Float = 0F
        var sum: Float = 0F
        var mAddition: Boolean = false
        var mSubtract: Boolean = false
        var mMultiplication: Boolean = false
        var mDivision: Boolean = false
        var reAddition: Boolean = false
        var reSubtract: Boolean = false
        var reMultiplication: Boolean = false
        var reDivision: Boolean = false
        var num_display = findViewById<EditText>(R.id.Num_Display)
        var num_display_all = findViewById<TextView>(R.id.Num_Display_All)

        num_display.setEnabled(false)
        num_display.setClickable(false)

        btn_0.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                var str = num_display.text.toString()
                if(reAddition == true || reSubtract == true || reDivision == true || reMultiplication == true){
                    num_display.setText("")
                    str = "0"
                    reAddition = false
                    reSubtract = false
                    reDivision = false
                    reMultiplication = false
                }
                if (str == "0") {
                    num_display.setText("0")
                } else {
                    num_display.setText(str + "0")
                }
            }
        })

        btn_00.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                var str = num_display.text.toString()
                if(reAddition == true || reSubtract == true || reDivision == true || reMultiplication == true){
                    num_display.setText("")
                    str = "0"
                    reAddition = false
                    reSubtract = false
                    reDivision = false
                    reMultiplication = false
                }
                if (str == "0") {
                    num_display.setText("0")
                } else {
                    num_display.setText(str + "00")
                }
            }
        })

        btn_1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                var str = num_display.text.toString()
                if(reAddition == true || reSubtract == true || reDivision == true || reMultiplication == true){
                    num_display.setText("")
                    str = "0"
                    reAddition = false
                    reSubtract = false
                    reDivision = false
                    reMultiplication = false
                }
                if (str == "0") {
                    num_display.setText("1")
                } else {
                    num_display.setText(str + "1")
                }
            }
        })

        btn_2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                var str = num_display.text.toString()
                if(reAddition == true || reSubtract == true || reDivision == true || reMultiplication == true){
                    num_display.setText("")
                    str = "0"
                    reAddition = false
                    reSubtract = false
                    reDivision = false
                    reMultiplication = false
                }
                if (str == "0") {
                    num_display.setText("2")
                } else {
                    num_display.setText(str + "2")
                }
            }
        })

        btn_3.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                var str = num_display.text.toString()
                if(reAddition == true || reSubtract == true || reDivision == true || reMultiplication == true){
                    num_display.setText("")
                    str = "0"
                    reAddition = false
                    reSubtract = false
                    reDivision = false
                    reMultiplication = false
                }
                if (str == "0") {
                    num_display.setText("3")
                } else {
                    num_display.setText(str + "3")
                }
            }
        })

        btn_4.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                var str = num_display.text.toString()
                if(reAddition == true || reSubtract == true || reDivision == true || reMultiplication == true){
                    num_display.setText("")
                    str = "0"
                    reAddition = false
                    reSubtract = false
                    reDivision = false
                    reMultiplication = false
                }
                if (str == "0") {
                    num_display.setText("4")
                } else {
                    num_display.setText(str + "4")
                }
            }
        })

        btn_5.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                var str = num_display.text.toString()
                if(reAddition == true || reSubtract == true || reDivision == true || reMultiplication == true){
                    num_display.setText("")
                    str = "0"
                    reAddition = false
                    reSubtract = false
                    reDivision = false
                    reMultiplication = false
                }
                if (str == "0") {
                    num_display.setText("5")
                } else {
                    num_display.setText(str + "5")
                }
            }
        })

        btn_6.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                var str = num_display.text.toString()
                if(reAddition == true || reSubtract == true || reDivision == true || reMultiplication == true){
                    num_display.setText("")
                    str = "0"
                    reAddition = false
                    reSubtract = false
                    reDivision = false
                    reMultiplication = false
                }
                if (str == "0") {
                    num_display.setText("6")
                } else {
                    num_display.setText(str + "6")
                }
            }
        })

        btn_7.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                var str = num_display.text.toString()
                if(reAddition == true || reSubtract == true || reDivision == true || reMultiplication == true){
                    num_display.setText("")
                    str = "0"
                    reAddition = false
                    reSubtract = false
                    reDivision = false
                    reMultiplication = false
                }
                if (str == "0") {
                    num_display.setText("7")
                } else {
                    num_display.setText(str + "7")
                }
            }
        })

        btn_8.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                var str = num_display.text.toString()
                if(reAddition == true || reSubtract == true || reDivision == true || reMultiplication == true){
                    num_display.setText("")
                    str = "0"
                    reAddition = false
                    reSubtract = false
                    reDivision = false
                    reMultiplication = false
                }
                if (str == "0") {
                    num_display.setText("8")
                } else {
                    num_display.setText(str + "8")
                }
            }
        })

        btn_9.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                var str = num_display.text.toString()
                if(reAddition == true || reSubtract == true || reDivision == true || reMultiplication == true){
                    num_display.setText("")
                    str = "0"
                    reAddition = false
                    reSubtract = false
                    reDivision = false
                    reMultiplication = false
                }
                if (str == "0") {
                    num_display.setText("9")
                } else {
                    num_display.setText(str + "9")
                }
            }
        })

        btn_dot.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                var str = num_display.text.toString()
                if (str == "") {
                    num_display.setText("0.")
                } else if (str.contains(".")) {
                } else {
                    num_display.setText(str + ".")
                }
            }
        })

        // + button
        btn_plus.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                mAddition = true
                reAddition = true
                var strAll = num_display_all.text.toString()
                var str = num_display.text.toString()
                if(num_display_all.text.toString() != ""){
                    btn_equal.callOnClick()
                    num_display_all.setText(strAll + str + " + ")
                    mAddition = true
                }else{
                    num_display_all.setText(str + " + ")
                }
                value1 = num_display.text.toString().toFloat()
            }
        })

        // - button
        btn_minus.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                mSubtract = true
                reSubtract = true
                var strAll = num_display_all.text.toString()
                var str = num_display.text.toString()
                if(num_display_all.text.toString() != ""){
                    btn_equal.callOnClick()
                    num_display_all.setText(strAll + str + " - ")
                    mSubtract = true
                }else{
                    num_display_all.setText(str + " - ")
                }
                value1 = num_display.text.toString().toFloat()
            }
        })

        // ÷ button
        btn_divide.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                mDivision = true
                reDivision = true
                var strAll = num_display_all.text.toString()
                var str = num_display.text.toString()
                if(num_display_all.text.toString() != ""){
                    btn_equal.callOnClick()
                    num_display_all.setText(strAll + str + " ÷ ")
                    mDivision = true
                }else{
                    num_display_all.setText(str + " ÷ ")
                }
                value1 = num_display.text.toString().toFloat()
            }
        })

        // × button
        btn_multiply.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                mMultiplication = true
                reMultiplication = true
                var strAll = num_display_all.text.toString()
                var str = num_display.text.toString()
                if(num_display_all.text.toString() != ""){
                    btn_equal.callOnClick()
                    num_display_all.setText(strAll + str + " × ")
                    mMultiplication = true
                }else{
                    num_display_all.setText(str + " × ")
                }
                value1 = num_display.text.toString().toFloat()
            }
        })

        // % button
        btn_percent.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                var str = num_display.text.toString()
                var per = str.toFloat()
                sum = (value1 * per) / 100
                num_display.setText(sum.toString())
            }
        })

        btn_equal.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                value2 = num_display.text.toString().toFloat()
                if(mAddition == true){
                    sum = value1 + value2
                    num_display.setText(sum.toString())
                    num_display_all.setText("")
                    mAddition = false
                }else if(mSubtract == true){
                    sum = value1 - value2
                    num_display.setText(sum.toString())
                    num_display_all.setText("")
                    mSubtract = false
                }else if(mDivision == true){
                    sum = value1 / value2
                    num_display.setText(sum.toString())
                    num_display_all.setText("")
                    mDivision = false
                }else if(mMultiplication == true){
                    sum = value1 * value2
                    num_display.setText(sum.toString())
                    num_display_all.setText("")
                    mMultiplication = false
                }
            }
        })

        btn_clear.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                num_display.setText("0")
                num_display_all.setText("")
            }
        })

        btn_back.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                var str = num_display.text.toString()
                if (str.length > 1) {
                    str = str.substring(0, str.length - 1)
                    num_display.setText(str)
                } else if (str.length <= 1) {
                    num_display.setText("0")
                }
            }
        })

        btn_back.setOnLongClickListener(object : View.OnLongClickListener {
            override fun onLongClick(v: View) : Boolean {
                num_display.setText("0")
                return true
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_with_done_button, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        overridePendingTransition(R.anim.nothing, R.anim.bottom_down) // Setting Transition
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.getItemId()
        var num_display = findViewById<EditText>(R.id.Num_Display)

        if (id == R.id.trans_save) {
            onBackPressed()
            overridePendingTransition(R.anim.nothing, R.anim.bottom_down) // Setting Transition
        }
        return super.onOptionsItemSelected(item)
    }

}
