package main

import "fmt"

func main() {
	x := 56 // 00111000
	y := 10 // 00001010

	// Bitwise AND
	andResult := x & y
	fmt.Printf("Bitwise AND of %d and %d is %d\n", x, y, andResult)

	// Bitwise OR
	orResult := x | y
	fmt.Printf("Bitwise OR of %d and %d is %d\n", x, y, orResult)

	// Bitwise XOR
	xorResult := x ^ y
	fmt.Printf("Bitwise XOR of %d and %d is %d\n", x, y, xorResult)

	// Left Shift
	leftShift := x << 2
	fmt.Printf("Left Shift of %d by 2 positions is %d\n", x, leftShift)

	// Right Shift
	rightShift := x >> 2
	fmt.Printf("Right Shift of %d by 2 positions is %d\n", x, rightShift)

}
