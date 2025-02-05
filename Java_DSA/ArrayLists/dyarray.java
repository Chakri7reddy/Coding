package ArrayLists;

public class dyarray {
    public static void main(String[] args) {
        DynamicArray dynamicArray=new DynamicArray();
        System.out.println(dynamicArray.capacity);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        dynamicArray.insert(0, "dynamicArray");
        dynamicArray.delete("B");

        System.out.println(dynamicArray);
        System.out.println("empty :"+dynamicArray.isEmpty());
    }
}
