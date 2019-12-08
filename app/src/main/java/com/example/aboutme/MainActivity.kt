package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatViewInflater

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    public fun AddingNickName(view: View)
    {
        val nicknameEditText = findViewById<EditText>(R.id.id_nickname)
        val nicknameTextView = findViewById<TextView>(R.id.addNickName)

        nicknameTextView.text = nicknameEditText.text
        nicknameEditText.visibility = View.GONE
        view.visibility = View.GONE
        nicknameTextView.visibility = View.VISIBLE

        // Hide the Keyboard
        val inm = getSystemService(Context.INPUT_METHOD_SERVICE ) as InputMethodManager
        inm.hideSoftInputFromWindow(view.windowToken,0)

    }
}
