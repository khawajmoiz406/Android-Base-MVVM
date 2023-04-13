package com.centerpoint.connect.util

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

/**
@author Khawaja Moiz
created on 1/23/23
 **/
object StopwatchUtils {

    private var watch: Job? = null
    private var time = 0L

    fun start(
        coroutineContext: CoroutineContext,
        onIncrement: (String) -> Unit
    ) {
        if (watch == null) {
            watch = CoroutineScope(coroutineContext).launch(Dispatchers.Main) {
                while (true) {
                    increment(onIncrement)
                }
            }
        }
    }

    fun stop(reset: Boolean) {
        if (reset) time = 0L
        watch?.cancel()
        watch = null
    }

    fun isWatchRunning() = watch != null

    private fun getStopwatchTime(): String {
        val seconds = (time / 1000) / 60
        val minutes = (time / 1000) % 60
        return String.format("%02d:%02d", seconds, minutes)
    }

    private suspend fun increment(onIncrement: (String) -> Unit) {
        delay(1000)
        time += 1000
        onIncrement.invoke(getStopwatchTime())
    }
}