package com.mokha.viewpagermokha

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(
            MyFriend("Moka", "Laki-laki", "moka@stimata.ac.id",
        "081234566666", "Batu")
        )
        listTeman.add(
            MyFriend("Valency", "Perempuan", "valency@gmail.com",
        "08987666666", "Sanggrahan")
        )
        listTeman.add(
            MyFriend("Septy", "Perempuan", "septygtw@gmail.com",
                "08923864236489", "Sanggrahan")
        )
        listTeman.add(
            MyFriend("Aji Ajah", "Laki-laki", "ajiaja@gmail.com",
                "08123123123232", "Kediri")
        )
        listTeman.add(
            MyFriend("Michael", "Laki-laki", "mightymikey@gmail.com",
                "0217474834845", "Tokyo")
        )
        listTeman.add(
            MyFriend("Selina", "Perempuan", "selinsalon@gmail.com",
                "0858383893898", "Bumiaji")
        )
        listTeman.add(
            MyFriend("Stuard", "Laki-laki", "stuardyou@gmail.com",
                "0123123156", "London")
        )
        listTeman.add(
            MyFriend("James", "Laki-laki", "jameslikejams@gmail.com",
                "02198964574", "Kentucky")
        )
        listTeman.add(
            MyFriend("Sasha", "Perempuan", "sashasausage@gmail.com",
                "0678335728", "Great Britain")
        )
    }

    private fun tampilTeman(){
        rv_listMyfriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyfriends.adapter=MyFriendAdapter(activity!!, listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}