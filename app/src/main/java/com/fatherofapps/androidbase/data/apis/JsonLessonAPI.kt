package com.fatherofapps.androidbase.data.apis

import com.fatherofapps.androidbase.data.modeljson.LessonJson

import retrofit2.Response
import retrofit2.http.GET

interface JsonLessonAPI {
    @GET("/api/lessons/1")
    suspend fun getLesson(): Response<List<LessonJson>>
}