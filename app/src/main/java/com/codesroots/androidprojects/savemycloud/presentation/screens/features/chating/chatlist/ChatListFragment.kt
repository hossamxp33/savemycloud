package com.codesroots.androidprojects.savemycloud.presentation.screens.features.chating.chatlist

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.codesroots.androidprojects.savemycloud.R
import com.codesroots.androidprojects.savemycloud.presentation.screens.features.chating.adapters.ContactListAdapter
import com.codesroots.androidprojects.savemycloud.presentation.screens.features.chating.userprofile.UserProfileFragment
import kotlinx.android.synthetic.main.chat_list_fragment.*
import kotlinx.android.synthetic.main.chat_list_fragment.view.*

class ChatListFragment : Fragment() {


    private lateinit var viewModel: ChatListViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        val  view = inflater.inflate(R.layout.chat_list_fragment, container, false)
        view.contacts.adapter = ContactListAdapter(activity!!)
        view.person_img?.setOnClickListener {
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.fragment, UserProfileFragment()).addToBackStack(null).commit()}
        return view;
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ChatListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
