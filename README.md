# ActivityLifeCycleDemo
This Project is just to check different scenarios of Activity LifeCycle method


These are the activity lifecycle callbacks we’ll be taking a look at:

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

