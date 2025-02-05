package main

import (
	"fmt"
	"strings"
)

func joinstring(a ...string) string {
	return strings.Join(a, "....")
}

func main() {

	fmt.Println(joinstring("hello", "Students"))
	fmt.Println(joinstring("hi", "!  Iam", "chakridhar reddy"))
	fmt.Println(joinstring())
	fmt.Println(joinstring("hi", "hello"))
	fmt.Println(joinstring("", "hi"))

	elements := []string{"congrats", "chakridhar"}
	fmt.Println(joinstring(elements...))
}
