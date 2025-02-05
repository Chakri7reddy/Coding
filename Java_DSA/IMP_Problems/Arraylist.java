import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        //<use the wrapper class>
        ArrayList<String> food=new ArrayList<String>();
        food.add("pizza");
        food.add("biryani");
        food.add("sweets");
        food.add("laddu");
        food.set(0, "jalebi");
        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }

    }
}
