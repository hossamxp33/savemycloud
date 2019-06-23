package com.codesroots.androidprojects.savemycloud.presentation.screens.features.chating.adapters

import android.content.Context
import android.support.v4.app.FragmentActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.codesroots.androidprojects.savemycloud.R
import kotlinx.android.synthetic.main.recycler_item_chat_list.view.*

class ChatMessagesAdapter(activity: FragmentActivity) : RecyclerView.Adapter<ChatMessagesAdapter.CustomView>() {

    private val context: Context
    val  VIEW_TYPE_MESSAGE_SENT : Int =1
    val  VIEW_TYPE_MESSAGE_RECEIVED : Int =2
    init {
        this.context = activity
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatMessagesAdapter.CustomView {

        if (viewType ==VIEW_TYPE_MESSAGE_SENT)
            return  CustomView( LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item_chat_send, parent, false));
            else
            return CustomView (LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.recycler_item_chat_recievied, parent, false));
     }

    override fun onBindViewHolder(holder: CustomView, position: Int) {
    }

    override fun getItemViewType(position: Int): Int {
        if (position  == 0)
        return VIEW_TYPE_MESSAGE_SENT
        else if (position  == 1)
            return VIEW_TYPE_MESSAGE_SENT
        else  if (position  == 2)
            return VIEW_TYPE_MESSAGE_RECEIVED
        else  if (position  == 3)
            return VIEW_TYPE_MESSAGE_SENT
        else
            return VIEW_TYPE_MESSAGE_SENT
    }
    override fun getItemCount(): Int {
        return 5
    }

     class CustomView (val mView: View) : RecyclerView.ViewHolder(mView) {
        val tvAnimalType = mView.tvNameC
    }

}
