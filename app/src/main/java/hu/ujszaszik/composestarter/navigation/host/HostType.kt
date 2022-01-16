package hu.ujszaszik.composestarter.navigation.host

enum class HostType {
    // Shows no App Bar
    DEFAULT,

    // Shows App Bar with hamburger menu
    MAIN,

    // Shows App Bar with back arrow
    SUB;

    val showAppBar: Boolean
        get() = this != DEFAULT
}