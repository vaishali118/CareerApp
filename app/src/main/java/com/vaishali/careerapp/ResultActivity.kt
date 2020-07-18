package com.vaishali.careerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val toolbar: Toolbar =findViewById(R.id.toolbar_main)
        setSupportActionBar(toolbar)
        supportActionBar!!.title="Career App"

        val tabLayout: TabLayout =findViewById(R.id.tabLayout)
        val viewPager: ViewPager =findViewById(R.id.viewPager)
        val viewPagerAdapter=
            ViewPagerAdapter(
                supportFragmentManager
            )
        viewPagerAdapter.addFragment(ProfessionFragment(),title ="Profession")
        viewPagerAdapter.addFragment(CollegeFragment(),title = "College")
        viewPagerAdapter.addFragment(CoursesFragment(),title = "Courses")

        viewPager.adapter=viewPagerAdapter
        tabLayout.setupWithViewPager(viewPager)
    }
    internal class ViewPagerAdapter(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager){
        private val fragments:ArrayList<Fragment> = ArrayList()
        private val titles:ArrayList<String> = ArrayList()

        override fun getItem(position: Int): Fragment {
            return fragments[position]
        }

        override fun getCount(): Int {
            return fragments.size
        }
        fun addFragment(fragment: Fragment, title:String)
        {
            fragments.add(fragment)
            titles.add(title)
        }

        override fun getPageTitle(i: Int): CharSequence? {
            return titles[i]
        }

    }
}