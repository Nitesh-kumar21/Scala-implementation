package com.rockthejvm

object Function extends App {
  def aFunction(a: String, b: Int): String= {
    a +" "+ b
  }
  def aRepeatedFunction(aString: String , n: Int): String = {
    if(n==1) aString
    else aString + "\n" + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("Hello" , 5))

  //Recursion

  def aFunctionWithSideEffect(aString: String ): Unit = println(aString)

  def aBigFunction(n : Int): Int={
    def aSmallFunction(a: Int, b: Int): Int = a+b
    aSmallFunction(n, n-1)


}
