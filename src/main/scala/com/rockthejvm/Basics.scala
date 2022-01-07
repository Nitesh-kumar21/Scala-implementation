package com.rockthejvm

object Basics extends App {
  val meaningOfLife: Int = 42
  val aBoolean = false
  val aString = "I Love Scala"
  val aComposedString = "I" + "LOVE" + "SCALA"
  val anInterpolatedString = s"The meaning of life is $aComposedString"


  val anExpression = 10 + 2 //in scala everything is an expression that canbe reduce to value

  val ifExpression = if (meaningOfLife < 42) "hello" else 222
  val ChainedIfExpression = if (meaningOfLife < 40) 1
  else if (meaningOfLife < 45) 2
  else if (meaningOfLife < 90) 3
  else 5


  //Recursion
  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * factorial(n - 1)
  }



}
