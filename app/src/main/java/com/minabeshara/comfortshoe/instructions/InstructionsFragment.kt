package com.minabeshara.comfortshoe.instructions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.minabeshara.comfortshoe.R
import com.minabeshara.comfortshoe.databinding.FragmentInstructionsBinding
import com.minabeshara.comfortshoe.login.LoginFragmentDirections


class InstructionsFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentInstructionsBinding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_instructions,container,false)
        binding.btnStart.setOnClickListener {
            navigateToShoeListFragment()
        }

        return binding.root
    }
    private fun navigateToShoeListFragment(){
        findNavController().navigate(InstructionsFragmentDirections.actionInstructionsFragmentToShoeListFragment())
    }

}