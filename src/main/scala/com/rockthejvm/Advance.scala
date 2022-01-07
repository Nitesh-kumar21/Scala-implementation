package com.rockthejvm

object Advance extends App {

  lazy val aLazyValue = 2
  lazy val lazyValueWithSideEffect = {
    println("I am so lazy")
    44
  }
  val eagerValue =lazyValueWithSideEffect +1
  def methodWhichCanReturnNull(): String ="Hello, scala"


}
