package hu.ujszaszik.composestarter.coroutine.scope

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

suspend fun launchUnconfined(block: suspend () -> Unit) {
    withContext(Dispatchers.Unconfined) {
        launch { block.invoke() }
    }
}