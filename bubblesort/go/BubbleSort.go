package main

import (
	"fmt"
)

type numbers [9]int

func bubble(arr *numbers, size int){
	var isSorted = false
	var lastSorted = size - 1
	
	for !isSorted {
		isSorted = true
		for i := 0; i < lastSorted; i++ {
			if arr[i] > arr[i+1] {
				swap(arr, i, i+1)
				isSorted = false
			}
		}
		lastSorted--
	}
}

func swap(arr *numbers,i int, j int){
	var temp = arr[i]
	arr[i] = arr[j]
	arr[j] = temp
}

func printArr(arr *numbers, size int){
	fmt.Print("[")
	for i := 0; i < size; i++{
		fmt.Print(arr[i])
		if(i != 8){
			fmt.Print(", ")
		}
	}
	fmt.Println("]")
}

func main(){
	var nums *numbers = new(numbers)
	var size = 0
	nums[0] = 4
	size += 1

	nums[1] = 3
	size += 1

	nums[2] = 2
	size += 1

	nums[3] = 6
	size += 1

	nums[4] = 1
	size += 1

	nums[5] = 7
	size += 1

	nums[6] = 9
	size += 1

	nums[7] = 5
	size += 1

	nums[8] = 8
	size += 1

	printArr(nums,size)
	bubble(nums, size)
	printArr(nums, size)
}