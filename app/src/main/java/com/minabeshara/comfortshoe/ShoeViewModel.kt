package com.minabeshara.comfortshoe

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.minabeshara.comfortshoe.models.Shoe

class ShoeViewModel : ViewModel() {

    val shoes : LiveData<List<Shoe>>
    get() = _shoes

    private var _shoes = MutableLiveData<List<Shoe>>()
}