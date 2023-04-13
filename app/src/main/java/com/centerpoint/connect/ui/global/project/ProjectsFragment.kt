package com.centerpoint.connect.ui.global.project

import android.os.Bundle
import android.view.View
import com.centerpoint.connect.R
import com.centerpoint.connect.base.BaseFragment
import com.centerpoint.connect.base.BaseViewModel
import com.centerpoint.connect.databinding.FragmentLoginBinding
import com.centerpoint.connect.databinding.FragmentProjectsBinding
import com.centerpoint.connect.ui.landing.LandingActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class ProjectsFragment : BaseFragment<FragmentProjectsBinding>() {

    override fun getViewModel(): BaseViewModel? = null
    override fun getLayoutId(): Int = R.layout.fragment_projects
}