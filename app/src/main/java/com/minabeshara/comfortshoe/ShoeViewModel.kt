package com.minabeshara.comfortshoe

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.minabeshara.comfortshoe.models.Shoe

class ShoeViewModel : ViewModel() {

    val shoe = MutableLiveData<Shoe>()
    
    private val shoesList = ArrayList<Shoe?>()

    val shoes : LiveData<MutableList<Shoe?>>
    get() = _shoes

    private var _shoes = MutableLiveData<MutableList<Shoe?>>()

    init {
        shoe.value = Shoe("",0.0,"","")
        _shoes.value  = shoesList
    }

    fun addShoe(){
        shoesList.add(shoe.value)
        _shoes.value = shoesList
    }

}