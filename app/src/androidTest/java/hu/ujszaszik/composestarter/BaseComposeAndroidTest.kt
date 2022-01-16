package hu.ujszaszik.composestarter

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import hu.ujszaszik.composestarter.application.HiltTestActivity
import hu.ujszaszik.composestarter.rules.DisableAnimationsRule
import org.junit.Before
import org.junit.Rule

@Suppress("LeakingThis")
@HiltAndroidTest
open class BaseComposeAndroidTest {

    @get:Rule(order = 0)
    internal var hiltRule = HiltAndroidRule(this)

    @get:Rule(order = 1)
    internal val composeTestRule = createAndroidComposeRule<HiltTestActivity>()

    @get:Rule(order = 2)
    internal val disableAnimationsRule = DisableAnimationsRule()

    @Before
    fun setup() = hiltRule.inject()
}