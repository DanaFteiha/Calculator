/*Dana Fteiha
  20/8/2020
  Simple calculator using kotlin
 */
//main function
fun main(){
    val calculator = Calculator()
    var result: Double = 0.0
    // Reading user input
    println("Please enter the operation: ADD,SUB,MUL,DIV")
    val operation: String= readLine()!!
    println("Please enter the operands")
    val operands: String= readLine()!!
    val array=operands.split(" ")
    val firstNumber: Double= array[0].toDouble()
    val secondNumber: Double= array[1].toDouble()
    when (operation){
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
    println("The result: $result")
}
