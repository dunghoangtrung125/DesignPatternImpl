package decorator.sample.beverage

import decorator.sample.Beverage
import decorator.sample.util.Price

class DarkRoast : Beverage() {
    init {
        description = "DarkRoast"
    }

    override fun cost(): Double {
        return Price.DARK_ROAST
    }
}