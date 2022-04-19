fun main() {
    val options = arrayOf("Rock" , "Paper" , "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    val result = printResult(userChoice , gameChoice)
    println("You choice $userChoice. I choice $gameChoice. $result")
}

fun getGameChoice(optionsParam: Array<String>): String {
    return optionsParam[(Math.random() * optionsParam.size).toInt()]
}

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    while (!isValidChoice) {
        println("Please enter one of the following: Rock Paper Scissors.")
        val userInput = readLine()
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }
        if (!isValidChoice) println("You must enter a valid choice. Вы должны ввести правильный выбор")
    }
    return userChoice
}

fun printResult(userChoice: String , gameChoice: String): String {
    return if (userChoice == gameChoice) "Tie"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") || (userChoice == "Paper" && gameChoice == "Rock") ||
        (userChoice == "Scissors" && gameChoice == "Paper")
    ) "You win"
    else "You lose"
}
