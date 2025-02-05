package main

import (
	"fmt"
)

func getMax(arr []int) int {
	max := arr[0]
	for _, num := range arr {
		if num > max {
			max = num
		}
	}
	return max
}


func countingSort(arr []int, exp int) {
	n := len(arr)
	output := make([]int, n)
	count := make([]int, 10)

	
	for i := 0; i < n; i++ {
		index := (arr[i] / exp) % 10
		count[index]++
	}

	for i := 1; i < 10; i++ {
		count[i] += count[i-1]
	}

	for i := n - 1; i >= 0; i-- {
		index := (arr[i] / exp) % 10
		output[count[index]-1] = arr[i]
		count[index]--
	}

	for i := 0; i < n; i++ {
		arr[i] = output[i]
	}
}

func radixSort(arr []int) {
	
	max := getMax(arr)

	for exp := 1; max/exp > 0; exp *= 10 {
		countingSort(arr, exp)
	}
}

func main() {
	arr := []int{432, 89, 321, 56, 789, 12, 8, 400}
	fmt.Println("Array before sorting:", arr)

	radixSort(arr)

	fmt.Println("Array after sorting using Radix Sort:", arr)
}
