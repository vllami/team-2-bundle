package com.synrgy.team2bundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.synrgy.team2bundle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(activityMainBinding.root)

        activityMainBinding.apply {
            buttonMainSend.setOnClickListener {
                val bundle = Bundle()

                bundle.putString("anything", edittextMainAnything.text.toString())

                Intent(this@MainActivity, SecondActivity::class.java).apply {
                    this.putExtras(bundle)
                    startActivity(this)
                }
            }
        }
    }
}