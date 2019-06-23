package com.codesroots.androidprojects.savemycloud.presentation.screens.features.chating.addfriends

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.codesroots.androidprojects.savemycloud.R
import com.codesroots.androidprojects.savemycloud.presentation.screens.features.chating.adapters.ChatMessagesAdapter
import com.codesroots.androidprojects.savemycloud.presentation.screens.features.chating.adapters.ContactListAdapter
import kotlinx.android.synthetic.main.chat_list_fragment.view.*

class AddFriensFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val  view = inflater.inflate(R.layout.find_friendsfragment, container, false)
        view.contacts?.adapter = AddFriendsAdapter(activity!!)
        return view;
    }

}
