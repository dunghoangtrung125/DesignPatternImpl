package decorator.sample.condiment

import decorator.sample.Beverage
import decorator.sample.util.Price

class Whip(beverage: Beverage) : CondimentDecorator(beverage) {
    override fun cost(): Double = beverage.cost() + Price.WHIP

    override fun getName(): String = beverage.getName() + ", Whip"
}