package com.synrgy.team2bundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.synrgy.team2bundle.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var activitySecondBinding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        activitySecondBinding = ActivitySecondBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(activitySecondBinding.root)

        val bundle = intent.extras

        activitySecondBinding.textSecondOutput.text = bundle!!.getString("anything", "Kamu belum menulis apapun")
    }
}