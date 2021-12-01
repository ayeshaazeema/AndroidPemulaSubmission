package com.ayeshaazeema.androidpemulasubmission.view.about

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ayeshaazeema.androidpemulasubmission.R
import com.ayeshaazeema.androidpemulasubmission.databinding.ActivityAboutBinding
import com.ayeshaazeema.androidpemulasubmission.view.home.MainActivity

class AboutActivity : AppCompatActivity() {

    private lateinit var aboutBinding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        supportActionBar?.hide()
    }
}