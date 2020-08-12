package com.example.mvppatterndemo.ViewSignIn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.example.mvppatterndemo.PresenterSignIn.SignInPresenter
import com.example.mvppatterndemo.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ISignInView {
    lateinit var signInPresenter: SignInPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signInPresenter = SignInPresenter(this)

        btn_signIn.setOnClickListener {
            val name = edt_name.text.toString()
            val password = edt_password.text.toString()

            if (TextUtils.isEmpty(name) || TextUtils.isEmpty(password)) {
                edt_name.setError("name???? password???")
                return@setOnClickListener
            }
            signInPresenter.onSignIn(name, password)

        }
    }

    override fun SignInFailure(message: String) {
        TODO("Not yet implemented")
        toast("toang")
    }

    override fun SignInSuccess(message: String) {
        TODO("Not yet implemented")
        toast("oke")
    }

    fun toast(str: String){
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show()
    }
}