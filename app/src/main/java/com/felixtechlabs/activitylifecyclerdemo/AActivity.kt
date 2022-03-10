package com.felixtechlabs.activitylifecyclerdemo

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        Log.d("=======Activity-A::==", "onCreate Called")


        findViewById<Button>(R.id.btnOnClick).setOnClickListener {
            val mainIntent = Intent(this@AActivity, BActivity::class.java)
            this@AActivity.startActivity(mainIntent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("=======Activity-A::==", "onStart Called")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("=======Activity-A::==", "onRestart Called")

    }

    override fun onResume() {
        super.onResume()
        Log.d("=======Activity-A::==", "onResume Called")

    }

    override fun onPause() {
        super.onPause()
        Log.d("=======Activity-A::==", "onPause Called")

    }

    override fun onStop() {
        super.onStop()
        Log.d("=======Activity-A::==", "onStop Called")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("=======Activity-A::==", "onDestroy Called")

    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        // outState.putString("dummyString", "Hello there")

        Log.d("=======Activity-A::==", "onSaveInstanceState")

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("=======Activity-A::==", "onRestoreInstanceState")

        /*this method gets called when user rotate activity
        and we can get data return
         stores in saved instance state in key value pair*/

    }


    /**   These are the activity lifecycle callbacks we’ll be taking a look at:

    onCreate
    onStart
    onResume
    onSaveInstanceState
    onPause
    onStop
    onDestroy
    onRestoreInstanceState


    We’ll be having two activities: 1. ActivityA(MainActivity)  2. ActivityB and we’ll be exploring the following situations in the activity lifecycle.

    Starting ActivityA (on app launch)
    onCreate
    onStart
    onResume


    Starting ActivityB over ActivityA
    onPause – ActivityA
    onCreate – ActivityB
    onStart – ActivityB
    onResume – ActivityB
    onStop – ActivityA
    onSaveInstanceState – ActivityA


    Pressing back (returning) from ActivityB to ActivityA
    onPause – ActivityB
    onRestart – ActivityA
    onStart – ActivityA
    onResume – ActivityA
    onStop – ActivityB
    onDestroy – ActivityB


    Pressing back (exiting app) from ActivityA
    onPause – ActivityA
    onStop – ActivityA
    onDestroy – ActivityA

    Rotating phone in ActivityA (changing orientation)
    onPause – ActivityA
    onStop – ActivityA
    onSaveInstanceState – ActivityA
    onDestroy – ActivityA
    onCreate – ActivityA
    onStart – ActivityA
    onRestoreInstanceState – ActivityA
    onResume – ActivityA

    Pressing home button FROM Activity A
    onPause – ActivityA
    onStop – ActivityA
    onSaveInstanceState – ActivityA

    come back after pressing home button
    onRestart – ActivityA
    onStart – ActivityA
    onResume – ActivityA




     */


}