package decorator.condiment

import decorator.Beverage
import decorator.util.Price

class Whip(beverage: Beverage) : CondimentDecorator(beverage) {
    override fun cost(): Double = beverage.cost() + Price.WHIP

    override fun getName(): String = beverage.getName() + ", Whip"
}