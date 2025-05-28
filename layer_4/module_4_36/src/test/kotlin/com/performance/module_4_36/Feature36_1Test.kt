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
import com.performance.module_3_24.Feature24_5


            @OptIn(ExperimentalCoroutinesApi::class)
            class Feature36_1Test {
                    private lateinit var repository0: Feature24_5

    private lateinit var viewModel: Feature36_1

    @Before
    fun setup() {
       repository0 = Feature24_5()
        viewModel = Feature36_1(
            repository0
        )
    }

    @Test
    fun `test state updates with data`() = runTest {
        assertNotNull(viewModel.state.value)
    }
            }