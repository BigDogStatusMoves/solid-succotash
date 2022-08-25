fun main() {
  var numberToGuess = 0

  while (numberToGuess!=75){
      println("Please guess a number between 1 and 100: ")
      numberToGuess = readln().toInt()
      if (numberToGuess<50)
          println("Guess a much higher number.")
      else if (numberToGuess in (51..74))
          println("Guess just a bit higher than that.")
      else if (numberToGuess>90)
          println("Guess a much lower number.")
      else if (numberToGuess in (76..89))
          println("Just a bit lower and you've got it.")
      else
          println("Great! You guessed correctly!")

  }


}
