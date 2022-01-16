package hu.ujszaszik.composestarter.coroutine.flow

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import kotlinx.coroutines.flow.StateFlow

@Composable
fun <T> StateFlow<FlowValue<T>>.collectAsStateValue(): T? {
    return this.collectAsState().value.actualValue
}