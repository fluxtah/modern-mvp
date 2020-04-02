package com.example.modernmvp.impl

import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.modernmvp.HelloView
import com.example.modernmvp.R

class HelloViewImpl(activity: AppCompatActivity) : HelloView {
    private val greetingTextView: TextView = activity.findViewById(R.id.greeting_text)
    private val newGreetingButton: Button = activity.findViewById(R.id.new_greeting_button)

    override fun updateGreetingText(greetingText: String) {
        greetingTextView.text = greetingText
    }

    override fun onShowNewGreetingButtonPressed(onPressed: () -> Unit) =
        newGreetingButton.setOnClickListener { onPressed() }
}
