package com.example.fika_project.retrofit

import com.example.fika_project.ui.login.LoginResponse
import com.example.fika_project.ui.main.explore.DramaInfoResponse
import com.example.fika_project.ui.main.explore.ExploreCourseResponse
import com.example.fika_project.ui.main.explore.course_detail.CourseDetailResponse
import com.example.fika_project.ui.main.explore.filter_drama.ExploreDramaResponse
import com.example.fika_project.ui.main.home.HomeResponse
import com.example.fika_project.ui.main.mypage.myspot.MySpotResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path

interface RetrofitInterface {
    //카카오 로그인
    @POST("/oauth/login/kakao")
    fun kakaoLogin(): Call<LoginResponse>

    //8. 메인 페이지 데이터 조회
    @GET("/nav/main")
    fun loadHome(
        @Header("Access-Token") token: String
    ): Call<HomeResponse>

    //10. 드라마 필터 조회
    @GET("/drama/all")
    fun loadDramaFilter(
        @Header("Access-Token") token : String
    ) :Call<ExploreDramaResponse>

    //11. 코스 필터 조회
    @GET("/course/all")
    fun loadCourseFilter(
        @Header("Access-Token") token : String
    ) :Call<ExploreCourseResponse>

    //12. 드라마 상세 조회
    @GET("/drama/{dramaId}")
    fun loadDramaInfoCourse(
        @Header("Access-Token") token: String,
        @Path("dramaId") dramaId : Int
    ) :Call<DramaInfoResponse>

    //18. 코스 상세 조회
   @GET("course/detail/{courseId}")
    fun loadDetailCourse(
        @Header("Access-Token") token: String,
        @Path("courseId") courseId : Int
    ) :Call<CourseDetailResponse>

    // 19. 내가 담은 장소 조회
    @GET("/spot/my")
    fun loadMySpot (
        @Header("Access-Token") token: String,
    ) : Call<MySpotResponse>
}