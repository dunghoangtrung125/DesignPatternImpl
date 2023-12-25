package decorator.sample

abstract class Beverage {
    protected var description: String = "Unknown beverage"

    abstract fun cost(): Double

    open fun getName(): String = description
}