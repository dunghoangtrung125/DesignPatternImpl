package observer.sample.observer

import observer.sample.subject.WeatherService

class AppleWatch(override val name: String = "AppleWatch", private val service: WeatherService) : Observer, Device {

    override fun update() {
        println("Update display of $name")
        display()
    }

    override fun display() {
        val temperature = service.getTemperature()
        println(
            """
            ---- Apple Watch ----
            - temperature = $temperature -
            ---------------------
        """.trimIndent()
        )
    }
}