package com.rsa.counterusingmvp.model

import com.rsa.counterusingmvp.contract.Contract

class CounterModel : Contract.Model {
    private var counter = 1
    override fun getCounter(): Int {
        return counter
    }

    override fun incrementCount() {
        counter++
    }

    override fun decrementCount() {
        if (counter > 1) {
            counter--
        }
    }

}