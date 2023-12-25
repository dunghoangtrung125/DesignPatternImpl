package decorator.sample.condiment

import decorator.sample.Beverage
import decorator.sample.util.Price

class Milk(beverage: Beverage) : CondimentDecorator(beverage) {

    override fun cost(): Double = beverage.cost() + Price.MILK

    override fun getName(): String = beverage.getName() + ", Milk"
}