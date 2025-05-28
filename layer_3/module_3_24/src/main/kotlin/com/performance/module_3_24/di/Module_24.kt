package com.performance.module_3_24.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.performance.module_3_24.Feature24_1
import com.performance.module_3_24.Feature24_2
import com.performance.module_3_24.Feature24_3
import com.performance.module_3_24.Feature24_4
import com.performance.module_3_24.Feature24_5
import com.performance.module_3_24.Feature24_6

@Module
@InstallIn(SingletonComponent::class)
object Module_24 {
    @Provides
    @Singleton
    fun provideFeature24_5(): Feature24_5 {
        return Feature24_5()
    }

    @Provides
    @Singleton
    fun provideFeature24_6(): Feature24_6 {
        return Feature24_6()
    }
}