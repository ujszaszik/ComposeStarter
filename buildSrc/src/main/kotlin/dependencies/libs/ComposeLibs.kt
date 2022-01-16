package dependencies.libs

import dependencies.Dependency
import dependencies.provider.DependencyProvider
import dependencies.values

object ComposeLibs : DependencyProvider {

    const val VERSION_ACCOMPANIST = "0.21.4-beta"
    const val VERSION_COMPOSE = "1.1.0-rc01"
    const val VERSION_CONSTRAINT = "1.0.0-beta02"
    const val VERSION_FOUNDATION = "1.1.0-beta02"
    const val VERSION_LOTTIE = "4.2.2"
    const val VERSION_NAVIGATION = "2.4.0-beta01"
    const val VERSION_PAGER = "0.20.2"
    const val VERSION_VIEWMODEL = "2.4.0"

    override fun dependencies() = listOf(
        Dependency("androidx.activity", "activity-compose", VERSION_COMPOSE),
        Dependency("androidx.compose.animation", "animation", VERSION_COMPOSE),
        Dependency("androidx.compose.foundation", "foundation", VERSION_FOUNDATION),
        Dependency("androidx.compose.foundation", "foundation-layout", VERSION_FOUNDATION),
        Dependency("androidx.compose.runtime", "runtime", VERSION_COMPOSE),
        Dependency("com.google.accompanist", "accompanist-insets", VERSION_ACCOMPANIST),
        Dependency("com.google.accompanist", "accompanist-insets-ui", VERSION_ACCOMPANIST),
        Dependency("androidx.compose.material", "material", VERSION_COMPOSE),
        Dependency("androidx.compose.material", "material-icons-core", VERSION_COMPOSE),
        Dependency("androidx.compose.material", "material-icons-extended", VERSION_COMPOSE),
        Dependency("androidx.compose.ui", "ui", VERSION_COMPOSE),
        Dependency("androidx.compose.ui", "ui-tooling", VERSION_COMPOSE),
        Dependency("androidx.constraintlayout", "constraintlayout-compose", VERSION_CONSTRAINT),
        Dependency("androidx.lifecycle", "lifecycle-viewmodel-compose", VERSION_VIEWMODEL),
        Dependency("androidx.navigation", "navigation-compose", VERSION_NAVIGATION),
        Dependency("com.google.accompanist", "accompanist-pager-indicators", VERSION_PAGER),
        Dependency("com.google.accompanist", "accompanist-permissions", VERSION_ACCOMPANIST),
        Dependency("com.google.accompanist", "accompanist-swiperefresh", VERSION_ACCOMPANIST),
        Dependency("com.airbnb.android", "lottie-compose", VERSION_LOTTIE)
    ).values()

}