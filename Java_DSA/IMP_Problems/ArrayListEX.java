package IMP;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEX {
    public static void main(String[] args) {
 Scanner in=new Scanner(System.in);
        
        //Syntax
        ArrayList<Integer> list=new ArrayList<>(10);
        list.add(98);
        list.add(98);
        list.add(98);
        list.add(98);
        list.add(98);
        list.add(98);
        list.add(98);
        list.add(98);
        list.add(98);
 System.out.println(list);
 
         list.set(0, 99);

         list.remove(2);
         System.out.println(list);

         for(int i=0;i<5;i++){
            list.add(in.nextInt());
         }
         for(int i=0;i<5;i++){
            System.out.println(list.get(i));
         }

         //arratlist of arraylist

         ArrayList<ArrayList<Integer>>  list2=new ArrayList<>();

         //initilisation

        for (int i = 0; i < 3; i++) {
            list2.add(new ArrayList<>());
            
        }

         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list2.get(i).add(in.nextInt());
            }
         }

         System.out.println(list2);

         in.close();
    }
    
}
