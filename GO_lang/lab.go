package main
import "fmt"
func main() {
    var a, b int = 5,125
    fmt.Println("Before swapping: a =", a, "b =", b)
    // Using XOR
    a = a ^ b
    b = a ^ b
    a = a ^ b
    fmt.Println("After swapping using XOR: a =", a, "b =", b)
}
