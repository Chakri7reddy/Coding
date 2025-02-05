package main

import (
	"fmt"
	"strings"
)

func main() {
	
	str := "sharda school of engineering"
	
	
	result := strings.ReplaceAll(str, " of ", " ")
	
	fmt.Println(result)
}