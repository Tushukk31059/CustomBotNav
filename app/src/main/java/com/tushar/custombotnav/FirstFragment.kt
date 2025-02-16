package com.tushar.custombotnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tushar.custombotnav.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var fragmentFirstBinding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentFirstBinding=FragmentFirstBinding.inflate(inflater,container,false)
        return fragmentFirstBinding.root
    }

}