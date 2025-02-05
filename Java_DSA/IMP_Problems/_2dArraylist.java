import java.util.ArrayList;

public class _2dArraylist {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> alllists=new ArrayList<>()
;
        ArrayList<String> bakerylist=new ArrayList<>();
        bakerylist.add("dough");
        bakerylist.add("bread");

        ArrayList<String> grocerylist=new ArrayList<>();
        grocerylist.add("pulses");
        grocerylist.add("coffee");

        ArrayList<String> Drinks=new ArrayList<>();
        Drinks.add("soda");
        Drinks.add("cola");

        System.out.println(bakerylist.get(0));
        System.out.println(grocerylist.size());
        System.out.println(Drinks.add("sprite"));
        System.out.println(Drinks);

        alllists.add(grocerylist);
        alllists.add(bakerylist);
        alllists.add(Drinks);

        System.out.println(alllists);
        System.out.println(alllists.get(0).get(1));

        // for each loop

        for(ArrayList<String> x : alllists){
            System.out.println(x);
        }
    }
}
