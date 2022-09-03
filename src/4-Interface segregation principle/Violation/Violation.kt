package `4-Interface segregation principle`.Violation

interface Mammal{
    fun eat()
    fun run()
    fun sleep()
    fun fly()
}
class Lion:Mammal{
    override fun eat(){}

    override fun run(){}

    override fun sleep(){}

    override fun fly(){}

}
class Eagle:Mammal{
    override fun eat(){}

    override fun run(){}

    override fun sleep(){}

    override fun fly(){}
}