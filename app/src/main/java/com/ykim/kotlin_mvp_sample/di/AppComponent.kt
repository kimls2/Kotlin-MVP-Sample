//package com.ykim.kotlin_mvp_sample.di
//
//
//import android.app.Application
//import com.ykim.kotlin_mvp_sample.MyApp
//import dagger.BindsInstance
//import dagger.Component
//import dagger.android.AndroidInjectionModule
//import javax.inject.Singleton
//
//@Singleton
//@Component(
//    modules = arrayOf(AndroidInjectionModule::class, AppModule::class, MainActivityModule::class))
//interface AppComponent {
//  @Component.Builder
//  interface Builder {
//    @BindsInstance
//    fun application(application: Application): Builder
//
//    fun build(): AppComponent
//  }
//
//  fun inject(myApp: MyApp)
//}
