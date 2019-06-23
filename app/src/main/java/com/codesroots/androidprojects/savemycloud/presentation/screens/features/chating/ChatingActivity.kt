package com.codesroots.androidprojects.savemycloud.presentation.screens.features.chating


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.codesroots.androidprojects.savemycloud.R
import com.codesroots.androidprojects.savemycloud.presentation.screens.features.chating.chatlist.ChatListFragment

class ChatingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.fragment, ChatListFragment()).commit()

    }

}
