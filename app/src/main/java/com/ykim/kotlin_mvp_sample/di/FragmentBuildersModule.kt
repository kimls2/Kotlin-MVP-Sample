package com.ykim.kotlin_mvp_sample.di


import android.support.v4.app.Fragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuildersModule {
  @ContributesAndroidInjector
  internal abstract fun contributeMainFragment(): Fragment
}
