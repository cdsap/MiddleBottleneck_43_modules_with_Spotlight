package com.performance.module_3_28

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class Feature28_5 @Inject constructor(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Feature28_5 Repository"
    }
}