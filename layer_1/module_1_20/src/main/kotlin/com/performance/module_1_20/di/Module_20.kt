package com.performance.module_1_20.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.performance.module_1_20.Feature20_1
import com.performance.module_1_20.Feature20_2
import com.performance.module_1_20.Feature20_3
import com.performance.module_1_20.Feature20_4
import com.performance.module_1_20.Feature20_5
import com.performance.module_0_12.Feature12_6
import com.performance.module_1_20.Feature20_6

@Module
@InstallIn(SingletonComponent::class)
object Module_20 {
    @Provides
    @Singleton
    fun provideFeature20_5(
        api0: Feature12_6 = Feature12_6()
    ): Feature20_5 {
        return Feature20_5(api0)
    }

    @Provides
    @Singleton
    fun provideFeature20_6(): Feature20_6 {
        return Feature20_6()
    }
}