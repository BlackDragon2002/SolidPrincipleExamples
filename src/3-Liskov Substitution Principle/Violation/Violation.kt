package `3-Liskov Substitution Principle`.Violation

abstract class Delivery {
    abstract fun getOrderNo()
    abstract fun getDeliveryLocation()
}

class FoodDelivery: Delivery() {
    override fun getOrderNo(){
        println("Get order number")
    }


    override fun getDeliveryLocation(){
        println("Get Delivery Location")
    }
}

class AudioBookDelivery: Delivery() {
    override fun getOrderNo(){
        println("Get order number")
    }


    override fun getDeliveryLocation(){
        TODO("Not yet implemented")
    }
}