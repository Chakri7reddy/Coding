package main
import ("fmt"	;"strings")
func concatenateStrings(words ...string) string {
	return strings.Join(words, " ....")
}
func concatenateString(words []string) string {
	return strings.Join(words, " _")
}
func main() {
	result := concatenateStrings("", "Go", "is", "a", "great", "language!", "")
	fmt.Println(result, "using Variadic")

	words := []string{"Go", "is", "a", "great", "language!"}
	result2 := concatenateString(words)
	fmt.Println(result2, "  using slice")
}
