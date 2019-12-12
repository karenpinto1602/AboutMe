package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatViewInflater
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
    }

    fun AddingNickName(view: View)
    {
        binding.apply {
            addNickName.text = binding.idNickname.text
            invalidateAll()
            idNickname.visibility = View.GONE
            idDone.visibility = View.GONE
            addNickName.visibility = View.VISIBLE
        }

        // Hide the Keyboard
        val inm = getSystemService(Context.INPUT_METHOD_SERVICE ) as InputMethodManager
        inm.hideSoftInputFromWindow(view.windowToken,0)

    }
}
