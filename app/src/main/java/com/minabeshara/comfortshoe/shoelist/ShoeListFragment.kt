package com.minabeshara.comfortshoe.shoelist

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.minabeshara.comfortshoe.R
import com.minabeshara.comfortshoe.ShoeViewModel
import com.minabeshara.comfortshoe.databinding.FragmentShoeListBinding
import com.minabeshara.comfortshoe.databinding.ItemShoeBinding
import com.minabeshara.comfortshoe.login.LoginFragmentDirections


class ShoeListFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private val viewModel: ShoeViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentShoeListBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_shoe_list, container, false
        )
        binding.floatingActionButton.setOnClickListener {
            navigateToDetailsScreen()
        }
        viewModel.shoes.observe(viewLifecycleOwner, Observer {
            it.forEach { shoe ->
                Log.i("shoeViewModel", "onCreateView: $shoe")
                val shoeBinding: ItemShoeBinding = DataBindingUtil.inflate(
                    layoutInflater,
                    R.layout.item_shoe,
                    binding.listShoes,
                    false
                )
                shoeBinding.shoe = shoe
                binding.listShoes.addView(shoeBinding.root)
            }
        })
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.logout_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(
            item,
            requireView().findNavController()
        ) || super.onOptionsItemSelected(item)
    }

    private fun navigateToDetailsScreen() {
        findNavController().navigate(ShoeListFragmentDirections.actionShoeListFragmentToShoeDetailFragment())
    }


}