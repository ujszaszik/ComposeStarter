package hu.ujszaszik.composestarter.coroutine.flow

typealias MutableSafeBoolFlow = MutableSafeStateFlow<Boolean>

fun mutableSafeBoolFlow(): MutableSafeBoolFlow = mutableSafeStateFlow()