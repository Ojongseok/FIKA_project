package com.fika.fika_project.ui.main.explore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.fika.fika_project.R
import com.fika.fika_project.databinding.ActivityCourseDetailDramaOthersBinding
import com.fika.fika_project.ui.main.explore.course_detail.*
import com.fika.fika_project.ui.main.hold_and_scrap.LocationHoldResponse
import com.fika.fika_project.ui.main.hold_and_scrap.LocationHoldService
import com.fika.fika_project.ui.main.hold_and_scrap.LocationHoldView

class CourseDetailDramaOthers : AppCompatActivity(),CourseDetailView,LocationHoldView {
    private var _Binding: ActivityCourseDetailDramaOthersBinding? = null
    private val binding get() = _Binding!!
    lateinit var locationAdapter : CourseDetailLocationOthersAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _Binding = ActivityCourseDetailDramaOthersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val service = CourseDetailService(this,intent.getIntExtra("courseId",0))
        service.tryLoadCourseDetail()

    }

    private fun initData(initList: result) {
        binding.courseDetailCourseTitle.text = initList.courseTitle
        Glide.with(this).load(initList.locageSceneImageUrl).into(binding.courseDetailIv)
        binding.courseDetailLocageTiltle.text = initList.locageSceneDescribe
        binding.detailCourseHash.text = initList.hashTag
        binding.courseDetailDramaTitle.text = initList.dramaTitle

        Glide.with(this).load(initList.courseLocage?.spotImageUrl).into(binding.courseDetailIvLocation)
        binding.courseDetailWhereTv.text = initList.courseLocage?.shortAddress
        binding.courseDetailCategoryTv.text = initList.courseLocage?.type
        binding.mapTitleNameTv.text = initList.courseLocage?.spotTitle
        binding.othersStarCountTv.text = initList.courseSavedCount.toString()

        binding.courseDetailLocationFlagBtn.setOnClickListener {
            var service = LocationHoldService(this,initList.courseLocage?.spotId!!)
            service.tryLoadLocationHold(binding.courseDetailLocationFlagBtn)
        }
    }

    private fun setOnClickEvent() {
        locationAdapter.setItemClickListener(object: CourseDetailLocationOthersAdapter.OnItemClickListener {
            override fun onClick(view: View, position: Int, checkStateList : Array<Boolean>) {
                super.onClick(view, position, checkStateList) // 미리 정의해둔 onClick 호출

                if (checkStateList.contains(true)) {
                    binding.courseDetailHoldBtn.setBackgroundResource(R.drawable.button_background_on)
                    binding.courseDetailHoldBtn.isClickable = true
                    binding.courseDetailHoldBtn.setOnClickListener {
                        startActivity(Intent(applicationContext, FolderSelectActivity::class.java))
                        overridePendingTransition(R.anim.slide_up_enter, R.anim.slide_up_exit)
                    }
                }
            }
            override fun notClick(view: View, position: Int, checkStateList : Array<Boolean>) {
                super.notClick(view, position, checkStateList)
                if (!checkStateList.contains(true)) {
                    binding.courseDetailHoldBtn.setBackgroundResource(R.drawable.button_background_off)
                    binding.courseDetailHoldBtn.isClickable = false
                }

            }
        })
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

    override fun onExploreSuccess(response: CourseDetailResponse) {
        when(response.code) {
            1000 -> {
                response.let {
                    binding.detailCourseTogetherRecyclerview.apply {
                        layoutManager = LinearLayoutManager(context)
                        locationAdapter = CourseDetailLocationOthersAdapter(it.result?.spotList!!, context)
                        adapter = locationAdapter
                    }
                    binding.courseDetailCourseTitle.text = it.result?.courseTitle

                    setOnClickEvent()
                    initData(it.result!!)
                }
            }
        }
    }
    override fun onExploreFailure(code: Int, message: String) {
    }
}
