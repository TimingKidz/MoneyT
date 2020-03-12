package com.example.moneyt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.CollapsingToolbarLayout




// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //(activity as AppCompatActivity).supportActionBar!!.title = "Home" // Set Toolbar Title
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val ctl = view.findViewById<CollapsingToolbarLayout>(R.id.collapsingToolbarLayout)
        ctl.title = "฿ 3,250"
        ctl.setCollapsedTitleTextAppearance(R.style.coll_toolbar_title)
        ctl.setExpandedTitleTextAppearance(R.style.exp_toolbar_title)
        return view
    }

}
