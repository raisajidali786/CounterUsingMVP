package com.rsa.counterusingmvp.presenter

import com.rsa.counterusingmvp.contract.Contract
import com.rsa.counterusingmvp.model.CounterModel

class CounterPresenter(_view: Contract.View) : Contract.Presenter {
    private val model = CounterModel()
    private var view: Contract.View = _view

    override fun increment() {
        model.incrementCount()
        view.updateUI()
    }

    override fun decrement() {
        model.decrementCount()
        view.updateUI()
    }

    override fun getCounter(): String {
        return model.getCounter().toString()
    }
}