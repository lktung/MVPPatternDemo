package com.example.mvppatterndemo.ModelSignIn


@Suppress("UNREACHABLE_CODE")
data class User(override val name: String,override val password: String) : IUser {
    override fun isValid(): Boolean {
        TODO("Not yet implemented")
        if (name == "tung" && password == "123456")
            return true
        else
            return false
    }
}