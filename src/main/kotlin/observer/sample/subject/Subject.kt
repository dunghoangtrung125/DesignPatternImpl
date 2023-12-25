package observer.sample.subject

import observer.sample.observer.Observer

interface Subject {
    fun register(o: Observer)

    fun unregister(o: Observer)

    fun notifyChange()
}