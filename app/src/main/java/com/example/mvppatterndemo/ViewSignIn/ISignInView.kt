package com.example.mvppatterndemo.ViewSignIn

interface ISignInView {
    fun SignInSuccess(message: String)
    fun SignInFailure(message: String)
}