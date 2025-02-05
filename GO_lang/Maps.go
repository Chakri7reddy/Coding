package main

import "fmt"

func main() {

	studentInfo := map[string]string{
		"name":      "Chakri dhar Reddy",
		"course":    "Computer Science",
		"system_id": "2022601278",
	}

	fmt.Println("Student Information:")
	fmt.Println("Name:", studentInfo["name"])
	fmt.Println("Course:", studentInfo["course"])
	fmt.Println("System ID:", studentInfo["system_id"])
}
