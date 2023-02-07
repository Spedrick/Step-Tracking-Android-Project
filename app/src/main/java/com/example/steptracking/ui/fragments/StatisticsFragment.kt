package com.example.steptracking.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.steptracking.R
import com.example.steptracking.ui.viewmodels.MainViewModel
import com.example.steptracking.ui.viewmodels.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics){
    private val viewModel: StatisticsViewModel by viewModels()
}