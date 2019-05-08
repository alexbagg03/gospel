package com.abagg.gospel.scroll

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.abagg.gospel.R
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.fragment_scroll.view.*


class ScrollFragment: Fragment() {

    private var bottomSheetBehavior: BottomSheetBehavior<View>? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_scroll, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupBottomSheet(view)
    }

    private fun setupBottomSheet(rootView: View) {
        bottomSheetBehavior = BottomSheetBehavior.from(rootView.scroll_root)

        bottomSheetBehavior?.setBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(bottomSheet: View, slideOffset: Float) {}

            override fun onStateChanged(bottomSheet: View, state: Int) {}
        })
    }

}