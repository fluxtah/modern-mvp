package com.example.modernmvp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders.of
import com.example.modernmvp.impl.HelloViewImpl
import com.example.modernmvp.impl.HelloViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var view: HelloView
    private lateinit var presenter: HelloPresenter
    private lateinit var model: HelloViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        model = of(this).get(HelloViewModel::class.java)
        view = HelloViewImpl(this)
        presenter = HelloPresenter(model, view)
        presenter.configure(lifecycle, model, view)
        presenter.onCreated(savedInstanceState == null)
    }
}
