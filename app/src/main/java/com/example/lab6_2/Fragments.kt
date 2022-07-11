package com.example.lab6_2

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.View
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.example.lab6_2.databinding.FragmentLayoutBinding

class MyDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireContext()).apply {
            setTitle("2071361")
            setMessage("송수진")
            setPositiveButton("OK") { dialog, id -> println("OK")}
        }.create()
    }
}

class HomeFragment : Fragment(R.layout.fragment_layout) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var binding = FragmentLayoutBinding.bind(view)
        binding.textView.text = "HomeFragment"
    }
}

class Page1Fragment : Fragment(R.layout.fragment_layout) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var binding = FragmentLayoutBinding.bind(view)
        binding.textView.text = "Page1Fragment"
    }
}

class Page2Fragment : Fragment(R.layout.fragment_layout) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var binding = FragmentLayoutBinding.bind(view)
        binding.textView.text = "Page2Fragment"
    }
}