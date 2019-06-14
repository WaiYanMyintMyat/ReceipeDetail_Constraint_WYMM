package com.wymm.constraintlayouttest.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wymm.constraintlayouttest.R

/**
 * Created by Wai Yan Myint Myat on 2019-06-14.
 */
class InfoFragment : BaseFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_info,container,false)
    }
}