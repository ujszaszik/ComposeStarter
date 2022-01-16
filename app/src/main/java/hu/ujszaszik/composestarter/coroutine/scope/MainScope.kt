package hu.ujszaszik.composestarter.coroutine.scope

import android.view.View
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

val mainScope = CoroutineScope(SupervisorJob() + Dispatchers.Main)

fun View.launch(block: suspend () -> Unit) {
    applicationScope.launch { block.invoke() }
}