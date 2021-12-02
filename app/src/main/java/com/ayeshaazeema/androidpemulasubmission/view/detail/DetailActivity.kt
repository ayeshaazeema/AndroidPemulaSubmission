package com.ayeshaazeema.androidpemulasubmission.view.detail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ayeshaazeema.androidpemulasubmission.R
import com.ayeshaazeema.androidpemulasubmission.data.model.Phone
import com.ayeshaazeema.androidpemulasubmission.databinding.ActivityDetailBinding
import com.ayeshaazeema.androidpemulasubmission.view.home.MainActivity
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var detailBinding: ActivityDetailBinding
    private lateinit var phone: Phone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(detailBinding.root)

        supportActionBar?.hide()

        phone = intent.getParcelableExtra<Phone>(EXTRA_USER) as Phone
        detailBinding.fabDetail.setOnClickListener(this)
        showDetail()
    }

    private fun showDetail() {
        detailBinding.apply {
            Glide.with(this.root).load(phone.image).into(ivDetail)
            tvNameDetail.text = phone.name
            tvBrandDetail.text = phone.brand
            tvPriceDetail.text = phone.price
            tvDescriptionDetail.text = phone.description
        }
    }

    companion object {
        const val EXTRA_USER = "extra_user"
    }

    override fun onClick(p0: View) {
        when (p0.id) {
            R.id.fabDetail -> startActivity(Intent(MainActivity.getLaunchService(this)))
        }
    }
}