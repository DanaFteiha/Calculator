import java.lang.ArithmeticException

//Calculator class
//A simple calculator which takes two integers and perform the four basic operations on them
class Calculator{
    var number = 0
    private var operation = Operation.ADD
    private var firstNumber = 0
    private var secondNumber = 0
    //numbers functions
    fun zeroClicked() {
        //number is more than one digit
        number = if (number != 0)
            (number*10) + 0
        else
            0
    }

    fun oneClicked() {
        //number is more than one digit
        number = if (number != 0)
            (number*10) + 1
        else
            1
    }

    fun twoClicked() {
        //number is more than one digit
        number = if (number != 0)
            (number*10) + 2
        else
            2
    }

    fun threeClicked() {
        //number is more than one digit
        number = if (number != 0)
            (number*10) + 3
        else
            3
    }

    fun fourClicked() {
        //number is more than one digit
        number = if (number != 0)
            (number*10) + 4
        else
            4
    }

    fun fiveClicked() {
        //number is more than one digit
        number = if (number != 0)
            (number*10) + 5
        else
            5
    }

    fun sixClicked() {
        //number is more than one digit
        number = if (number != 0)
            (number*10) + 6
        else
            6
    }

    fun sevenClicked() {
        //number is more than one digit
        number = if (number != 0)
            (number*10) + 7
        else
            7
    }

    fun eightClicked() {
        //number is more than one digit
        number = if (number != 0)
            (number*10) + 8
        else
            8
    }

    fun nineClicked() {
        //number is more than one digit
        number = if (number != 0)
            (number*10) + 9
        else
            9
    }
    //Operations functions
    fun plusClicked() {
        operation = Operation.ADD
        firstNumber = number
        number = 0
    }

    fun minusClicked() {
        operation = Operation.SUB
        firstNumber = number
        number = 0
    }

    fun mulClicked() {
        operation = Operation.MUL
        firstNumber = number
        number = 0
    }

    fun divClicked() {
        operation = Operation.DIV
        firstNumber = number
        number = 0
    }

    fun equalClicked() {
        secondNumber = number
        number = 0
        val result = doOperation(operation,firstNumber,secondNumber)
        if (result == 0 && secondNumber == 0)
            println("The result : infinity")
        else
            println("The result: $result")
    }

    // doOperation function
    // inputs: Two numbers of type Int and the operation name
    // outputs: The result of the equation of type Int
    private fun doOperation(operation: Operation, firstNumber: Int, secondNumber: Int): Int {
        return when (operation) {
            Operation.ADD -> {
                firstNumber + secondNumber
            }//ADDITION
            Operation.SUB -> {
                firstNumber - secondNumber
            }//SUBTRACTION
            Operation.MUL -> {
                firstNumber * secondNumber
            } //MULTIPLICATION
            Operation.DIV -> {
                try {
                    firstNumber / secondNumber
                } catch (e : ArithmeticException){
                    //Handling division by 0
                    println("First Number is $firstNumber and Second number is $secondNumber. You cannot divide something with zero.")
                    0
                }
            }
        }
    }//DIVISION
}

