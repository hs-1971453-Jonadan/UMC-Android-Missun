package com.example.flo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.flo.databinding.FragmentLockerBinding
import com.google.android.material.tabs.TabLayoutMediator

class LockerFragment : Fragment() {

    lateinit var binding: FragmentLockerBinding


        private val information= arrayListOf("저장한 곡","음악 파일")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLockerBinding.inflate(inflater, container, false)

        val lockerAdapter = LockerVPAdapter(this)
        binding.fragmentContentVp.adapter = lockerAdapter
        TabLayoutMediator(binding.fragmentLockerRestoreContentTb, binding.fragmentContentVp){
                tab, position ->
            tab.text = information[position]
        }.attach()


        return binding.root
    }
}