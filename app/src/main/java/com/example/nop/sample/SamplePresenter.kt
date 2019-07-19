package com.example.nop.sample

import com.hannesdorfmann.mosby3.mvp.MvpNullObjectBasePresenter

class SamplePresenter : MvpNullObjectBasePresenter<SampleView>() {

    fun onSomeEvent() {
        // will crash with exception:
        // java.lang.ClassCastException: $Proxy1 cannot be cast to SampleFragment
        view.doSomeStuff()
    }
}
