package com.eunoia.event

interface EventSubscriber {
    fun subscribe(origin: String, handler: (event: Event) -> Unit)
}
