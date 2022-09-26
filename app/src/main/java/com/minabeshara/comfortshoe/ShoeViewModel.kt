package com.minabeshara.comfortshoe

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.minabeshara.comfortshoe.models.Shoe

class ShoeViewModel : ViewModel() {

    var shoe = Shoe()

    private val shoesList = ArrayList<Shoe?>()

    private var _shoes = MutableLiveData<MutableList<Shoe?>>()

    val shoes : LiveData<MutableList<Shoe?>>
        get() = _shoes

    private var _navigateToShoeListFragment = MutableLiveData<Boolean>()

    val navigateToShoeListFragment : LiveData<Boolean>
        get() = _navigateToShoeListFragment


    fun addShoe(){
        Log.i("shoeViewModel", "addShoe: called before adding ShoesList ${shoesList.joinToString()}  shoe : $shoe")
        shoesList.add(shoe)
        shoe = Shoe()
        Log.i("shoeViewModel", "addShoe: called after adding ${shoesList.joinToString()}")
        _shoes.value = shoesList

        _navigateToShoeListFragment.value = true
        Log.i("shoeViewModel", "addShoe: ${shoesList.joinToString()} ")
    }

    fun doneNavigatingToShoeList(){
        _navigateToShoeListFragment.value = false
    }

}