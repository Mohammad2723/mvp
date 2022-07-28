package com.ebrahimi2723.mvp.main

interface MainContract {

    interface MainView {

       fun showLoginView()
    }

    interface MainPresenter {

        fun handleLoginBtn()

    }

}