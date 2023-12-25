package observer.sample.subject

import observer.sample.WeatherData
import observer.sample.observer.Observer

class WeatherService : Subject {
    private lateinit var data: WeatherData
    private val observers = mutableListOf<Observer>()

    override fun register(o: Observer) {
        observers.add(o)
    }

    override fun unregister(o: Observer) {
        observers.remove(o)
    }

    override fun notifyChange() {
        for (o in observers) {
            println("Notify data change to ${o.name}")
            o.update()
        }
    }

    fun setData(data: WeatherData) {
        this.data = data
        notifyChange()
    }

    fun getTemperature() = data.temperature

    fun getHumidity() = data.humidity

    fun getPressure() = data.pressure
}