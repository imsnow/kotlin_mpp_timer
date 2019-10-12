package org.example.app

import androidx.lifecycle.ViewModelProvider
import dev.icerock.moko.mvvm.MvvmActivity
import dev.icerock.moko.mvvm.createViewModelFactory
import dev.icerock.moko.units.adapter.UnitsRecyclerViewAdapter
import org.example.app.databinding.ActivityNewsBinding
import org.example.library.feature.news.presentation.NewsListViewModel

/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

class NewsActivity: MvvmActivity<ActivityNewsBinding, NewsListViewModel>() {
    override val layoutId: Int = R.layout.activity_news
    override val viewModelClass: Class<NewsListViewModel> = NewsListViewModel::class.java
    override val viewModelVariableId: Int = BR.viewModel

    override fun viewModelFactory(): ViewModelProvider.Factory = createViewModelFactory {
        MainApplication.factory.newsFactory.createNewsListViewModel()
    }
}