package com.minabeshara.comfortshoe.shoedetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.minabeshara.comfortshoe.R
import com.minabeshara.comfortshoe.ShoeViewModel
import com.minabeshara.comfortshoe.databinding.FragmentShoeDetailBinding
import com.minabeshara.comfortshoe.models.Shoe
import com.minabeshara.comfortshoe.shoelist.ShoeListFragmentDirections


class ShoeDetailFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    private val viewModel : ShoeViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentShoeDetailBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.fragment_shoe_detail, container, false)

        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        binding.btnCancel.setOnClickListener {
            navigateToListScreen()
        }
        viewModel.navigateToShoeListFragment.observe(viewLifecycleOwner) {
            if (it == true) {
                navigateToListScreen()
                viewModel.doneNavigatingToShoeList()
            }
        }

        return binding.root
    }

    private fun navigateToListScreen() {
        findNavController().navigate(ShoeDetailFragmentDirections.actionShoeDetailFragmentToShoeListFragment())
    }


}