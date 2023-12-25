package observer.sample.observer

import observer.sample.subject.WeatherService

class Iphone14(override val name: String = "Iphone14", private val service: WeatherService) : Observer, Device {
    override fun update() {
        println("Update display of $name")
        display()
    }

    override fun display() {
        val temperature = service.getTemperature()
        val pressure = service.getPressure()
        val humidity = service.getHumidity()
        println(
            """
            ---- Iphone 14 ----
            - temperature = $temperature -
            - pressure = $pressure -
            - humidity = $humidity -
            ---------------------
        """.trimIndent()
        )
    }
}