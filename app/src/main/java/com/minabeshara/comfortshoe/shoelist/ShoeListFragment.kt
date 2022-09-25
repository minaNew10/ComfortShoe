package com.minabeshara.comfortshoe.shoelist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.minabeshara.comfortshoe.R
import com.minabeshara.comfortshoe.databinding.FragmentShoeListBinding
import com.minabeshara.comfortshoe.login.LoginFragmentDirections


class ShoeListFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding : FragmentShoeListBinding = DataBindingUtil.inflate(inflater,
                    R.layout.fragment_shoe_list,container,false)
        binding.floatingActionButton.setOnClickListener {
            navigateToDetailsScreen()
        }
        return binding.root
    }

    private fun navigateToDetailsScreen() {
        findNavController().navigate(ShoeListFragmentDirections.actionShoeListFragmentToShoeDetailFragment())
    }




}