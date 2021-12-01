package com.ayeshaazeema.androidpemulasubmission.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Phone(
    var name: String = "",
    var brand: String = "",
    var price: String = "",
    var description: String = "",
    var image: Int = 0
): Parcelable
