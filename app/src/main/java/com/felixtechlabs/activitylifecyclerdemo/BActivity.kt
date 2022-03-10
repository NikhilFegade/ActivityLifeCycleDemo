package com.felixtechlabs.activitylifecyclerdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button

class BActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        Log.d("=======Activity-B::==","onCreate Called")


        findViewById<Button>(R.id.btnOnClick).apply {
            setOnClickListener {
                val mainIntent = Intent(this@BActivity, CActivity::class.java)
                this@BActivity.startActivity(mainIntent)


            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("=======Activity-B::==","onStart Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("=======Activity-B::==","onRestart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("=======Activity-B::==","onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("=======Activity-B::==","onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("=======Activity-B::==","onStop Called")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("=======Activity-B::==","onDestroy Called")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
       // outState.putString("dummyString", "Hello there")

        Log.d("=======Activity-B::==","onSaveInstanceState")

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("=======Activity-B::==","onRestoreInstanceState")

    }

}