package com.fika.fika_project.ui.main.explore.course_detail

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.fika.fika_project.R
import com.fika.fika_project.ui.main.hold_and_scrap.LocationHoldResponse
import com.fika.fika_project.ui.main.hold_and_scrap.LocationHoldService
import com.fika.fika_project.ui.main.hold_and_scrap.LocationHoldView
import com.fika.fika_project.ui.main.mycourse.placeinfo.PlaceinfoActivity
import kotlinx.android.synthetic.main.activity_course_detail_drama_others.*
import kotlinx.android.synthetic.main.drama_info_location_item.view.*
import kotlinx.android.synthetic.main.myhold_location_item_list.view.*

class CourseDetailLocationOthersAdapter(val locationList: ArrayList<spotList>, val context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>(),LocationHoldView {
    private lateinit var itemClickListener : OnItemClickListener
    var checkStateList = Array<Boolean>(locationList.size) { i -> false }
    var count = 0
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.myhold_location_item_list,parent,false)

        return CustomViewHolder(view)
    }
    interface OnItemClickListener {
        fun onClick(view: View, position: Int, list : Array<Boolean>, count : Int) {
        }
        fun notClick(view:View,position: Int,  list : Array<Boolean>, count : Int) {
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val view = (holder as CustomViewHolder).itemView
        Glide.with(context).load(locationList[position].spotImageUrl).into(view.course_detail_iv)
        view.course_detail_where_tv.text = locationList[position].shortAddress
        view.course_detail_category_tv.text = locationList[position].type
        view.hold_title_name_tv.text = locationList[position].spotTitle
        if (locationList[position].locage!!) {
            view.locage_tv.visibility = View.VISIBLE
        }
        Log.d("TAG",locationList[position].scrapped.toString())
        if (locationList[position].scrapped!!) {
            view.course_detail_location_flag_btn.setImageResource(R.drawable.ic_flag_on)
        } else {
            view.course_detail_location_flag_btn.setImageResource(R.drawable.ic_flag_off)
        }

        view.myhold_checkbox_btn.setOnCheckedChangeListener { compoundButton, checked ->
            if (checked) {
                count++
                checkStateList[position] = true
                itemClickListener.onClick(view, position,checkStateList,count)
            } else {
                count--
                checkStateList[position] = false
                itemClickListener.notClick(view, position,checkStateList,count)
            }
        }
        view.course_detail_location_flag_btn.setOnClickListener {
            var service = LocationHoldService(this,locationList[position].spotId!!)
            service.tryLoadLocationHold(view.course_detail_location_flag_btn)
        }


        view.setOnClickListener{
            val spotId = locationList[position].spotId

            val intent = Intent(context, PlaceinfoActivity::class.java)
            intent.putExtra("homeSpotId",spotId)
            context.startActivity(intent)
        }
    }
    inner class CustomViewHolder(var view : View) : RecyclerView.ViewHolder(view)
    override fun getItemCount() = locationList.size

    fun setItemClickListener(onItemClickListener: OnItemClickListener) {
        this.itemClickListener = onItemClickListener
    }

    override fun onExploreLoading() {
    }

    override fun onExploreSuccess(response: LocationHoldResponse, iv: ImageView) {
        when(response.code) {
            1012 -> {
                response.let {
                    iv.setImageResource(R.drawable.ic_flag_on)
                }
            }
            1013 -> {
                response.let {
                    iv.setImageResource(R.drawable.ic_flag_off)
                }
            }
        }
    }

    override fun onExploreFailure(code: Int, message: String) {
    }
}
