package com.codesroots.androidprojects.savemycloud.presentation.screens.features.chating.addfriends

import android.app.Activity
import android.content.Context
import android.support.v4.app.FragmentActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.codesroots.androidprojects.savemycloud.R
import com.codesroots.androidprojects.savemycloud.presentation.screens.features.chating.chatingmessages.ChatMessagesFragment
import kotlinx.android.synthetic.main.recycler_item_chat_list.view.*

class AddFriendsAdapter(activity: FragmentActivity) : RecyclerView.Adapter<AddFriendsAdapter.CustomView>() {

    private val context: Context

    init {
        this.context = activity
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AddFriendsAdapter.CustomView {

        return CustomView(LayoutInflater.from(context).inflate(R.layout.recycler_item_add_friend, parent, false))
    }

    override fun onBindViewHolder(holder: CustomView, position: Int) {
        holder.mView.setOnClickListener {
            (context as FragmentActivity).getSupportFragmentManager().beginTransaction().replace(R.id.fragment, ChatMessagesFragment()).addToBackStack(null).commit() }
    }

    override fun getItemCount(): Int {
        return 5
    }

     class CustomView (val mView: View) : RecyclerView.ViewHolder(mView) {
        val tvAnimalType = mView.tvNameC
    }

}
