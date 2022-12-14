package com.fika.fika_project.ui.login

import android.util.Log
import com.fika.fika_project.ApplicationClass
import com.fika.fika_project.retrofit.GoogleEmail
import com.fika.fika_project.retrofit.RetrofitInterface
import com.fika.fika_project.retrofit.testerCode
import com.fika.fika_project.utils.spfManager
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginService (val View : LoginView) {
    val retrofit = ApplicationClass.retrofit.create(RetrofitInterface::class.java)

    fun tryKakaoLogin(token: String){
        View.onLoading()

        retrofit.kakaoLogin(token).enqueue(object : Callback<BasicResponse> {
            override fun onResponse(call: Call<BasicResponse>, response: Response<BasicResponse>) {
                var result: BasicResponse? = response.body()
                val resp = response.body()

                Log.d("KAKAOLOGIN/token", token)

                Log.d("KAKAOLOGIN/API-RESPONSE", result.toString())

                when(resp?.code){
                    //성공
                    1000 -> {
                        View.onKakaoSuccess(response.body() as BasicResponse)
                        Log.d("KAKAOLOGIN/1000", resp.message)

                        spfManager.setJwt(resp.result)
                        Log.d("KAKAOLOGIN-setJwt", resp.result)

                    }
                    //최초
                    1002 -> {
                        View.onKakaoSuccess(response.body() as BasicResponse)
                        spfManager.setEmail(resp.result)
                        Log.d("KAKAOLOGIN/1002", spfManager.getEmail().toString())
                    }
                    4000 -> { Log.d("KAKAOLOGIN", "Access-Token이 존재하지 않는 경우") }
                    4001 -> { Log.d("KAKAOLOGIN", "유효하지 않은 AccessToken") }
                    else ->  {
                        Log.d("LOGIN", "로그인 실패 : 서버 오류")
                } }
            }

            override fun onFailure(call: Call<BasicResponse>, t: Throwable) {
                Log.d("LOGIN", "로그인 실패 : 서버 오류")
            }
        })}

    fun tryTesterLogin(testerCode: testerCode){
        retrofit.TesterLogin(testerCode).enqueue(object : Callback<BasicResponse> {
            override fun onResponse(call: Call<BasicResponse>, response: Response<BasicResponse>) {
                View.onLoading()

                var result: BasicResponse? = response.body()
                val resp = response.body()

                Log.d("TESTER/API-RESPONSE", result.toString())

                when(resp?.code){
                    //성공
                    1000 -> {
                        View.onTesterSuccess(response.body() as BasicResponse)
                        Log.d("TESTER/1000", resp.message)

                        spfManager.setJwt(resp.result)
                        Log.d("TESTER-setJwt", resp.result) }

                    else ->  { Log.d("TESTER", "로그인 실패 : 서버 오류") }
                }
            }

            override fun onFailure(call: Call<BasicResponse>, t: Throwable) {
                Log.d("TESTER", "로그인 실패 : 서버 오류")
            }
        })}

    fun tryGoogleLogin(googleEmail: GoogleEmail){
        View.onLoading()

        retrofit.googleLogin(googleEmail).enqueue(object : Callback<BasicResponse> {
            override fun onResponse(call: Call<BasicResponse>, response: Response<BasicResponse>) {
                var result: BasicResponse? = response.body()
                val resp = response.body()

                Log.d("GOOGLE/API-RESPONSE", result.toString())

                when(resp?.code){
                    //성공
                    1000 -> {
                        View.onGoogleSuccess(response.body() as BasicResponse)
                        Log.d("GOOGLE/1000", resp.message)

                        spfManager.setJwt(resp.result)
                        Log.d("GOOGLE-setJwt", resp.result)

                    }
                    //최초
                    1002 -> {
                        View.onGoogleSuccess(response.body() as BasicResponse)
                        spfManager.setEmail(resp.result)
                        Log.d("GOOGLE/1002", spfManager.getEmail().toString())
                    }
                    4000 -> { Log.d("GOOGLE", "Access-Token이 존재하지 않는 경우") }
                    4001 -> { Log.d("GOOGLE", "유효하지 않은 AccessToken") }
                    else ->  {
                        Log.d("GOOGLE", "로그인 실패 : 서버 오류")
                    } }
            }

            override fun onFailure(call: Call<BasicResponse>, t: Throwable) {
                Log.d("GOOGLE", "로그인 실패 : 서버 오류")
            }
        })}

}