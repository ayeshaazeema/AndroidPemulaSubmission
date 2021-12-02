package com.ayeshaazeema.androidpemulasubmission.view.about

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ayeshaazeema.androidpemulasubmission.R
import com.ayeshaazeema.androidpemulasubmission.databinding.ActivityAboutBinding
import com.ayeshaazeema.androidpemulasubmission.view.home.MainActivity

class AboutActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var aboutBinding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        aboutBinding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(aboutBinding.root)
        aboutBinding.fabAbout.setOnClickListener(this)

        supportActionBar?.hide()
    }

    override fun onClick(p0: View) {
        when (p0.id) {
            R.id.fabAbout -> startActivity(Intent(MainActivity.getLaunchService(this)))
        }
    }

    companion object {
        fun getLaunchService(from: Context) =
            Intent(from, AboutActivity::class.java).apply {
                addFlags(
                    Intent.FLAG_ACTIVITY_NEW_TASK
                            or Intent.FLAG_ACTIVITY_CLEAR_TASK
                )
            }
    }
}