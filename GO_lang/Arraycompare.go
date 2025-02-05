package main

import "fmt"

func main() {
    array1 := []int{1, 4, 3, 18, 5}
    array2 := []int{12, 3, 47, 11, 46}
    result := greaterElements(array1, array2)
    fmt.Println("Resulting array: ", result)
}

func greaterElements(arr1, arr2 []int) []int {
    if len(arr1) != len(arr2) {
        fmt.Println("Arrays must have the same length")
        return nil
    }

    result := make([]int, len(arr1))

    for i := 0; i < len(arr1); i++ {
        if arr1[i] > arr2[i] {
            result[i] = arr1[i]
        } else {
            result[i] = arr2[i]
        }
    }

    return result
}
