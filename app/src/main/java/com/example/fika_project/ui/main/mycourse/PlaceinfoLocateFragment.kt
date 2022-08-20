package com.example.fika_project.ui.main.mycourse

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fika_project.databinding.FragmentPlaceinfoLocateBinding

class PlaceinfoLocateFragment: Fragment() {
    private var _binding: FragmentPlaceinfoLocateBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentPlaceinfoLocateBinding.inflate(inflater, container, false)

        initView()

        return binding.root
    }

    private fun initView() {

    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}