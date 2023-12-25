package decorator.condiment

import decorator.Beverage

abstract class CondimentDecorator(protected var beverage: Beverage) : Beverage() {

    abstract override fun getName(): String
}