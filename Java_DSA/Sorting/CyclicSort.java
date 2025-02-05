
import java.util.Arrays;

public class CyclicSort{
    public static void main(String[] args){
        int[] arr={4,2,5,3,1};
        sort(arr);
        System.err.println(Arrays.toString(arr));

    }
    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int first ,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}