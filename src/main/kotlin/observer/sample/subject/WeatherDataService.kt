package observer.sample.subject

import observer.sample.observer.Observer

class WeatherDataService : Subject {
    private val observers = mutableListOf<Observer>()

    override fun register(o: Observer) {
        observers.add(o)
    }

    override fun unregister(o: Observer) {
        observers.remove(o)
    }

    override fun notifyChange() {
        for (o in observers) {
            println("Notify data change for ${o.name}")
            o.update()
        }
    }

    fun setData() {

    }
}