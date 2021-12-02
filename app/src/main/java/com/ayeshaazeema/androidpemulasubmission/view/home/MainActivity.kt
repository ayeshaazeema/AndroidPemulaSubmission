package com.ayeshaazeema.androidpemulasubmission.view.home

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.ayeshaazeema.androidpemulasubmission.R
import com.ayeshaazeema.androidpemulasubmission.data.adapter.PhoneAdapter
import kotlinx.android.synthetic.main.activity_main.*
import com.ayeshaazeema.androidpemulasubmission.data.model.DataPhone
import com.ayeshaazeema.androidpemulasubmission.data.model.Phone
import com.ayeshaazeema.androidpemulasubmission.databinding.ActivityMainBinding
import com.ayeshaazeema.androidpemulasubmission.view.about.AboutActivity
import com.ayeshaazeema.androidpemulasubmission.view.detail.DetailActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mainBinding: ActivityMainBinding

    private var list: ArrayList<Phone> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        supportActionBar?.hide()

        rvMain.setHasFixedSize(true)

        list.addAll(DataPhone.listPhone)
        mainBinding.fabMain.setOnClickListener(this)

        addRecyclerViewList()
    }

    private fun addRecyclerViewList() {
        val phoneAdapter = PhoneAdapter(list)
        mainBinding.rvMain.layoutManager = LinearLayoutManager(this)
        mainBinding.rvMain.adapter = phoneAdapter

        phoneAdapter.setOnClickCallback(object : PhoneAdapter.OnItemClickCallback {
            override fun onItemClicked(phone: Phone) {
                setSelectedItem(phone)
            }
        })
    }

    private fun setSelectedItem(phone: Phone) {
        val intentDetail = Intent(this@MainActivity, DetailActivity::class.java)
        intentDetail.putExtra(DetailActivity.EXTRA_USER, phone)
        startActivity(intentDetail)
    }

    companion object {
        fun getLaunchService(from: Context) =
            Intent(from, MainActivity::class.java).apply {
                addFlags(
                    Intent.FLAG_ACTIVITY_NEW_TASK
                            or Intent.FLAG_ACTIVITY_CLEAR_TASK
                )
            }
    }

    override fun onClick(p0: View) {
        when (p0.id) {
            R.id.fabMain -> startActivity(Intent(AboutActivity.getLaunchService(this)))
        }
    }
}