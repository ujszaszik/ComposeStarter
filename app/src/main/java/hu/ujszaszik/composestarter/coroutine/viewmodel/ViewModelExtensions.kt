package hu.ujszaszik.composestarter.coroutine.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import hu.ujszaszik.composestarter.coroutine.flow.FlowValue
import hu.ujszaszik.composestarter.coroutine.flow.MutableSafeStateFlow
import hu.ujszaszik.composestarter.coroutine.flow.SingleEventFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

fun ViewModel.launch(block: suspend () -> Unit) {
    viewModelScope.launch { block.invoke() }
}

fun <T> ViewModel.emitValueTo(flow: MutableSafeStateFlow<T>, value: T?) {
    viewModelScope.launch {
        value?.let { flow.emit(FlowValue.Filled(it)) }
            ?: flow.emit(FlowValue.Empty())
    }
}

fun <T> ViewModel.emitCalculatedValueTo(flow: MutableSafeStateFlow<T>, value: () -> T?) {
    emitValueTo(flow, value.invoke())
}

fun <T> ViewModel.emitTo(flow: MutableStateFlow<T>, value: T) {
    viewModelScope.launch { flow.emit(value) }
}

fun <T> ViewModel.emitTo(flow: MutableStateFlow<T>, value: () -> T) {
    emitTo(flow, value.invoke())
}

fun ViewModel.emitTrueTo(flow: MutableSafeStateFlow<Boolean>) {
    viewModelScope.launch { flow.emit(FlowValue.Filled(true)) }
}

fun ViewModel.emitFalseTo(flow: MutableSafeStateFlow<Boolean>) {
    viewModelScope.launch { flow.emit(FlowValue.Filled(false)) }
}

fun <T> ViewModel.emitSingleEventTo(flow: SingleEventFlow<T>, value: T) {
    viewModelScope.launch { flow.emit(value) }
}

fun <T> ViewModel.emitSingleEventTo(flow: SingleEventFlow<T>, block: () -> T) {
    emitSingleEventTo(flow, block.invoke())
}