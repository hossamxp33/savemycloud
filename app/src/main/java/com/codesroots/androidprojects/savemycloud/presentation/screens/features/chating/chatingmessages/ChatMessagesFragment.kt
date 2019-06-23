package com.codesroots.androidprojects.savemycloud.presentation.screens.features.chating.chatingmessages

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

class ChatMessagesFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val  view = inflater.inflate(R.layout.activity_chating, container, false)
        view.contacts?.adapter = ChatMessagesAdapter(activity!!)
        return view;
    }

}
