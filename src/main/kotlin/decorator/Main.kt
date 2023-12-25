package decorator

import decorator.beverage.DarkRoast
import decorator.condiment.Milk
import decorator.condiment.Mocha

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