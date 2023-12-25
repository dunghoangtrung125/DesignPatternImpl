package observer.sample.observer

import observer.sample.subject.WeatherDataService

class AppleWatch(override val name: String = "AppleWatch", data: WeatherDataService) : Observer, Device {
    override fun update() {
    }

    override fun display() {
    }
}