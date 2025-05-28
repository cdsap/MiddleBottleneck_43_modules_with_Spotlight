            package com.performance.module_2_22

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
import com.performance.module_2_22.*
import com.performance.module_1_16.Feature16_5
import com.performance.module_1_20.Feature20_5


            @OptIn(ExperimentalCoroutinesApi::class)
            class Feature22_1Test {
                    private lateinit var repository0: Feature16_5
        private lateinit var repository1: Feature20_5

    private lateinit var viewModel: Feature22_1

    @Before
    fun setup() {
       repository0 = Feature16_5()
        repository1 = Feature20_5()
        viewModel = Feature22_1(
            repository0,
            repository1
        )
    }

    @Test
    fun `test state updates with data`() = runTest {
        assertNotNull(viewModel.state.value)
    }
            }