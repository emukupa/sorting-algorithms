func bubble(arr: inout [Int]){
  var isSorted = false
  var lastSorted = arr.count - 2
  while !isSorted {
    isSorted = true
    for i in 0...lastSorted{
      if arr[i] > arr[i+1] {
        let temp = arr[i]
        arr[i] = arr[i+1]
        arr[i+1] = temp
        isSorted = false
      }
    }
    lastSorted = lastSorted - 1
  }
}

func printArr(arr: inout [Int]){
  print(arr)
}

var nums = [2,6,3,8,1,4,9,7,5]

printArr(arr: &nums)
bubble(arr: &nums)
printArr(arr: &nums)