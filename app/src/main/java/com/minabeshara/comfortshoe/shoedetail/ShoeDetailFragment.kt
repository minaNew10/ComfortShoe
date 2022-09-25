package com.minabeshara.comfortshoe.shoedetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.minabeshara.comfortshoe.R
import com.minabeshara.comfortshoe.databinding.FragmentShoeDetailBinding
import com.minabeshara.comfortshoe.shoelist.ShoeListFragmentDirections


class ShoeDetailFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentShoeDetailBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.fragment_shoe_detail, container, false)
        binding.btnCancel.setOnClickListener {
            navigateToListScreen()
        }
        return binding.root
    }

    private fun navigateToListScreen() {
        findNavController().navigate(ShoeDetailFragmentDirections.actionShoeDetailFragmentToShoeListFragment())
    }


}