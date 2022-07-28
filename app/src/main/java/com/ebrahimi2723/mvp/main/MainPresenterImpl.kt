package com.ebrahimi2723.mvp.main

class MainPresenterImpl(private val view: MainActivity):MainContract.MainPresenter{

    override fun handleLoginBtn() {
        view.showLoginView()

    }
}