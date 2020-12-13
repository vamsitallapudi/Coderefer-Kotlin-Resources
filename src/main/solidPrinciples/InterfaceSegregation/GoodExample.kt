package main.solidPrinciples.InterfaceSegregation

enum class TYPE {
    FAST_FOOD, DESSERT, INDIAN, CHINESE
}

interface Food {
    fun name(): String
    fun type(): TYPE
}

interface ColdFood: Food {
    fun freeze() : String
}
interface HotFood: Food {
    fun boil() : String
}

class IceCream : ColdFood {
    override fun name(): String {
        return "Vanilla"
    }

    override fun type(): TYPE {
        return TYPE.DESSERT
    }

    override fun freeze(): String {
        return "Freezing"
    }

}

class Noodles : HotFood {
    override fun name(): String {
        return "Schezwan Chicken Noodles"
    }

    override fun type(): TYPE {
        return TYPE.FAST_FOOD
    }

    override fun boil(): String {
        return "Boiling"
    }

}