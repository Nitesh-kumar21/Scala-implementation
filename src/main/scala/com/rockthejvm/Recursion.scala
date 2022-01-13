package com.rockthejvm

import scala.jdk.Accumulator

object Recursion extends App {
  def factorial(n: Int):Int =
    if(n<=1) 1
    else{
      println("for finding factorial of" + n+ "first we have to find the factorial of " +(n-1))
      val result = n*factorial(n-1)
     println("Factorial of n is" +n)
      result

    }
    println(factorial(10))
  //println(factorial(6000)) // it will crash here because of stack overflow error

//  def anotherFactorial(n:Int):BigInt ={               //used BigInt here instead ofUnit or Int
//    def factHelper(x: Int, accumulator: BigInt): BigInt=
//      if(x<=1) accumulator
//      else factHelper(x-1, x*accumulator)
//      factHelper(n, 1)
//    }
//
//  println(anotherFactorial(10000))


  def concatinationTailRecursion(aString: String, n: Int, accumulator: String): String =
    if(n<=0) accumulator
    else concatinationTailRecursion(aString, n-1, aString + accumulator )

  println(concatinationTailRecursion("Hello", 5,""))

//  def isPrime(n: Int): Boolean ={
//    def isPrimeTailRecursion(t: Int, isStillPrime: Boolean): Boolean=
//      if(!isStillPrime) false
//      else if(t<=1) true
//      else isPrimeTailRecursion(t-1, n%t!=0 && isStillPrime)
//
//      isPrimeTailRecursion(n/2, true)
//
//
//  }
//  println("result for prime number T/F :"+isPrime(629))

  def fact1( n:Int): Int={
    if(n==1 || n==0) return 1
    else {
      n*fact1(n-1)
    }
    fact1(5)
  }

}
