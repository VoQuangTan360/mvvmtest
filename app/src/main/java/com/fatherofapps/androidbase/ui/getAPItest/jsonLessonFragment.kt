package com.fatherofapps.androidbase.ui.getAPItest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.fatherofapps.androidbase.base.fragment.BaseFragment

import com.fatherofapps.androidbase.databinding.FragmentJsonLessonBinding

import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class jsonLessonFragment: BaseFragment() {
    private val viewModel by viewModels<jsonPlaceHolderViewModel>()

    private lateinit var dataBingding: FragmentJsonLessonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.fetchData()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBingding= FragmentJsonLessonBinding.inflate(inflater)
        dataBingding.lifecycleOwner= viewLifecycleOwner
        return dataBingding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        registerAllExceptionEvent(viewModel,viewLifecycleOwner)
        registerObserverLoadingEvent(viewModel,viewLifecycleOwner)
        viewModel.listPots.observe(viewLifecycleOwner){
                posts ->
            if(posts !=null){
                val titles = posts.idStudent
//                isNotEmpty()
//                { "${it.status} \n" }
                dataBingding.tvResult.text = titles.toString()
            }
        }
    }
}