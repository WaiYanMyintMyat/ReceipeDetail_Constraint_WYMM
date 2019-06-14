package com.wymm.constraintlayouttest.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.wymm.constraintlayouttest.fragments.BaseFragment

/**
 * Created by Wai Yan Myint Myat on 2019-05-29.
 */
class GeneralFragmentStatePagerAdapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm) {

    private val fragmentList: MutableList<BaseFragment> = ArrayList()
    private val titleList: MutableList<String> = ArrayList()

    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getCount(): Int {
        return titleList.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titleList[position]
    }

    fun addFragments(title: String, fragment: BaseFragment) {
        titleList.add(title)
        fragmentList.add(fragment)
        notifyDataSetChanged()
    }
}