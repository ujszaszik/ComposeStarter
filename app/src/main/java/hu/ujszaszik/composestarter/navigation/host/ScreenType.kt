package hu.ujszaszik.composestarter.navigation.host

enum class ScreenType {
    WRAP_CONTENT_SIZE, FILL_MAX_SIZE;

    val isFillMaxSize: Boolean
        get() = this == FILL_MAX_SIZE
}