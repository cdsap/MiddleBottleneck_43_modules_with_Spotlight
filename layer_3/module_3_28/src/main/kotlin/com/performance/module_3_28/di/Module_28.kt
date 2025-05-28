package com.performance.module_3_28.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.performance.module_3_28.Feature28_1
import com.performance.module_3_28.Feature28_2
import com.performance.module_3_28.Feature28_3
import com.performance.module_3_28.Feature28_4
import com.performance.module_3_28.Feature28_5
import com.performance.module_3_28.Feature28_6

@Module
@InstallIn(SingletonComponent::class)
object Module_28 {
    @Provides
    @Singleton
    fun provideFeature28_5(): Feature28_5 {
        return Feature28_5()
    }

    @Provides
    @Singleton
    fun provideFeature28_6(): Feature28_6 {
        return Feature28_6()
    }
}