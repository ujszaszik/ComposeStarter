package hu.ujszaszik.composestarter.coroutine.flow

sealed class FlowValue<T> {
    class Initial<T> : FlowValue<T>()
    class Empty<T> : FlowValue<T>()
    class Filled<T>(val data: T) : FlowValue<T>()

    val actualValue: T?
        get() = if (this is Filled) data else null
}

fun FlowValue<String>.isEmpty() = actualValue.isNullOrEmpty()