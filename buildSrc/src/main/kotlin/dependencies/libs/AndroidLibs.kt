package dependencies.libs

import dependencies.Dependency
import dependencies.provider.DependencyProvider
import dependencies.values

object AndroidLibs : DependencyProvider {

    const val VERSION_ACTIVITY_KTX = "1.3.1"
    const val VERSION_APP_COMPAT = "1.3.1"
    const val VERSION_CORE_KTX = "1.6.0"
    const val VERSION_MATERIAL_DESIGN = "1.4.0"
    const val VERSION_SPLASH_SCREEN = "1.0.0-alpha01"
    const val VERSION_WORKMANAGER = "2.7.0"

    override fun dependencies() = listOf(
        Dependency("androidx.activity", "activity-ktx", VERSION_ACTIVITY_KTX),
        Dependency("androidx.appcompat", "appcompat", VERSION_APP_COMPAT),
        Dependency("androidx.core", "core-ktx", VERSION_CORE_KTX),
        Dependency("androidx.core", "core-splashscreen", VERSION_SPLASH_SCREEN),
        Dependency("androidx.work", "work-runtime-ktx", VERSION_WORKMANAGER),
        Dependency("com.google.android.material", "material", VERSION_MATERIAL_DESIGN),
    ).values()

}

