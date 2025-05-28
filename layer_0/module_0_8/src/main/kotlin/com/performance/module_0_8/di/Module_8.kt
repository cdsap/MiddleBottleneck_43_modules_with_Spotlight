package com.performance.module_0_8.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.performance.module_0_8.Feature8_1
import com.performance.module_0_8.Feature8_2
import com.performance.module_0_8.Feature8_3
import com.performance.module_0_8.Feature8_4
import com.performance.module_0_8.Feature8_5
import com.performance.module_0_8.Feature8_6

@Module
@InstallIn(SingletonComponent::class)
object Module_8 {
    @Provides
    @Singleton
    fun provideFeature8_5(): Feature8_5 {
        return Feature8_5()
    }

    @Provides
    @Singleton
    fun provideFeature8_6(): Feature8_6 {
        return Feature8_6()
    }
}