package com.ebrahimi2723.mvp.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.ebrahimi2723.mvp.R
import com.ebrahimi2723.mvp.databinding.ActivityMainBinding
import com.ebrahimi2723.mvp.login.LoginActivity

class MainActivity : AppCompatActivity(),MainContract.MainView {
    private lateinit var  presenter:MainContract.MainPresenter

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }
    private fun init(){
        presenter = MainPresenterImpl(this)
        binding.btnLogin.setOnClickListener {
            presenter.handleLoginBtn()
        }
    }

    override fun showLoginView() {
        startActivity(Intent(this,LoginActivity::class.java))
    }
}