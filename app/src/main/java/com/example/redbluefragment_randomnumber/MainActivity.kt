package com.example.redbluefragment_randomnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


// Need to figure out what size is the screen?
        // If smaller, less than 600dp, then use listener and swap fragments
            // Otherwise, nothing else is needed
        val deviceSmallestWidth = resources.configuration.smallestScreenWidthDp

        // Need to listen for RedFragment
        if (deviceSmallestWidth < 600) {
        supportFragmentManager.setFragmentResultListener(RANDOM_NUMBER_GENERATED, this)
            { requestKey, bundle ->
            // swap out red fragment for blue fragment
            supportFragmentManager.beginTransaction()
                .add(R.id.red_fragment_container, BlueFragment.newInstance(), "Blue")
                .addToBackStack("BLUE")
                .commit()
            }
        }
    }
}