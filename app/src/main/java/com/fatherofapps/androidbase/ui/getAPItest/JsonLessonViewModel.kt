package com.fatherofapps.androidbase.ui.getAPItest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.fatherofapps.androidbase.base.viewmodel.BaseViewModel
import com.fatherofapps.androidbase.data.modeljson.LessonJson
import com.fatherofapps.androidbase.data.models.Lesson

import com.fatherofapps.androidbase.data.repositories.CustomerRepository
import com.fatherofapps.androidbase.data.repositories.JsonLessonRepositories

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class jsonPlaceHolderViewModel @Inject constructor(private val jsonLessonRepositories: JsonLessonRepositories):
    BaseViewModel() {

    private var _listPosts = MutableLiveData<LessonJson>()
    val listPots: LiveData<LessonJson>
        get() = _listPosts

    override fun fetchData() {
        showLoading(true)
        parentJob = viewModelScope.launch(handler) {
            val post = jsonLessonRepositories.getAllAccount()

//            _listPosts.toString()
//            _listPosts.postValue()
            _listPosts.postValue(post)



            _listPosts.postValue(post)
        }
        registerJobFinish()
    }

}
