package decorator.condiment

import decorator.Beverage
import decorator.util.Price

class Milk(beverage: Beverage) : CondimentDecorator(beverage) {

    override fun cost(): Double = beverage.cost() + Price.MILK

    override fun getName(): String = beverage.getName() + ", Milk"
}