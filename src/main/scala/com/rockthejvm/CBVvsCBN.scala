package com.rockthejvm

object CBVvsCBN extends App {

  def callByValue(x: Long): Unit ={
    print("by value "+x)
    print((" by value "+x))
  }
  def callByName(x: => Long): Unit={
    println("call By Name: " +x)
    println("Call By Name: " +x)

    def infinite(): Int =1 + infinite()
    def printFirst(x:Int, y: => Int) = println(x)
   // printFirst(infinite(),34)
  printFirst(34, infinite())

  }

  callByName(System.nanoTime())
  callByName(System.nanoTime())

}
