package com.ykim.kotlin_mvp_sample.injection

import com.ykim.kotlin_mvp_sample.data.remote.ImgurService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Singleton
    @Provides
    fun provideImgurService(): ImgurService {
        return ImgurService.Factory.makeImugurService()
    }
}
