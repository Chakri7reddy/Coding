import java.util.Scanner;
public class Mergesort {
    public static void mergeSort(int[] array) {
        if (array.length < 2) return;
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];
        for (int i = 0; i < mid; i++) { left[i] = array[i]; }
        for (int i = mid; i < array.length; i++) { right[i - mid] = array[i]; }
        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }
    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) array[k++] = left[i++];
            else array[k++] = right[j++];
        }
        while (i < left.length) {array[k++] = left[i++]; }
        while (j < right.length){ array[k++] = right[j++]; }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
        array[i] = scanner.nextInt();  }
        long startTime = System.nanoTime();
        mergeSort(array);
        long endTime = System.nanoTime();
        System.out.println("Sorted array:");
        for (int num : array){
        System.out.print(num + " ");  }
        System.out.println("\nTime taken: " + (endTime - startTime) + " nanoseconds");
        System.out.println("By Lokireddy Chakridhar Reddy (2022601278)");
        scanner.close();
    }
}

