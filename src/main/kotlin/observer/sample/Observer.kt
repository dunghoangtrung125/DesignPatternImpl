package observer.sample

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import observer.sample.observer.AppleWatch
import observer.sample.observer.GalaxyWatch
import observer.sample.observer.Iphone14
import observer.sample.subject.WeatherService

fun main() = runBlocking {
    println("-----------------------------------------------------")
    println("-       Observer design pattern sample              -")
    println("-----------------------------------------------------")

    val service = WeatherService()

    val appleWatch = AppleWatch(service = service)
    val galaxyWatch = GalaxyWatch(service = service)
    val iphone14 = Iphone14(service = service)
    service.register(appleWatch)
    service.register(galaxyWatch)
    service.register(iphone14)

    println("Weather data update every 10 seconds")
    println("-----------------------------------------------------\n")
    while (true) {
        val temperature = (0..40).random().toFloat()
        val humidity = (10..98).random().toFloat()
        val pressure = (100..1000).random().toFloat()
        val data = WeatherData(temperature = temperature, humidity = humidity, pressure = pressure)
        service.setData(data)
        delay(10000)
    }
}