package com.fatherofapps.androidbase.data.repositories

import com.fatherofapps.androidbase.base.network.NetworkResult
import com.fatherofapps.androidbase.data.services.JsonLessonRemoteServer

import com.fatherofapps.androidbase.di.IoDispatcher
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

class JsonLessonRepositories @Inject constructor(
    private val jsonLessonRemoteServer: JsonLessonRemoteServer,
    @IoDispatcher private val dispatcher:CoroutineDispatcher){


        suspend fun getAllAccount() = withContext(dispatcher){
            when (val result =jsonLessonRemoteServer.getAllAccount()){
                is NetworkResult.Success ->{
                    result.data
//                    result.data.map { it.toLesson() }
                }
                is NetworkResult.Error ->{
                    throw result.exception
                }
            }
        }
    }


