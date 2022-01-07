package com.rockthejvm

object Expression extends App {

  val aCondition = true
  val aConditionValue = if(aCondition) 25 else 21
  println(aConditionValue)
  println(if(aCondition) 12 else 11)

  //Code block

  val aCodeBLock = {
    val a = 20
    val b = a+20

    if(b==40) "yeah i am done" else "not a big deal"
  }
  println(aCodeBLock)

  val someValue ={
    5>10
  }
  val someAnotherValue ={
    if(someValue) 123 else 111
    println("hello")
    11
                                  // code block always execute the last expression of the block
  }
  print("Some value is " +someValue)
  println("\nsomeAnother Value is " +someAnotherValue)

}
