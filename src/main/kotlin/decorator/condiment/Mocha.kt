package decorator.condiment

import decorator.Beverage
import decorator.util.Price

class Mocha(beverage: Beverage) : CondimentDecorator(beverage) {
    override fun cost(): Double = beverage.cost() + Price.MOCHA

    override fun getName(): String = beverage.getName() + ", Mocha"
}