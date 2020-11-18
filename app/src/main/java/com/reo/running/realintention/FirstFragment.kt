package com.reo.running.realintention

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
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
//            val whyFragment = WhyFragment()
//            val fragment = fragmentManager?.beginTransaction()
//            fragment?.addToBackStack(null)
//            fragment?.replace(R.id.fragment_box,whyFragment)
//            fragment?.commit() //commitすると画面遷移しちゃうのでcommitする前にインスタンス化したfragmentに値を渡さないといけない
//            val title = edit_text.text.toString()
//            val bundle = Bundle()
//            bundle.putString("data",title)
//
//            //example
//            val _whyFragment = WhyFragment()
//            val _bundle = Bundle()
//            _bundle.putString("data", title)
//            _whyFragment.arguments = _bundle
            //この後にbeginTransactionなりreplaceなりcommitなりする

            //もっとkotlinっぽく書く場合(ここは理解できなくても良い)
            val editTextTitle = edit_text.text.toString()
            WhyFragment().apply {
                arguments = Bundle().apply {
                    putString("data", editTextTitle)
                }
            }.let {
                fragmentManager?.beginTransaction()?.apply {
                    addToBackStack(null)
                    replace(R.id.fragment_box, it)
                }?.commit()
            }

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