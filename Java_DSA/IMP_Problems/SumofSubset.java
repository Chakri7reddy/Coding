import java.util.*;
public class SumofSubset {
    public static void findSubsets(int[] set, int targetSum) {
        findSubsetsHelper(set, 0, 0, targetSum, new ArrayList<>());
    }
    private static void findSubsetsHelper(int[] set, int index, int currentSum, int targetSum, List<Integer> subset) {
        if (index == set.length) {
            if (currentSum == targetSum) {
                System.out.println(subset);
            }
            return;
        }
        // Include the current element
        subset.add(set[index]);
        findSubsetsHelper(set, index + 1, currentSum + set[index], targetSum, subset);
        subset.remove(subset.size() - 1);

        // Exclude the current element
        findSubsetsHelper(set, index + 1, currentSum, targetSum, subset);
    }
    public static void main(String[] args) {
        int[] set = {1, 2, 3, 4, 5};
        int targetSum = 9;

        findSubsets(set, targetSum);
        System.out.println("Lokireddy Chakridhar Reddy - 2022601278 ");
    }
}