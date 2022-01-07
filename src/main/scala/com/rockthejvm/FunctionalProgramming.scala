package com.rockthejvm

object FunctionalProgramming extends App {

  class Person(name: String){
    def apply(age: Int) = print(s"I have age $age years")
  }
  val nitesh = new Person("Nitesh")
  nitesh.apply(25)
  val aFilteredList = List(1,2,3,4,5).filter(x => x<=3)
  println(aFilteredList)

  val aMapList = List(1,2,3,2,4,5).map(_ +3 ) // same as x => x+3
  println(aMapList)

  val allPairs = List(1,2,3).flatMap(number => List ('a','b','c').map(letter => s"$number-$letter"))
  println(allPairs)

  val alternativePair = for{
    number <- List(1,2,3)
    letter <- List('a','b','c')

  }yield s"$number-$letter" // same as above flatmap chain

    val aList =List(1,2,3,45,600)
    val firstElement = aList.head
    val restElement = aList.tail

  val aSet = Set (1,2,3,4,5,6)
  val aSetHas5 = aSet(5)
  val anAddedSet = aSet +9
  val aRemoveSet = aSet -2

  println(anAddedSet)
  println(aRemoveSet)
  println(aSetHas5)


  val aRange = 1 to 100
  val twoByTwo = aRange.map(x =>2 * x).toList
  println(twoByTwo)
}
