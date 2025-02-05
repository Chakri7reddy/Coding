import java.util.*;

public class BucketSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of people: ");
        int n = scanner.nextInt();
        int[] weights = new int[n];

        System.out.println("Enter the weights:");
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }

        bucketSort(weights);

        System.out.println("Weights in descending order:");
        for (int weight : weights) {
            System.out.print(weight + " ");
        }

        System.out.println("\nLokireddy Chakridhar Reddy (2022601278)");
        scanner.close();
    }

    public static void bucketSort(int[] arr) {
        int maxValue = Arrays.stream(arr).max().getAsInt();
        int[] bucket = new int[maxValue + 1];

        for (int i = 0; i < arr.length; i++) {
            bucket[arr[i]]++;
        }

        int pos = 0;
        for (int i = maxValue; i >= 0; i--) {
            while (bucket[i]-- > 0) {
                arr[pos++] = i;
            }
        }
    }
}
