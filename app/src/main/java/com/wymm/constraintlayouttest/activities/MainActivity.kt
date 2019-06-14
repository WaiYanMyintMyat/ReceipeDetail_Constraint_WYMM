package com.wymm.constraintlayouttest.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity;
import com.wymm.constraintlayouttest.R
import com.wymm.constraintlayouttest.adapters.FoodPagerAdapter
import com.wymm.constraintlayouttest.adapters.GeneralFragmentStatePagerAdapter
import com.wymm.constraintlayouttest.fragments.InfoFragment
import com.wymm.constraintlayouttest.fragments.MaterialFragment
import com.wymm.constraintlayouttest.fragments.VideoFragment

import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    private val mFoodPagerAdapter = FoodPagerAdapter()
    private lateinit var generalFragmentStatePagerAdapter: GeneralFragmentStatePagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPagerHead.adapter = mFoodPagerAdapter

        generalFragmentStatePagerAdapter = GeneralFragmentStatePagerAdapter(supportFragmentManager)
        generalFragmentStatePagerAdapter.addFragments("Info", InfoFragment())
        generalFragmentStatePagerAdapter.addFragments("Material & Doing", MaterialFragment())
        generalFragmentStatePagerAdapter.addFragments("Video", VideoFragment())
        viewPager.adapter = generalFragmentStatePagerAdapter
        tabLayout.setupWithViewPager(viewPager)
    }
}
