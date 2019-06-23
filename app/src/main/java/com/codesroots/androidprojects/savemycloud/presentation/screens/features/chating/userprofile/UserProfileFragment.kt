package com.codesroots.androidprojects.savemycloud.presentation.screens.features.chating.userprofile

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.graphics.drawable.ClipDrawable
import kotlinx.android.synthetic.main.user_profile_fragment.view.*


class UserProfileFragment : Fragment() {

    private lateinit var viewModel: UserProfileViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(com.codesroots.androidprojects.savemycloud.R.layout.user_profile_fragment, container, false)
//      val  mImageDrawable = view.person_img.getDrawable() as ClipDrawable
//        mImageDrawable.setLevel(5000)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(UserProfileViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
