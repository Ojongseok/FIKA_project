package com.example.fika_project.ui.main.explore.course_detail

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.fika_project.R
import com.example.fika_project.ui.main.hold_and_scrap.LocationHoldResponse
import com.example.fika_project.ui.main.hold_and_scrap.LocationHoldService
import com.example.fika_project.ui.main.hold_and_scrap.LocationHoldView
import kotlinx.android.synthetic.main.drama_info_location_item.view.*
import kotlinx.android.synthetic.main.myhold_location_item_list.view.*


class CourseDetailDramaAdapter(val locationList: ArrayList<spotList>, val context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>(),LocationHoldView {
    private lateinit var itemClickListener : CourseDetailDramaAdapter.OnItemClickListener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.myhold_location_item_list,parent,false)

        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val view = (holder as CustomViewHolder).itemView

        Glide.with(context).load(locationList[position].spotImageUrl).into(view.course_detail_iv)
        view.course_detail_where_tv.text = locationList[position].shortAddress
        view.course_detail_category_tv.text = locationList[position].type
        view.map_title_name_tv.text = locationList[position].spotTitle

        if (locationList[position].scrapped!!) {
            view.course_detail_location_flag_btn.setImageResource(R.drawable.ic_flag_on)
        } else {
            view.course_detail_location_flag_btn.setImageResource(R.drawable.ic_flag_off)
        }

        view.myhold_checkbox_btn.setOnClickListener {
            itemClickListener.onClick(it,position)
        }
        view.course_detail_location_flag_btn.setOnClickListener {
            var service = LocationHoldService(this,locationList[position].spotId!!)
            service.tryLoadLocationHold(view.course_detail_location_flag_btn)
        }
    }
    inner class CustomViewHolder(var view : View) : RecyclerView.ViewHolder(view)
    override fun getItemCount() = locationList.size

    interface OnItemClickListener {
        fun onClick(view: View, position: Int) {
            Toast.makeText(view.context,position.toString(), Toast.LENGTH_SHORT).show()
        }
    }
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