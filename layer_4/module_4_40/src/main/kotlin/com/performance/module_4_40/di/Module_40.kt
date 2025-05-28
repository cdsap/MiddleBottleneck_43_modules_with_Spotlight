package com.performance.module_4_40.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.performance.module_4_40.Feature40_1
import com.performance.module_4_40.Feature40_2
import com.performance.module_4_40.Feature40_3
import com.performance.module_4_40.Feature40_4
import com.performance.module_4_40.Feature40_5
import com.performance.module_3_24.Feature24_6
import com.performance.module_3_28.Feature28_6
import com.performance.module_4_40.Feature40_6

@Module
@InstallIn(SingletonComponent::class)
object Module_40 {
    @Provides
    @Singleton
    fun provideFeature40_5(
        api0: Feature24_6 = Feature24_6(),
        api1: Feature28_6 = Feature28_6()
    ): Feature40_5 {
        return Feature40_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideFeature40_6(): Feature40_6 {
        return Feature40_6()
    }
}