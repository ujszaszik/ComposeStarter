package dependencies.libs

import dependencies.Dependency
import dependencies.provider.DebugDependencyProvider
import dependencies.values

object DebugLibs : DebugDependencyProvider {

    const val VERSION_LEAK_CANARY = "2.7"

    override fun debugDependencies() = listOf(
        Dependency("com.squareup.leakcanary", "leakcanary-android", VERSION_LEAK_CANARY)
    ).values()
}