/*Dana Fteiha
  20/8/2020
  Simple calculator using kotlin
 */

//main function
fun main() {
    val calculator = Calculator()
    var number = 0
    var firstNumber = 0
    var operation = ""
    var secondNumber = 0
    var result = 0
    //read user input
    println("Enter the equation")
    val equation: String = readLine()!!
    //change string into a char array
    for (char in equation.toCharArray()) {
        //analysing the equation depending on the char
        when (char) {
            '0' -> {
                //number is more than one digit
                number = if (number != 0)
                    (number*10) + calculator.zeroClicked()
                else
                    calculator.zeroClicked()
            }
            '1' -> {
                number = if (number != 0)
                    (number*10) + calculator.oneClicked()
                else
                    calculator.oneClicked()
            }
            '2' -> {
                number = if (number != 0)
                    (number*10) + calculator.twoClicked()
                else
                    calculator.twoClicked()
            }
            '3' -> {
                number = if (number != 0)
                    (number*10) + calculator.threeClicked()
                else
                    calculator.threeClicked()
            }
            '4' -> {
                number = if (number != 0)
                    (number*10) + calculator.fourClicked()
                else
                    calculator.fourClicked()
            }
            '5' -> {
                number = if (number != 0)
                    (number*10) + calculator.fiveClicked()
                else
                    calculator.fiveClicked()
            }
            '6' -> {
                number = if (number != 0)
                    (number*10) + calculator.sixClicked()
                else
                    calculator.sixClicked()
            }
            '7' -> {
                number = if (number != 0)
                    (number*10) + calculator.sevenClicked()
                else
                    calculator.sevenClicked()
            }
            '8' -> {
                number = if (number != 0)
                    (number*10) + calculator.eightClicked()
                else
                    calculator.eightClicked()
            }
            '9' -> {
                number = if (number != 0)
                    (number*10) + calculator.nineClicked()
                else
                    calculator.nineClicked()
            }
            '+' -> {
                operation = calculator.plusClicked()
                firstNumber = number
                number = 0
            }
            '-' -> {
                operation = calculator.minusClicked()
                firstNumber = number
                number = 0
            }
            '*' -> {
                operation = calculator.mulClicked()
                firstNumber = number
                number = 0
            }
            '/' -> {
                operation = calculator.divClicked()
                firstNumber = number
                number = 0
            }
            '=' -> {
                var equalOperation = calculator.equalClicked()
                secondNumber = number
                number = 0
                result = calculateOperation(calculator,firstNumber,secondNumber,operation)
                println("The result: $result")
            }
        }
    }
}
// calculateOperation function
// inputs: Two numbers of type Int, calculator,and the operation name
// outputs: The result of the equation of type Int
fun calculateOperation(calculator : Calculator,firstNumber : Int, secondNumber : Int, operation : String) : Int{
    var result = 0
    when (operation) {
        "ADD" -> {
            result = calculator.doOperation(Operation.ADD, firstNumber, secondNumber)
        }
        "SUB" -> {
            result = calculator.doOperation(Operation.SUB, firstNumber, secondNumber)
        }
        "MUL" -> {
            result = calculator.doOperation(Operation.MUL, firstNumber, secondNumber)
        }
        "DIV" -> {
            result = calculator.doOperation(Operation.DIV, firstNumber, secondNumber)
        }
        else -> {
            println("Enter one of the four operations only")
        }
    }
    return result
}
