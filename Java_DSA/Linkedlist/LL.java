
public class LL {
    
    private static class Node {
        private int value;
        private Node next;

        
        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;

   
    public LL insert(LL list, int value) {
        Node newNode = new Node(value);

        
        if (list.head == null) {
            list.head = newNode;
        } else {
         
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }

        return list;
    }

  
    public void printList(LL list) {
        Node current = list.head;
        System.out.print("LinkedList: ");
        while (current != null) {
            System.out.print( "--> "+current.value );
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LL list = new LL();

    
        list = list.insert(list, 10);
        list = list.insert(list, 20);
        list = list.insert(list, 30);
        list = list.insert(list, 40);

        
        list.printList(list);
    }
}
