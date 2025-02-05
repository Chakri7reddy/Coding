public class LinearSearch {

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] numbers = {10, 23, 45, 70, 11, 15};
        int target = 70;
        int result = linearSearch(numbers, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
        System.out.println("By Lokireddy Chakridhar Reddy (2022601278)");
    }
}
