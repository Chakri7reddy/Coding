package Queue;
import java.util.*;
import java.util.LinkedList;

public class Queue1 {
    public static void main(String[] args) {
        //enqueue > add
        //dequeue >remove
        //queue is an interface we cannot instanciate it 

        Queue<String> queue=new LinkedList<String>();

        // add=enqueue,offer()
        //remove =dequeue,poll()

        queue.offer("chakri");
        queue.offer("dhar");
        queue.offer("reddy");
        queue.add("lokireddy");

        System.out.println(queue);

        queue.remove();
        queue.poll();
        System.out.println(queue);

        queue.element();
        queue.peek();

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("lokireddy"));


    }
}
