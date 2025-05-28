package com.performance.module_4_36.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.performance.module_4_36.Feature36_1
import com.performance.module_4_36.Feature36_2
import com.performance.module_4_36.Feature36_3
import com.performance.module_4_36.Feature36_4
import com.performance.module_4_36.Feature36_5
import com.performance.module_3_24.Feature24_6
import com.performance.module_4_36.Feature36_6

@Module
@InstallIn(SingletonComponent::class)
object Module_36 {
    @Provides
    @Singleton
    fun provideFeature36_5(
        api0: Feature24_6 = Feature24_6()
    ): Feature36_5 {
        return Feature36_5(api0)
    }

    @Provides
    @Singleton
    fun provideFeature36_6(): Feature36_6 {
        return Feature36_6()
    }
}