package com.navigationarchitecture


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        linkSignUp.setOnClickListener {

            /*val name = enterName.text.toString()
            if (name.isEmpty()) {
                enterName.error = "Please enter a name"
            } else {*/
            val action = LoginFragmentDirections.toSignUpFragment()
            /*action.setNameToShow(name)*/
            findNavController().navigate(action)
            /*}*/
        }

        forgotPassword.setOnClickListener {
            findNavController().navigate(LoginFragmentDirections.ActionLoginFragmentToForgotPasswordFragment())
        }
    }
}
