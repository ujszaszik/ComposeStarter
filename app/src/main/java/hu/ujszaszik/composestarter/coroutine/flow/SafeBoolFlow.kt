package hu.ujszaszik.composestarter.coroutine.flow

import kotlinx.coroutines.flow.StateFlow

typealias SafeBoolFlow = StateFlow<FlowValue<Boolean>>