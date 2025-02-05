package main
import ("fmt";"strconv")
func main() {
	st := "13.45"
	Typeconverion(st)
}
func Typeconverion(str string) {
	Value, err := strconv.ParseFloat(str, 64)
	if err != nil {
		fmt.Println(err)
		return
	}
	fmt.Println("Converted float value:", Value)
}
