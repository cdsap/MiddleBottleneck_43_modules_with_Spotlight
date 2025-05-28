package com.performance.module_4_32.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.performance.module_4_32.Feature32_1
import com.performance.module_4_32.Feature32_2
import com.performance.module_4_32.Feature32_3
import com.performance.module_4_32.Feature32_4
import com.performance.module_4_32.Feature32_5
import com.performance.module_4_32.Feature32_6

@Module
@InstallIn(SingletonComponent::class)
object Module_32 {
    @Provides
    @Singleton
    fun provideFeature32_5(): Feature32_5 {
        return Feature32_5()
    }

    @Provides
    @Singleton
    fun provideFeature32_6(): Feature32_6 {
        return Feature32_6()
    }
}