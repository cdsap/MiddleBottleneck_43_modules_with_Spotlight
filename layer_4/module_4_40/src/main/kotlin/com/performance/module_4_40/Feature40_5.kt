package com.performance.module_4_40

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.performance.module_3_24.Feature24_6
import com.performance.module_3_28.Feature28_6


@Singleton
class Feature40_5 @Inject constructor(
    private val api0: Feature24_6,
    private val api1: Feature28_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData() + api1.fetchData()
    }
}