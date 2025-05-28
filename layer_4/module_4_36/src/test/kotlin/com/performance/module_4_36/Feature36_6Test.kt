            package com.performance.module_4_36

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
import com.performance.module_4_36.*


            @OptIn(ExperimentalCoroutinesApi::class)
            class Feature36_6Test {
                
        private lateinit var api: Feature36_6

        @Before
        fun setup() {
            api = Feature36_6()
        }

        @Test
        fun `test fetchData returns data`() = runTest {
            val result = api.fetchData()
            assertNotNull(result)
        }
    
            }