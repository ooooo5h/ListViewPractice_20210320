package com.neppplus.listviewpractice_20210320.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.neppplus.listviewpractice_20210320.R
import com.neppplus.listviewpractice_20210320.datas.Student

class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {

//    xml > 코틀린 변수로 꺼내오도록 도와주는 클래스. (LayoutInflater)
    val inflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

//        기존의 결과를 버리고, 새로운 결과를 직접 만들어서 사용하겠다라는 뜻
//        position : 지금 그려주려는 위치가 어디인지 알려준다.
//        convertView : 재활용 할 요소가 있는지? 만약 있다면 활용하고 없다면 새로 그려주자

        var tempRow = convertView

//        재활용할 요소가 없나? = > 없으면 그려줘야함
        if (tempRow == null) {
//            tempRow 내부가 비어있는 상황 ! => 채워주자
            tempRow = inflater.inflate(R.layout.student_list_item, null)
        }

//        tempRow는 절대 null이 아닐것이다! => 무조건 결과로 나가도 된다
        val row = tempRow!!

//        완성된 row가 화면에 뿌려질 결과로 선정
        return row




    }

}