package com.example.redbluefragment_randomnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Need to listen for RedFragment
        supportFragmentManager.setFragmentResultListener(RANDOM_NUMBER_GENERATED, this) {
                requestKey, bundle ->
            // swap out red fragment for blue fragment
//                supportFragmentManager.beginTransaction()
//                    .add(R.id.red_fragment_container, BlueFragment.newInstance())
//                    .addToBackStack("BLUE")
//                    .commit()
        }

        // 1. add: Pause the red fragment, and add the blue fragment "on top"

        // 2. replace: Replace the red fragment with the blue fragment <- red fragment is destroyed



    }
}