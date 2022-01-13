package com.rockthejvm

import java.util


object Sortingg  { // Recursive function to sort an array using
  // insertion sort
  def insertionSortRecursive(arr: Array[Int], n: Int): Unit = { // Base case
    if (n <= 1) return
    // Sort first n-1 elements
    insertionSortRecursive(arr, n - 1)
    // Insert last element at its correct position
    // in sorted array.
    val last = arr(n - 1)
    var j = n - 2
    /* Move elements of arr[0..i-1], that are
              greater than key, to one position ahead
              of their current position */ while ( {
      j >= 0 && arr(j) > last
    }) {
      arr(j + 1) = arr(j)
      j -= 1
    }
    arr(j + 1) = last
  }

  // Driver Method
  def main(args: Array[String]): Unit = {
    val arr = Array(12, 11, 13, 5, 6)
    insertionSortRecursive(arr, arr.length)
    //System.out.println(util.Arrays.toString(arr))
  }
}