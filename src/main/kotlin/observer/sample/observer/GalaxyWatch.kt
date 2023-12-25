package observer.sample.observer

import observer.sample.subject.WeatherService

class GalaxyWatch(override val name: String = "GalaxyWatch", private val service: WeatherService) : Observer, Device {
    override fun update() {
        println("Update display of $name")
        display()
    }

    override fun display() {
        val temperature = service.getTemperature()
        val humidity = service.getHumidity()
        println(
            """
            ---- Galaxy Watch ----
            - temperature = $temperature -
            - humidity = $humidity -
            ---------------------
        """.trimIndent()
        )
    }
}