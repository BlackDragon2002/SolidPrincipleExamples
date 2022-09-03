package `2-openClosedPrinciple`.Solution

import java.security.InvalidParameterException




public interface CalculatorOperation {
    fun getCalculation(): Double
}
class Addition  ( var left: Double, var right: Double ) : CalculatorOperation {
    override fun getCalculation():Double {
        return right+left
    }
}
class Subtraction( var left: Double, var right: Double ) : CalculatorOperation {
    override fun getCalculation(): Double {
        return right-left
    }
}
class Multiplication( var left: Double, var right: Double ) : CalculatorOperation {
    override fun getCalculation(): Double {
        return right*left
    }
}

class Division( var left: Double, var right: Double ) : CalculatorOperation {
    override fun getCalculation(): Double {
        return right/left
    }
}

class Calculator {
    fun calculate(operations: List<CalculatorOperation?>): Double {
        var calculation=0.0
        for(operation in operations){
            if (operation == null) {
                throw InvalidParameterException("Can not perform operation")
            }
            calculation += when (operation) {
                is Addition -> {
                    operation.getCalculation()

                }
                is Subtraction -> {
                    operation.getCalculation()
                }
                else -> {
                    throw InvalidParameterException("Can not perform operation")
                }
            }
        }
        return calculation
    }
}