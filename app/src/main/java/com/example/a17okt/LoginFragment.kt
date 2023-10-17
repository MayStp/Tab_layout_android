package com.example.a17okt

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_login, container, false)

        val usernameEditText = rootView.findViewById<EditText>(R.id.input_username)
        val passwordEditText = rootView.findViewById<EditText>(R.id.input_pass)
        val loginButton = rootView.findViewById<Button>(R.id.btnlogin)

        loginButton.setOnClickListener {
            Log.d("LoginFragment", "Button Clicked")
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()
            val intent = Intent(activity, hero::class.java)
            intent.putExtra("username", username)
            intent.putExtra("password", password)
            startActivity(intent)
            // Inflate the layout for this fragment

        }

        return rootView
    }

}