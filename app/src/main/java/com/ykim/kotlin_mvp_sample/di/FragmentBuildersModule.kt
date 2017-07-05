package com.ykim.kotlin_mvp_sample.di


import com.ykim.kotlin_mvp_sample.ui.main.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuildersModule {
  @ContributesAndroidInjector
  internal abstract fun contributeMainFragment(): MainFragment
}
