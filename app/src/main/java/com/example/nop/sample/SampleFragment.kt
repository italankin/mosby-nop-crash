package com.example.nop.sample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hannesdorfmann.mosby3.mvp.MvpFragment

class SampleFragment : MvpFragment<SampleView, SamplePresenter>(), SampleView {

    override fun onStart() {
        super.onStart()
        presenter.detachView() // detach view to make getView() return Proxy instance
        presenter.onSomeEvent()
    }

    override fun createPresenter(): SamplePresenter = SamplePresenter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return View(requireContext())
    }

    override fun doSomeStuff() = Unit
}
