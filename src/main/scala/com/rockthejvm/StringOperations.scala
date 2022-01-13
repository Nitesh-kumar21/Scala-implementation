package com.rockthejvm

object StringOperations extends App {
  val str ="Hello here ia am with my scala code ....."

  println(str.charAt(2))
  println(str.substring(22,40))
  println(str.split(" ").toList)
  println(str.startsWith("H"))
  println(str.startsWith("Hell"))
  println(str.startsWith("am"))
  println(str.toUpperCase())
  println(str.length)


  val aNumString ="45"
  val aNum= aNumString.toInt
  println("ajbjbcu" +:  aNumString :+ 'Z')
  println(str.reverse)
  println(str.take(10)) // always stars from starting whereas for picking any data use substring

// String Interpolator
// S-INterpolator
  val name = "Nitesh Chaudhary"
  val age ="24"
  val say= s"Hello My name is $name and i am $age years old"
  println(say)

  // F-Interpoloter

  val speed = 120
  val ret =f"$name can ride his bike at the speed of  $speed KMPH   yeahhhh......."
  println(ret)
}
