package hu.ujszaszik.composestarter.coroutine.scope

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

val applicationScope = CoroutineScope(SupervisorJob() + Dispatchers.Default)

fun launch(block: suspend () -> Unit) {
    applicationScope.launch { block.invoke() }
}