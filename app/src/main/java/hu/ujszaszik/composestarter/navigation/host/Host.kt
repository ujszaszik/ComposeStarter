package hu.ujszaszik.composestarter.navigation.host

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.squareup.moshi.JsonClass
import com.squareup.moshi.Moshi

internal val hostAdapter = Moshi.Builder().build().adapter(Host::class.java)

@JsonClass(generateAdapter = true)
data class Host(
    var route: String,
    val title: String = "",
    val type: HostType = HostType.DEFAULT,
    val screenType: ScreenType = ScreenType.FILL_MAX_SIZE,
    val screenPadding: Int = 0,
    val iconId: Int? = null,
    var menuOrdinal: Int? = null,
    val optionsMenuItems: List<OptionsMenuItem> = emptyList(),
    val allowBackPress: Boolean = true
)

fun Host?.actualType(): HostType = this?.type ?: HostType.DEFAULT

fun Host?.actualScreenType(): ScreenType = this?.screenType ?: ScreenType.FILL_MAX_SIZE

fun Host?.actualPadding(): Dp = this?.screenPadding?.dp ?: 0.dp

fun Host?.showTopAppBar(): Boolean = this?.type?.showAppBar ?: false

fun Host?.isMainHost(): Boolean = this.actualType() == HostType.MAIN

fun Host?.isSubHost(): Boolean = this.actualType() == HostType.SUB

fun Host?.menuItems(): List<OptionsMenuItem> = this?.optionsMenuItems.orEmpty()

fun Host?.allowBackPress(): Boolean = this?.allowBackPress ?: true

fun Host.compress(): String = hostAdapter.toJson(this)

fun String.extractHost(): Host? = hostAdapter.fromJson(this)

// path/{param}
fun Host.acceptParam(param: String): Host = apply {
    route = StringBuilder().apply {
        append(route)
        append("/{")
        append(param)
        append("}")
    }.toString()
}

inline fun <reified T> Host.withData(data: T?): String {
    return route.plus(Moshi.Builder().build().adapter(T::class.java).toJson(data))
}