package com.fika.fika_project.ui.main.explore.filter_course

import com.fika.fika_project.ui.main.explore.ExploreCourseResponse

interface ExploreCourseView {
    fun onExploreLoading()
    fun onExploreSuccess(response: ExploreCourseResponse)
    fun onExploreFailure(code: Int, message: String)
}