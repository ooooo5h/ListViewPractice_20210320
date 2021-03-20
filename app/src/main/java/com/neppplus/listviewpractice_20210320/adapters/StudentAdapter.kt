package com.neppplus.listviewpractice_20210320.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.neppplus.listviewpractice_20210320.datas.Student

class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {
}