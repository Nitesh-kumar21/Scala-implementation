package com.rockthejvm

object PatternMatching extends App{
  val anInteger = 12
  val order = anInteger match {
    case 1 => "first"
    case 2 => "second"
    case 3 => "third"
    case _ => anInteger+ "th" //default case
  }
  print(order)

  case class Person(name: String, age: Int)
  val bob = Person("Bob",45)

  val personGreetings = bob match{
    case Person(n, a) => s"\nhi my name is $n and i am $a year old"
    case _=> "Something else"
  }
  println(personGreetings)


}
