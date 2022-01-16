package hu.ujszaszik.composestarter.coroutine.flow

import kotlinx.coroutines.flow.StateFlow

typealias SafeStateFlow<T> = StateFlow<FlowValue<T>>