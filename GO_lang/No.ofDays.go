package main

import "fmt"

func daysInMonth(month int, year int) int {
	switch month {
	case 1, 3, 5, 7, 8, 10, 12:
		return 31
	case 4, 6, 9, 11:
		return 30
	case 2:
		if isLeapYear(year) {
			return 29
		}
		return 28
	default:
		return 0
	}
}
func isLeapYear(year int) bool {
	switch {
	case year%400 == 0:
		return true
	case year%100 == 0:
		return false
	case year%4 == 0:
		return true
	default:
		return false
	}
}
func printDaysInMonths(year int) {
	for month := 1; month <= 12; month++ {
		days := daysInMonth(month, year)
		fmt.Printf("Month %d: %d days\n", month, days)
	}
}
func main() {
	var year int
	fmt.Print("Enter a year: ")
	fmt.Scan(&year)
	printDaysInMonths(year)
}
