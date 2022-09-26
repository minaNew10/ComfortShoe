package com.minabeshara.comfortshoe.models

import android.os.Parcelable
import androidx.databinding.BaseObservable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Shoe(
    var name: String = "", var size: Double = 0.0, var company: String = "", var description: String = "",
) : Parcelable, BaseObservable()