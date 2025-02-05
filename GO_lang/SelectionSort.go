package main
import "fmt"
//
func selectionsort(arr []int)[] int{
	 n := len(arr)
    for i := 0; i < n-1; i++ {
        min_idx := i
        for j := i+1; j < n; j++ {
            if arr[j] < arr[min_idx] {
                min_idx = j
            }
        }
        arr[i], arr[min_idx] = arr[min_idx], arr[i]
    }
    return arr  
}
func main() {
	arr := []int{6,9,16,0,15,37,78}
    fmt.Println("Unsorted array:", arr)
    selectionsort(arr)
    fmt.Println("Sorted array:", arr)
}