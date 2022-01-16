package hu.ujszaszik.composestarter.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import hu.ujszaszik.composestarter.coroutine.flow.emitValue
import hu.ujszaszik.composestarter.coroutine.flow.mutableSafeBoolFlow
import hu.ujszaszik.composestarter.coroutine.flow.mutableSafeStateFlow
import hu.ujszaszik.composestarter.coroutine.flow.resetValue
import hu.ujszaszik.composestarter.coroutine.viewmodel.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {

    internal val navigator = mutableSafeStateFlow<String>()
    internal val onBackPressed = mutableSafeBoolFlow()

    internal fun onBackPressed() = launch { onBackPressed.emitValue(true) }

    internal fun resetBackPress() = launch { onBackPressed.resetValue(viewModelScope) }
}