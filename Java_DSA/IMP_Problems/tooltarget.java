package JPmorgan;

import java.util.Scanner;

public class tooltarget {
    public static void main(String[] args) {
       
        String [] array= {"saw"," hammer"," mallet", 
        "file", "saw", "ladder", "scissor"};
        Scanner sc=new Scanner(System.in);
       
        int Startingindex =sc.nextInt();
       String target=sc.next();

       String[] arr=new String[array.length];
       for (int i = 0; i < array.length; i++) {
        arr[i]=array[(Startingindex+i)%array.length];
       }

for (int i = 0; i < arr.length; i++) {
    
    if(target.equals(arr[i])){
        System.out.println(i);
    }
}
      sc.close();     
        }
    
  


}
