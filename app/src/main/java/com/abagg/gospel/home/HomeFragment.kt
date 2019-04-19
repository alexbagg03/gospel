package com.abagg.gospel.home


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.abagg.gospel.GospelApplication

import com.abagg.gospel.R

class HomeFragment : Fragment() {

    override fun onAttach(context: Context?) {
        super.onAttach(context)

        GospelApplication
                .component
                .homeSubcomponentFactory
                .create(HomeModule())
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

}
