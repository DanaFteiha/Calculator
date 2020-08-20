//Calculator class
class Calculator () {
    var operation: Operation = Operation.NONE
    /*doOperation function
    inputs: Two numbers of type Double and the operation name
    outputs: The result of the equation of type Double
     */
    fun doOperation(operation: Operation, firstNumber: Double, secondNumber: Double): Double {
        var result: Double = 0.0
        this.operation = operation
        if (operation == Operation.ADD) {
            result = firstNumber + secondNumber
        }//ADDITION
        else if (operation == Operation.SUB) {
            result = firstNumber - secondNumber
        }//SUBTRACTION
        else if (operation == Operation.MUL) {
            result = firstNumber * secondNumber
        } //MULTIPLICATION
        else {
            if (secondNumber != 0.0)
                result = firstNumber / secondNumber
            else {
                //Handling division by 0
                println("First Number is $firstNumber and Second number is $secondNumber. You cannot divide something with zero.")
                result = firstNumber / secondNumber
            }
        }//DIVISION
        return result
        }
    }

