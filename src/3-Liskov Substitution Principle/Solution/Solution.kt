package `3-Liskov Substitution Principle`.Solution

interface Delivery {
     fun getOrderNo()
}

open class OfflineDelivery:Delivery{
    open fun getDeliveryLocations(){}
    override fun getOrderNo(){}
}

open class OnlineDelivery:Delivery{
    open fun getSoftwareID(){}
    override fun getOrderNo(){}
}

class FoodDelivery: OfflineDelivery() {
    override fun getDeliveryLocations() {
    }
}

class AudioBookDelivery: OnlineDelivery() {
    override fun getSoftwareID(){}
}
