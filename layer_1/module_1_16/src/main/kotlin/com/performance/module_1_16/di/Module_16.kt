package com.performance.module_1_16.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.performance.module_1_16.Feature16_1
import com.performance.module_1_16.Feature16_2
import com.performance.module_1_16.Feature16_3
import com.performance.module_1_16.Feature16_4
import com.performance.module_1_16.Feature16_5
import com.performance.module_0_12.Feature12_6
import com.performance.module_1_16.Feature16_6

@Module
@InstallIn(SingletonComponent::class)
object Module_16 {
    @Provides
    @Singleton
    fun provideFeature16_5(
        api0: Feature12_6 = Feature12_6()
    ): Feature16_5 {
        return Feature16_5(api0)
    }

    @Provides
    @Singleton
    fun provideFeature16_6(): Feature16_6 {
        return Feature16_6()
    }
}