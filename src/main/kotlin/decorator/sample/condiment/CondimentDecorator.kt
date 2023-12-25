package decorator.sample.condiment

import decorator.sample.Beverage

abstract class CondimentDecorator(protected var beverage: Beverage) : Beverage() {

    abstract override fun getName(): String
}