package com.performance.module_0_4.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.performance.module_0_4.Feature4_1
import com.performance.module_0_4.Feature4_2
import com.performance.module_0_4.Feature4_3
import com.performance.module_0_4.Feature4_4
import com.performance.module_0_4.Feature4_5
import com.performance.module_0_4.Feature4_6

@Module
@InstallIn(SingletonComponent::class)
object Module_4 {
    @Provides
    @Singleton
    fun provideFeature4_5(): Feature4_5 {
        return Feature4_5()
    }

    @Provides
    @Singleton
    fun provideFeature4_6(): Feature4_6 {
        return Feature4_6()
    }
}