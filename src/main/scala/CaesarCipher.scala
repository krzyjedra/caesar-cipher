object CaesarCipher extends App {

  def countingMethod(c: Char, n: Int): Char = {
    val letterNr = c.toInt - 97
    val letter = n
    val b = letterNr + letter
    val lastCalculation = {
      if (b > 26) b % 26 + 97
      else b + 97
    }
    lastCalculation.toChar
  }
}
