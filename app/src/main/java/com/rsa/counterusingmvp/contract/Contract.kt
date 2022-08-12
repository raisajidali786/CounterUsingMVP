package com.rsa.counterusingmvp.contract

interface Contract {
    interface View {
        fun updateUI()
    }

    interface Presenter {
        fun increment()
        fun decrement()
        fun getCounter(): String
    }

    interface Model {
        fun getCounter(): Int
        fun incrementCount()
        fun decrementCount()
    }
}