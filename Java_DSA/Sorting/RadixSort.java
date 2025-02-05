import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] numbers = {170, 45, 75, 90, 802, 24, 2, 66};
        
        System.out.println("Original array: " + Arrays.toString(numbers));
        radixSort(numbers);
        System.out.println("Sorted array in ascending order: " + Arrays.toString(numbers));
        System.out.println("By Lokireddy Chakri dhar reddy(2022601278)");
    }

    public static void radixSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    public static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}
