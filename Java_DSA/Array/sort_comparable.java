package Array;
import java.util.Arrays;
import java.util.Collections;
public class sort_comparable {
      public static void f1(){
        int[] numbers={4,6,3,8,9,54,5,99,85,236};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
      }

     public static void f2(){
        String[] fruits={"orange","grape","apple"};
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));
        //Reverse order sorting
        Arrays.sort(fruits,Collections.reverseOrder());
        System.out.println(Arrays.toString(fruits));
      }
    public static void main(String[] args) throws Exception {
       f1();
       f2();

       //Comparision   -ve mans first object is smaller and 0=equal and +ve means second object is small

       String s1="abc";
       String s2="abe";
       System.out.println(s1.compareTo(s2));
    }
}
