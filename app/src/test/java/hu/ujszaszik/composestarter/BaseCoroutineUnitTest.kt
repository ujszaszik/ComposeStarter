package hu.ujszaszik.composestarter

import android.arch.core.executor.testing.InstantTaskExecutorRule
import hu.ujszaszik.composestarter.rules.CoroutineTestRule
import org.junit.Rule

class BaseCoroutineUnitTest {

    @get:Rule(order = 1)
    val instantExecutorRule = InstantTaskExecutorRule()

    @get:Rule(order = 2)
    val testCoroutineRule = CoroutineTestRule()
}