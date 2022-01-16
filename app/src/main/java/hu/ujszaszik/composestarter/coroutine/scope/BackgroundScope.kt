package hu.ujszaszik.composestarter.coroutine.scope

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

val backgroundScope = CoroutineScope(SupervisorJob() + Dispatchers.IO)

fun Any.launchInBackground(block: suspend () -> Unit) {
    backgroundScope.launch { block.invoke() }
}