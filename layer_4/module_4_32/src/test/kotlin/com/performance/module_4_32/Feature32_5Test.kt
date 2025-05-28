            package com.performance.module_4_32

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
import com.performance.module_4_32.*


            @OptIn(ExperimentalCoroutinesApi::class)
            class Feature32_5Test {
                @Before
fun setup() {
}

@Test
fun `test getData returns data`() = runTest {
    val result = Feature32_5().getData()
    assertNotNull(result)
}
            }