package com.rockthejvm

object ObjectOrientation extends App {

  class Student {
    val age: Int = 20
    val standard: Int = 12

    def desc() = println("Hello i am the student 1")
  }

  class Person(val name: String) extends Student

  val aPerson = new Person("Nitesh")



  trait Head {
    def work(student: Student): Unit
  }

  trait Philosopher {
    def ?!(thought: String): Unit // ?! is valid method name ....
  }

  class Single extends Student with Head {
    override def work(student: Student): Unit = println("yes i am single")

    def ?!(thought: String): Unit = println(s"I Was thinking: ${thought}")
  }

  val aSingle = new Single
  aSingle.work(aPerson)
}
