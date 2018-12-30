def bubble(arr)
  isSorted = false
  lastSorted = arr.size - 2
  while !isSorted
    for i in 0..lastSorted
      isSorted = true
      if arr[i] > arr[i+1]
        temp = arr[i]
        arr[i] = arr[i+1]
        arr[i+1] = temp 
        isSorted = false
      end
    end
    lastSorted = lastSorted - 1
  end
end

def printArr(arr)
  i = 0
  print "["
  for num in arr 
    print num
    i = i + 1
    if i != arr.length 
      print ", "
    end
  end
  puts "]"
end

nums = [5,1,2,8,3,9,4,6,7]
printArr(nums)
bubble(nums)
printArr(nums)