package com.leylabirgul.navigationkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class FirstFragment : Fragment() {

    private lateinit var button1: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button1 = view.findViewById(R.id.button1)

        button1.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecant("Ibrahim Can")
            Navigation.findNavController(it).navigate(action)
        }
    }
}