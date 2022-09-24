package com.minabeshara.comfortshoe.welcome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.minabeshara.comfortshoe.R
import com.minabeshara.comfortshoe.databinding.FragmentWelcomeBinding
import com.minabeshara.comfortshoe.login.LoginFragmentDirections


class WelcomeFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding :FragmentWelcomeBinding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_welcome,container,false)
        binding.btnStart.setOnClickListener {
            navigateToInstructionsScreen()
        }
        return binding.root
    }

    override fun onResume() {
        super.onResume()
    }

    private fun navigateToInstructionsScreen(){
        findNavController().navigate(WelcomeFragmentDirections.actionWelcomeFragmentToInstructionsFragment())
    }
}