package dependencies.libs

import dependencies.Dependency
import dependencies.provider.DependencyProvider
import dependencies.values

object CustomLibs : DependencyProvider {

    const val VERSION_ABP = "1.3.1"
    const val VERSION_APP_RESTARTER = "2.1.2"
    const val VERSION_LOTTIE = "4.2.1"
    const val VERSION_TIMBER = "5.0.1"
    const val VERSION_STATE_MACHINE = "0.2.0"

    override fun dependencies() = listOf(
        Dependency("com.airbnb.android", "lottie", VERSION_LOTTIE),
        Dependency("com.jakewharton", "process-phoenix", VERSION_APP_RESTARTER),
        Dependency("com.jakewharton.threetenabp", "threetenabp", VERSION_ABP),
        Dependency("com.jakewharton.timber", "timber", VERSION_TIMBER),
        Dependency("com.tinder.statemachine", "statemachine", VERSION_STATE_MACHINE),
    ).values()
}