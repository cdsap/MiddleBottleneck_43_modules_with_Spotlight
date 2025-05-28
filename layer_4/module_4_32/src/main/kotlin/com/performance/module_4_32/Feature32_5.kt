package com.performance.module_4_32

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class Feature32_5 @Inject constructor(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Feature32_5 Repository"
    }
}