fun main(){
    println("Calculator 8000")
    println("----------------")
    val firstInput = getDouble("Please enter a number: ")
    val secondInput = getDouble("Please enter a number: ")
    menu(firstInput, secondInput)
}

fun menu(firstInput: Double, secondInput: Double){
    println("Choose an operator: +,-,*,/")
    val operator = readln()

    when(operator){
        "+" -> {
            val answer = firstInput + secondInput
            println("$firstInput + $secondInput = $answer")
        }
        "-" ->{
            val answer = firstInput - secondInput
            println("$firstInput - $secondInput = $answer")
        }
        "*" -> {
            val answer = firstInput * secondInput
            println("$firstInput * $secondInput = $answer")
        }
        "/" -> {
            val answer = firstInput / secondInput
            println("$firstInput / $secondInput = $answer")
        }

    }
    
}

fun getDouble(prompt: String): Double{
    var doubleValue: Double?
    while (true) {
        val userInput = getString(prompt)
        doubleValue = userInput.toDoubleOrNull()
        if (doubleValue != null) break
    }
    return doubleValue!!

}


fun getString(prompt: String): String {
    var userInput:  String
    while (true){
        print(prompt)
        userInput = readln()
        if (userInput.isNotBlank()) break
    }
    return userInput
}


