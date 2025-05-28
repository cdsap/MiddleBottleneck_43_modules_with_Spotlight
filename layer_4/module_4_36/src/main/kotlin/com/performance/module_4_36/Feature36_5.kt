package com.performance.module_4_36

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton
import com.performance.module_3_24.Feature24_6


@Singleton
class Feature36_5 @Inject constructor(
    private val api0: Feature24_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        api0.fetchData()
    }
}