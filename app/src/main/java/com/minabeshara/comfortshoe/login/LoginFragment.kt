package com.minabeshara.comfortshoe.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.minabeshara.comfortshoe.R
import com.minabeshara.comfortshoe.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentLoginBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.fragment_login, container, false)
        binding.apply {
            btnLogin.setOnClickListener {
                navigateToWelcomeScreen()
            }
            btnNewAacount.setOnClickListener {
                navigateToWelcomeScreen()
            }
        }
        return binding.root
    }

    override fun onResume() {
        super.onResume()
    }

    private fun navigateToWelcomeScreen(){
        findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeFragment())
    }
}