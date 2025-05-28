package com.performance.module_5_44.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.performance.module_5_44.Feature44_1
import com.performance.module_5_44.Feature44_2
import com.performance.module_5_44.Feature44_3
import com.performance.module_5_44.Feature44_4
import com.performance.module_5_44.Feature44_5
import com.performance.module_4_32.Feature32_6
import com.performance.module_4_36.Feature36_6
import com.performance.module_4_40.Feature40_6
import com.performance.module_5_44.Feature44_6

@Module
@InstallIn(SingletonComponent::class)
object Module_44 {
    @Provides
    @Singleton
    fun provideFeature44_5(
        api0: Feature32_6 = Feature32_6(),
        api1: Feature36_6 = Feature36_6(),
        api2: Feature40_6 = Feature40_6()
    ): Feature44_5 {
        return Feature44_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideFeature44_6(): Feature44_6 {
        return Feature44_6()
    }
}