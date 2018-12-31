fun printArr(arr: Array<Int>){
  print("[")
  for (i in arr.indices){
    print(arr[i])
    if(i != arr.size - 1){
      print(", ")
    }
  }
  println("]")
}

fun swap(arr: Array<Int>, i: Int, j: Int){
  val temp = arr[i]
  arr[i] = arr[j]
  arr[j] = temp
}

fun bubble(arr: Array<Int>){
  var isSorted = false
  var lastSorted = arr.size - 2

  while (!isSorted){
    isSorted = true
    for(i in 0..lastSorted){
      if(arr[i] > arr[i+1]){
        swap(arr, i, i +1)
        isSorted = false
      }
    }
    lastSorted--
  }
}

fun main(args: Array<String>){
  val nums = arrayOf(3,5,1,7,9,2,4,6,8)
  
  printArr(nums)
  bubble(nums)
  printArr(nums)
}