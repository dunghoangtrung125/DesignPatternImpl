package decorator.sample

import decorator.sample.beverage.DarkRoast
import decorator.sample.condiment.Milk
import decorator.sample.condiment.Mocha

fun main() {
    println("Client order: Espresso with milk and mocha")
    println("Serving...")
    var beverage: Beverage = DarkRoast()
    beverage = Milk(beverage)
    beverage = Mocha(beverage)
    beverage = Mocha(beverage)

    println("Complete!")
    println(
        """
        Starbuzz coffee:
         - decorator.Beverage: ${beverage.getName()}
         - Cost: ${beverage.cost()}$
    """.trimIndent()
    )
}