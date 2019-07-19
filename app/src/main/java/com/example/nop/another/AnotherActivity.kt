package com.example.nop.another

import android.os.Bundle
import com.example.nop.sample.SampleFragment
import com.hannesdorfmann.mosby3.mvp.MvpActivity

class AnotherActivity : MvpActivity<AnotherView, AnotherPresenter>(), AnotherView {

    override fun createPresenter() = AnotherPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.onCreate()
        supportFragmentManager.beginTransaction()
            .add(SampleFragment(), null)
            .commit()
    }

    override fun doStuff() = Unit
}
