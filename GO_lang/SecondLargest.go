package main
import "fmt"
func findSecondLargest(arr []int) int {
    first, second := arr[0], arr[0]
    for _, num := range arr {
        if num > first {
            second = first
            first = num
        } else if num > second && num != first {
            second = num
        }
    }
    return second
}
func main() { 
    arr := []int{10, 3, 5, 101, 9, -233, 6, 8, 777, 4}
    secondLargest := findSecondLargest(arr)
    fmt.Printf("The second largest number in the array is: %d\n", secondLargest)
}
