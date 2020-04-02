package com.example.modernmvp

class HelloPresenter(val model: HelloModel, val view: HelloView) {

    fun onCreated(init: Boolean) {
        // If this is the first time we loaded,
        // then load the first greeting
        if (init) {
            model.loadGreeting()
        }
    }

    fun onGreetingLoaded(greeting: String) {
        view.updateGreetingText(greeting)
    }

    fun onShowNewGreetingButtonPressed() {
        model.loadGreeting()
    }
}
