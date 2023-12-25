package decorator.sample.beverage

import decorator.sample.Beverage
import decorator.sample.util.Price

class Espresso : Beverage() {
    init {
        description = "Espresso"
    }

    override fun cost(): Double {
        return Price.ESPRESSO
    }

}