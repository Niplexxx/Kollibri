package com.example.lotlinmessenger.ui.screens.base_fragment

import androidx.fragment.app.Fragment
import com.example.lotlinmessenger.utillits.APP_ACTIVITY

open class BaseFragment( layout:Int) : Fragment(layout) {
    override fun onStart() {
        super.onStart()
        APP_ACTIVITY.mAppDrawer.disableDrawer()
    }
}