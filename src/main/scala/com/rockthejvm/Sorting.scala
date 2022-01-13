package com.rockthejvm

object Sorting extends App {
  def selectionSort(array: Array[Int]): Unit ={
    def selectionHelper(array: Array[Int], elem: Int): Array[Int]={

        for(i<- 0 until array.length-1){
          var min =i
          for(j<- i+1 until array.length){
            if(array(j)< array(min)) min =j
          }
          val temp = array(i)
          array(i) =array(min)
          array(min) = temp
        }
        array
      }

  }

}
