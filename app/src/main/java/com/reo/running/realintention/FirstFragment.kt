package com.reo.running.realintention

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.first_fragment.*

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.first_fragment,container,false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        why_button.setOnClickListener{
            val whyFragment = WhyFragment()
            val fragment = fragmentManager?.beginTransaction()
            fragment?.addToBackStack(null)
            fragment?.replace(R.id.fragment_box,whyFragment)
            fragment?.commit()
            val title = edit_text.text.toString()
            val bundle = Bundle()
            bundle.putString("data",title)
        }

        how_button.setOnClickListener {
            val whyFragment = WhyFragment()
            val fragment = fragmentManager?.beginTransaction()
            fragment?.addToBackStack(null)
            fragment?.replace(R.id.fragment_box,whyFragment)
            fragment?.commit()
            val title = edit_text.text.toString()
            val bundle = Bundle()
            bundle.putString("data",title)


    }
   }
}