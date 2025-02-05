import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int[] arr) {
        int n = arr.length;

        // maximum element
        int max = Arrays.stream(arr).max().getAsInt();

        // Count array for unique element
        int[] count = new int[max + 1];

        // count of each element
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Modifying count
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

    
        int[] finalarr = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            finalarr[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

       
        System.arraycopy(finalarr, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 4, 3, 1, 4, 6, 3};
        countingSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("By Lokireddy Chakri dhar reddy(2022601278)");
    }
}
