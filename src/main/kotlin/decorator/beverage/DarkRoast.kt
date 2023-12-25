package decorator.beverage

import decorator.Beverage
import decorator.util.Price

class DarkRoast : Beverage() {
    init {
        description = "DarkRoast"
    }

    override fun cost(): Double {
        return Price.DARK_ROAST
    }
}