package com.ayeshaazeema.androidpemulasubmission.data.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ayeshaazeema.androidpemulasubmission.data.model.Phone
import com.ayeshaazeema.androidpemulasubmission.databinding.ItemPhoneBinding
import com.bumptech.glide.Glide

class PhoneAdapter(private val listPhone: ArrayList<Phone>) :
    RecyclerView.Adapter<PhoneAdapter.PhoneViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(phone: Phone)
    }

    inner class PhoneViewHolder(var phoneBinding: ItemPhoneBinding) :
        RecyclerView.ViewHolder(phoneBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhoneViewHolder {
        val phoneBinding =
            ItemPhoneBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PhoneViewHolder(phoneBinding)
    }

    override fun onBindViewHolder(holder: PhoneViewHolder, position: Int) {
        val phone = listPhone[position]

        Glide.with(holder.itemView.context).load(phone.image).into(holder.phoneBinding.ivItem)
        holder.phoneBinding.tvNameItem.text = phone.name
        holder.phoneBinding.tvPriceItem.text = phone.price
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listPhone[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int = listPhone.size
}