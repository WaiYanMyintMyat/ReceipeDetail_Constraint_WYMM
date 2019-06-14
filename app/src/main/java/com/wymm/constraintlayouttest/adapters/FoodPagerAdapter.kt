package com.wymm.constraintlayouttest.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.wymm.constraintlayouttest.R

/**
 * Created by Wai Yan Myint Myat on 2019-06-14.
 */
class FoodPagerAdapter : PagerAdapter() {
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return (view==`object`)
    }

    override fun getCount(): Int {
        return 8
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val itemView = LayoutInflater.from(container.context).inflate(R.layout.view_item_food,container,false)
        container.addView(itemView)
        return itemView
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View?)
    }
}