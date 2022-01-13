package com.rockthejvm

object Searching extends App {

  def binarySearch(array:Array[Int], elem: Int): Boolean={

    def binaryHelper(array: Array[Int], elem:Int, lowerIndex:Int, higherIndex:Int): Boolean={
      if(elem > array(higherIndex)){
        false
      }else{
        val mid =(lowerIndex+higherIndex)/2
        if(elem == array(mid)){
          true
        }else if(elem<array(mid)){
          binaryHelper( array,elem, lowerIndex, mid-1)
        }else
          {
            binaryHelper(array, elem, mid+1, higherIndex)
          }
      }
    }
    binaryHelper(array,elem,5 ,array.length-1)
  }
  println(binarySearch(Array(1,2,3,4,5,6,7,8,9),7))

}
