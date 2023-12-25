package decorator.beverage

import decorator.Beverage
import decorator.util.Price

class Espresso : Beverage() {
    init {
        description = "Espresso"
    }

    override fun cost(): Double {
        return Price.ESPRESSO
    }

}