package com.rsa.counterusingmvp.view

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.rsa.counterusingmvp.R
import com.rsa.counterusingmvp.contract.Contract
import com.rsa.counterusingmvp.presenter.CounterPresenter

class MainActivity : AppCompatActivity(), Contract.View {
    private lateinit var btnIncrement: Button
    private lateinit var btnDecrement: Button
    private lateinit var counterValue: TextView

    private lateinit var presenter: CounterPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inIt()
        clickListener()
    }

    private fun clickListener() {
        btnIncrement.setOnClickListener {
            presenter.increment()
        }

        btnDecrement.setOnClickListener {
            presenter.decrement()
        }

    }

    private fun inIt() {
        btnIncrement = findViewById(R.id.btnIncrement)
        btnDecrement = findViewById(R.id.btnDecrement)
        counterValue = findViewById(R.id.coutnerValue)
        presenter = CounterPresenter(this)
    }

    override fun updateUI() {
        counterValue.text = presenter.getCounter()
    }
}