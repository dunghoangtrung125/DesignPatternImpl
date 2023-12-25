package decorator.sample.condiment

import decorator.sample.Beverage
import decorator.sample.util.Price

class Mocha(beverage: Beverage) : CondimentDecorator(beverage) {
    override fun cost(): Double = beverage.cost() + Price.MOCHA

    override fun getName(): String = beverage.getName() + ", Mocha"
}