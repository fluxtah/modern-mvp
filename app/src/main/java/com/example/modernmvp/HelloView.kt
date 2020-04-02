package com.example.modernmvp

interface HelloView {
    fun updateGreetingText(greetingText: String)
    fun onShowNewGreetingButtonPressed(onPressed: () -> Unit)
}
