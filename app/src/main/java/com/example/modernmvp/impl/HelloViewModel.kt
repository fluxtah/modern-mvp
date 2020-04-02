package com.example.modernmvp.impl

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.modernmvp.HelloModel

class HelloViewModel : ViewModel(), HelloModel {
    val greeting: MutableLiveData<String> = MutableLiveData()
    override fun loadGreeting() {
        greeting.value = greetings.random()
    }
}

private val greetings = listOf(
    "Hello", "Yo!", "Big up!", "Greetings!", "Hiya!"
)

