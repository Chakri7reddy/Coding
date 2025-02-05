package Queue;
import java.util.Queue;
import java.util.Collections;
import java.util.PriorityQueue;

public class priority_Queue {
    public static void main(String[] args) {
        
        Queue<String> queue=new PriorityQueue<>(Collections.reverseOrder());
        queue.offer("chakri");
        queue.offer("dhar");
        queue.offer("reddy");
        queue.add("lokireddy"); 

        System.out.println(queue);

        Queue<String> queue1=new PriorityQueue<>();

        queue1.offer("chakri");
        queue1.offer("dhar");
        queue1.offer("reddy");
        queue1.add("lokireddy"); 
        System.out.println(queue1);
        

    }
}
