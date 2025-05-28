            package com.performance.module_0_4

            import org.junit.Test
import org.junit.Before
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.junit.Rule
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Assert.*
import kotlin.test.assertTrue
import kotlin.test.assertNotNull
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import com.performance.module_0_4.*


            @OptIn(ExperimentalCoroutinesApi::class)
            class Feature4_6Test {
                
        private lateinit var api: Feature4_6

        @Before
        fun setup() {
            api = Feature4_6()
        }

        @Test
        fun `test fetchData returns data`() = runTest {
            val result = api.fetchData()
            assertNotNull(result)
        }
    
            }