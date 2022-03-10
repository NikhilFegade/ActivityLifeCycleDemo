package com.felixtechlabs.activitylifecyclerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class CActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        Log.d("=======Activity-C::==","onCreate Called")
    }


    override fun onStart() {
        super.onStart()
        Log.d("=======Activity-C::==","onStart Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("=======Activity-C::==","onRestart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("=======Activity-C::==","onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("=======Activity-C::==","onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("=======Activity-C::==","onStop Called")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("=======Activity-C::==","onDestroy Called")
    }


    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
       // outState.putString("dummyString", "Hello there")

        Log.d("=======Activity-C::==","onSaveInstanceState")

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("=======Activity-C::==","onRestoreInstanceState")

    }
}