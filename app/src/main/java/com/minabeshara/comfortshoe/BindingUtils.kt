package com.minabeshara.comfortshoe

import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.databinding.InverseBindingAdapter

@BindingAdapter("app:text")
fun setDoubleInTextView(tv: TextView, dbl: Double?) {
    try {
        if (dbl == null && (tv.text.toString() == "" || tv.text.toString() == ".")) return
        val tvDbl = tv.text.toString().toDouble()
        if (tvDbl == dbl)
            return
        tv.text = dbl?.toString()

    } catch (nfe: java.lang.NumberFormatException) {
        tv.text = dbl?.toString() ?: ""
    }

}


@InverseBindingAdapter(attribute = "app:text", event = "android:textAttrChanged")
fun getDoubleFromTextView(editText: TextView): Double? {
    return try {
        editText.text.toString().toDouble()
    } catch (e: NumberFormatException) {
        0.0
    }
}