package com.example.nop.another

import com.hannesdorfmann.mosby3.mvp.MvpNullObjectBasePresenter

class AnotherPresenter : MvpNullObjectBasePresenter<AnotherView>() {

    internal fun onCreate() {
        // call getView() here to prevent R8 from inlining getView() method
        view.doStuff()
    }
}
