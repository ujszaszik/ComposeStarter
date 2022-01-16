package hu.ujszaszik.composestarter.notification

import java.util.concurrent.atomic.AtomicInteger

object NotificationId {
    private const val INITIAL_VALUE = 10000
    private val atomicInteger = AtomicInteger(INITIAL_VALUE)

    val value: Int
        get() = atomicInteger.incrementAndGet()
}