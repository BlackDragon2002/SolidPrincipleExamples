package `2-openClosedPrinciple`.Violation

import java.security.InvalidParameterException




interface CalculatorOperation {}

class Addition  ( var left: Double, var right: Double ) : CalculatorOperation {}

class Subtraction( var left: Double, var right: Double ) : CalculatorOperation {}

class Calculator {
    fun calculate(operations: List<CalculatorOperation?>): Double {
        var calculation=0.0
        for(operation in operations){
            if (operation == null) {
                throw InvalidParameterException("Can not perform operation")
            }
            calculation += when (operation) {
                is Addition -> {
                    operation.right + operation.left

                }
                is Subtraction -> {
                    operation.right - operation.left
                }
                else -> {
                    throw InvalidParameterException("Can not perform operation")
                }
            }
        }
        return calculation
    }
}