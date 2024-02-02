package com.kotlinparatodo.mymovies.android

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.kotlinparatodo.mymovies.Greeting

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()
    }

//    suspend fun fff() = suspendCoroutine<Int> {
//        withContext(Dispatchers.Default) {
//            for (i in 1..5) {
////                Log.d(TAG, "Inner code i : $i on Thread : " + Thread.currentThread().name);
//            }
//        }
//    }
}
