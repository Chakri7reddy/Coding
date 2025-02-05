import java.util.Arrays;
import java.util.Comparator;

class Item {
    int value, weight;
    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}
class knapsack {
    static int greedyKnapsack(int W, Item[] items) {
               Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item i1, Item i2) {
                double ratio1 = (double) i1.value / i1.weight;
                double ratio2 = (double) i2.value / i2.weight;
                return Double.compare(ratio2, ratio1); // Descending order
            }
        });
        int totalValue = 0;
        int remainingWeight = W;
        for (Item item : items) {
            if (item.weight <= remainingWeight) {
                totalValue += item.value;
                remainingWeight -= item.weight;
            } 
        }
        return totalValue;
    }
    public static void main(String[] args) {
        int W = 50; 
        Item[] items = {
            new Item(60, 10),
            new Item(100, 20),
            new Item(120, 30)
        };
        int maxValue = greedyKnapsack(W, items);
        System.out.println("Maximum value obtained: " + maxValue);
        System.out.println("Lokireddy Chakridhar Reddy-2022601278");
    }
}
