package com.performance.module_0_12.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.performance.module_0_12.Feature12_1
import com.performance.module_0_12.Feature12_2
import com.performance.module_0_12.Feature12_3
import com.performance.module_0_12.Feature12_4
import com.performance.module_0_12.Feature12_5
import com.performance.module_0_12.Feature12_6

@Module
@InstallIn(SingletonComponent::class)
object Module_12 {
    @Provides
    @Singleton
    fun provideFeature12_5(): Feature12_5 {
        return Feature12_5()
    }

    @Provides
    @Singleton
    fun provideFeature12_6(): Feature12_6 {
        return Feature12_6()
    }
}