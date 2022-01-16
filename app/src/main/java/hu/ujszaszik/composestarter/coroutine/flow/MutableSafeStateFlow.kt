package hu.ujszaszik.composestarter.coroutine.flow

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

typealias MutableSafeStateFlow<T> = MutableStateFlow<FlowValue<T>>

val <T> MutableSafeStateFlow<T>.flowValue: T?
    get() = when (value) {
        is FlowValue.Filled -> (value as FlowValue.Filled<T>).data
        else -> null
    }

suspend fun <T> MutableSafeStateFlow<T>.emitValue(value: T) {
    emit(FlowValue.Filled(value))
}

fun <T> mutableSafeStateFlow(): MutableSafeStateFlow<T> {
    return MutableStateFlow(FlowValue.Initial())
}

fun <T> mutableSafeStateFlow(value: T): MutableSafeStateFlow<T> {
    return MutableStateFlow(FlowValue.Filled(value))
}

fun <T> MutableSafeStateFlow<T>.resetValue(coroutineScope: CoroutineScope) {
    coroutineScope.launch { emit(FlowValue.Empty()) }
}