package com.kotlinparatodo.mymovies

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }

    suspend fun someFun() = withContext(Dispatchers.Default) {

    }
}