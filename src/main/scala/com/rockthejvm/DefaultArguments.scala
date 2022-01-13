package com.rockthejvm

object DefaultArguments extends App {

    def tailRec(n:Int, acc:Int=1): Int=
      if(n<=1) 1
      else tailRec(n-1, n*acc)

     val fact=tailRec(10)
  println(fact)

  def savePicture(format:String ,width:Int=1920, height:Int=2020):Unit= println("Saving Picture")
//  savePicture(width = 800)
  savePicture(height = 600,width = 800, format = "bmp")



}
