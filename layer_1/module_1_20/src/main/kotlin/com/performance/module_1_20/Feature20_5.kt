package com.performance.module_1_20

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.performance.module_0_12.Feature12_6


@Singleton
class Feature20_5 @Inject constructor(
    private val api0: Feature12_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData()
    }
}