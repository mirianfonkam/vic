package com.sandyara.aula18

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

class SecondFragment : Fragment(R.layout.fragment_second){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Toast.makeText(requireActivity(), getString(R.string.warning_text), Toast.LENGTH_SHORT).show()
    }
}