
import java.util.Arrays;

class Bubblesort{
    public static void main(String[] args) {
        double[] arr={5.3,4,3,2,1};
        bubble(arr);
        System.err.println(Arrays.toString(arr));

    }
        static void bubble(double[] arr){
            boolean swapped;
            for (int i = 0; i < arr.length; i++){
                swapped=false;
                // for each iteration max element will get in to the last respective index
                   for (int j = 1; j <arr.length-i ; j++) {
                      if(arr[j]<arr[j-1]){
                         double temp=arr[j];
                       arr[j]=arr[j-1];
                       arr[j-1]=temp;
                       swapped=true;
                       }
                   }
             if(!swapped){
                break;
           
            }
            
          }
        }
    
}