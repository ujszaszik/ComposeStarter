package hu.ujszaszik.composestarter.coroutine.flow

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow

class SingleEventFlow<T> {
    private val eventChannel = Channel<FlowValue<T>>()
    private val eventFlow = eventChannel.receiveAsFlow()

    @Composable
    fun collectAsStateValue(): T? {
        return eventFlow.collectAsState(initial = FlowValue.Initial()).value.actualValue
    }

    suspend fun emit(value: T?) {
        value?.let {
            eventChannel.send(FlowValue.Filled(it))
        } ?: eventChannel.send(FlowValue.Empty())
    }
}