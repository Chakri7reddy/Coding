package main
import "fmt"

//4  passing the anonymous function to nother function
func ser(fn func(name,surname string)string){
fmt.Println(fn("abc","def"))
}

func main(){
// func(name string){    //2  passing parametre to the function
// fmt.Println("welcome",name)
// }("to 5p class")

// func(){       //1   instant calling
// fmt.Println("welcome")
// }()

// abc:= func(name string) string{
// fmt.Println("welcome",name)
// return "Go Go"
// }("to 5p class")
// fmt.Println(abc)

// abc:= func(name string) {    //3  assign variable to the function
// fmt.Println("welcome",name)
// };abc("to 5p class")

fn:= func(name,surname string) string{
return name+surname
}
ser(fn)
}