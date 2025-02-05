package main

import "fmt"

func bubble(arr []int) []int {
	n := len(arr)
	for i := 0; i < n-1; i++ {
		for j := 0; j < n-i-1; j++ {
			if arr[j] > arr[j+1] {
				// temp := arr[j]
				// arr[j] = arr[j+1]
				// arr[j+1] = temp
				arr[j], arr[j+1] = arr[j+1], arr[j]
			}
		}
	}
	return arr
}
func main() {
	arr := []int{64, 56, 789, 120, 0, 12, 90}
	fmt.Println("Unsorted array:", arr)
	sortedArr := bubble(arr)
	fmt.Println("Sorted array:", sortedArr)
}
