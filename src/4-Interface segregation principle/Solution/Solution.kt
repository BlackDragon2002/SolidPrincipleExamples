package `4-Interface segregation principle`.Solution

interface Mammal{
    fun eat()
    fun sleep()
}

interface Animal {
    fun run()
}

interface Bird{
    fun fly()
}

class Lion:Animal,Mammal{
    override fun run(){}
    override fun eat(){}
    override fun sleep(){}
}

class Eagle:Bird,Mammal{
    override fun eat(){}
    override fun sleep(){}
    override fun fly(){}
}