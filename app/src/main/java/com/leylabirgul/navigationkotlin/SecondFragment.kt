package com.leylabirgul.navigationkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation

class SecondFragment : Fragment() {

    private lateinit var button: Button
    private lateinit var textView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_secant, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button = view.findViewById(R.id.button2)
        textView = view.findViewById(R.id.textView2)

        arguments?.let {
            val userName = SecondFragmentArgs.fromBundle(it).username
            textView.text = userName
        }

        button.setOnClickListener {
            val action = SecondFragmentDirections.actionSecantToFirstFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }
}