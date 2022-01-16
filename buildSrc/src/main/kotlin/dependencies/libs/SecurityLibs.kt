package dependencies.libs

import dependencies.Dependency
import dependencies.provider.DependencyProvider
import dependencies.values

object SecurityLibs : DependencyProvider {

    const val VERSION_CRYPTO = "1.0.0"
    const val VERSION_SQL_CIPHER = "4.4.0"

    override fun dependencies() = listOf(
        Dependency("androidx.security", "security-crypto", VERSION_CRYPTO),
        Dependency("net.zetetic", "android-database-sqlcipher", VERSION_SQL_CIPHER)
    ).values()
}