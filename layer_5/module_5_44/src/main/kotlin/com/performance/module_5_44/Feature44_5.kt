package com.performance.module_5_44

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.performance.module_4_32.Feature32_6
import com.performance.module_4_36.Feature36_6
import com.performance.module_4_40.Feature40_6


@Singleton
class Feature44_5 @Inject constructor(
    private val api0: Feature32_6,
    private val api1: Feature36_6,
    private val api2: Feature40_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData() + api2.fetchData()
    }
}