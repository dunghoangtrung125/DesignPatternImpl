package decorator.sample

import decorator.sample.beverage.DarkRoast
import decorator.sample.beverage.Espresso
import decorator.sample.condiment.Milk
import decorator.sample.condiment.Mocha
import decorator.sample.condiment.Whip

fun main() {
    println("-----------------------------------------------------")
    println("-       Decorator design pattern sample             -")
    println("-----------------------------------------------------")

    println("First Client order: Espresso with milk and double mocha")
    println("Serving...")
    var beverage1: Beverage = Espresso()
    beverage1 = Milk(beverage1)
    beverage1 = Mocha(beverage1)
    beverage1 = Mocha(beverage1)

    println("Complete!")
    println(
        """
        Starbuzz coffee bill:
         - decorator.Beverage: ${beverage1.getName()}
         - Cost: ${beverage1.cost()}$
    """.trimIndent()
    )

    println("\n-----------------------------------------------------")
    println("Second Client order: DarkRoast with milk, mocha and whip")
    println("Serving...")
    var beverage2: Beverage = DarkRoast()
    beverage2 = Milk(beverage2)
    beverage2 = Mocha(beverage2)
    beverage2 = Whip(beverage2)

    println("Complete!")
    println(
        """
        Starbuzz coffee bill:
         - decorator.Beverage: ${beverage2.getName()}
         - Cost: ${beverage2.cost()}$
    """.trimIndent()
    )
}