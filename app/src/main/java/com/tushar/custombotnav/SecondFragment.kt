package com.tushar.custombotnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tushar.custombotnav.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
        private lateinit var fragmentSecondBinding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        fragmentSecondBinding=FragmentSecondBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return fragmentSecondBinding.root
    }

}