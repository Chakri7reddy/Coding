import java.util.Arrays;

public class librarytitle {

    public static void main(String[] args) {
        
        String[] books = {
            "India",
            "The Black Street",
            "Animal World",
            "Yodha",
            "Truth and Dare",
            
        };

        quickSort(books, 0, books.length - 1);
        System.out.println("Sorted books: " + Arrays.toString(books));
        System.out.println("By Lokireddy Chakridhar Reddy (2022601278)");
    }

   
    public static void quickSort(String[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

   
    public static int partition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = (low - 1); 
        for (int j = low; j < high; j++) {
           
            if (arr[j].compareTo(pivot) <= 0) {
    i++;

                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        
        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}

