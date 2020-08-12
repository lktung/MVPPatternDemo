package com.example.mvppatterndemo.ModelSignIn

interface IUser {
    val name: String
    val password: String
    fun isValid(): Boolean
}