package com.example.mvppatterndemo.PresenterSignIn

import com.example.mvppatterndemo.ModelSignIn.User
import com.example.mvppatterndemo.ViewSignIn.ISignInView

@Suppress("UNREACHABLE_CODE")
class SignInPresenter(internal var iSignInView: ISignInView) : ISignInPresenter{
    override fun onSignIn(name: String, password: String) {
        TODO("Not yet implemented")

        val user = User(name, password)
        val isSignInSuccess = user.isValid()

        if (isSignInSuccess)
            iSignInView.SignInSuccess("good boy")
        else
            iSignInView.SignInFailure("so sad")
    }
}