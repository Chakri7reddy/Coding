 package IMP;


 public class Arrays {
 
   //basics of the array
    public static void main(String[] args) {
        int arr[]=new int[]{2,5,3,6};// arr is the reference variable for array class in java
        System.out.println(arr[3]);

        //initilization
        int x[]={2,5,6,38,5};
 x[0]=5;
// arrays in java are dynamic
        int[] ros;//declaration of array .ros is getting defined in thr stack  at the compile time
        ros=new int[4];
        ros[0]=5;//actually here object is being created in the heap memory at the run time
//continuous allocation and objects may not be continuous mostly depends on JVM....
    
  //to print arrays
  //System.out.println(Arrays.toString(arr));
}
 }
    

    
