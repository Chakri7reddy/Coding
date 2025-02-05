package main
import ("fmt"
 "time")

func sender(chm chan int){
chm<-23	
}

func receiver(chm chan int){
	val:=<-chm
	fmt.Println("Received value:", val)
}
func main() {
	chm:=make(chan int)
    go sender(chm)
    go receiver(chm)
    time.Sleep(2 * time.Second)
}