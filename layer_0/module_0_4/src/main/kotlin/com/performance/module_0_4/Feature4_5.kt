package com.performance.module_0_4

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class Feature4_5 @Inject constructor(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Feature4_5 Repository"
    }
}