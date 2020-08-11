package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.appcompat.widget.ListPopupWindow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val arrAdapter = ArrayAdapter<String>(
                this,
                R.layout.dropdown_menu_popup_item,
                listOf("hello", "world")
        )

        val listPopupWindow = ListPopupWindow(this).apply {
            anchorView = findViewById(R.id.textInputLayout)
            setAdapter(arrAdapter)
        }

        findViewById<Button>(R.id.button).setOnClickListener {
            listPopupWindow.show()
        }

    }

}