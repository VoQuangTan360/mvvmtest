package com.fatherofapps.androidbase.data.services

import com.fatherofapps.androidbase.base.network.BaseRemoteService
import com.fatherofapps.androidbase.base.network.NetworkResult
import com.fatherofapps.androidbase.data.apis.JsonLessonAPI

import com.fatherofapps.androidbase.data.modeljson.LessonJson


import javax.inject.Inject



class JsonLessonRemoteServer @Inject constructor(private val jsonLessonAPI: JsonLessonAPI):BaseRemoteService() {
    suspend fun getAllAccount(): NetworkResult<List<LessonJson>>{
        return callApi {jsonLessonAPI.getLesson() }
    }

}