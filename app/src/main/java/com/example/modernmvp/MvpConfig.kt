package com.example.modernmvp

import androidx.lifecycle.Lifecycle
import com.example.modernmvp.impl.HelloViewModel

fun HelloPresenter.configure(lifecycle: Lifecycle, vm: HelloViewModel, view: HelloView) {
    // action flows
    view.onShowNewGreetingButtonPressed(::onShowNewGreetingButtonPressed)

    // data flows
    vm.greeting.observe({ lifecycle }, ::onGreetingLoaded)
}
