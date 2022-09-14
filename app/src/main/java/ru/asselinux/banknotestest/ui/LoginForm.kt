package ru.asselinux.banknotestest.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ru.asselinux.banknotestest.R

class LoginForm : Fragment(R.layout.login_form) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val username = view.findViewById<EditText>(R.id.EditTestUsername)
        val password = view.findViewById<EditText>(R.id.EditTestPassword)
        val buttonSignIn = view.findViewById<Button>(R.id.ButtonSignIn)

        buttonSignIn.setOnClickListener {
            findNavController().navigate(R.id.action_LoginForm)
        }
    }
}