// package main

// import (
// 	"fmt"
// )

// func main() {
// 	fmt.Println("Hello World !!! Congratulations")

// 	//fmt.Println("This is my First Program")

// 	//var x,y int

// 	//fmt.Println("Enter the two numbers :  ")
// 	//fmt.Scan(&x,&y)
// 	//fmt.Println("Sum (x+y) := ",x+y)
// 	//fmt.Print("x is :",x ,"\ny is : ",y)

// 	// for i:=0; i < 5; i++ {
// 	//     fmt.Println(i)
// 	//   }
// 	var s1 string="hello"
//   var s2="world"
//   s3:="university"
//   fmt.Println(s1,s2,s3)

//   var x int =125
//   if x>100 {
//     fmt.Println(x)
//   }
// }







package main

import (
	"fmt"
)


func printNumbers() {
	fmt.Println("Numbers from 1 to 50:")
	for i := 1; i <= 50; i++ {
		fmt.Print(i, " ")
	}
	fmt.Println()
}


func isEvenOrOdd(n int) string {
	if n%2 == 0 {
		return "Even"
	} else {
		return "Odd"
	}
}


func isPrime(n int) bool {
	if n <= 1 {
		return false
	}
	for i := 2; i*i <= n; i++ {
		if n%i == 0 {
			return false
		}
	}
	return true
}


func factorial(n int) int {
	if n == 0 {
		return 1
	}
	result := 1
	for i := 1; i <= n; i++ {
		result *= i
	}
	return result
}
func swapUsingXOR(a, b int) (int, int) {
	a = a ^ b
	b = a ^ b
	a = a ^ b
	return a, b
}


func swapUsingTemp(a, b int) (int, int) {
	temp := a
	a = b
	b = temp
	return a, b
}

func swapUsingArithmetic(a, b int) (int, int) {
	a = a + b
	b = a - b
	a = a - b
	return a, b
}


func main() {

	printNumbers()

	number := 23
	 fmt.Printf("Number %d is %s\n", number, isEvenOrOdd(number))
	if isPrime(number) {
		fmt.Printf("Number %d is Prime\n", number)
	} else {
		fmt.Printf("Number %d is Not Prime\n", number)
	}

	
	factNumber := 6
	fmt.Printf("Factorial of %d is %d\n", factNumber, factorial(factNumber))

	
	slice := []int{1, 2, 3, 4, 5, 6}
	fmt.Println("slice:", slice)

	slice = append(slice, 7)
	fmt.Println("Slice after appending:", slice)


	a, b := 5, 10

	fmt.Printf("Original numbers: a = %d, b = %d\n", a, b)
	a, b = swapUsingXOR(a, b)
	fmt.Printf("After swapping using XOR: a = %d, b = %d\n", a, b)
	a, b = swapUsingTemp(a, b)
	fmt.Printf("After swapping using temporary variable: a = %d, b = %d\n", a, b)
	a, b = swapUsingArithmetic(a, b)
	fmt.Printf("After swapping using arithmetic operations: a = %d, b = %d\n", a, b)
}
