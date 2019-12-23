package com.orhan.comedchat_demo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.orhan.comedchat_demo.databinding.FragmentContactDetailBinding

class OneToOneFragment: Fragment() {

    lateinit var binding: FragmentContactDetailBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_contact_detail, container, false)

        return binding.root
    }
}