import java.util.Scanner;

public class Binarytreeinsertion {
    public Binarytreeinsertion(){

    }
    private static  class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value=value;
        }
    }
    private Node root;

    public void populate(Scanner sc){
        System.out.println("enter the root node");
        int value=sc.nextInt();
        root= new Node(value);
        populate(sc,root);
    }
private void populate(Scanner sc,Node node){
        System.out.println("do you want the left");
        boolean left=sc.nextBoolean();
        if (left){
            System.out.println("enter the left value");
            int value=sc.nextInt();
            node.left=new Node(value);
            populate(sc,node.left);
        }
    System.out.println("do you want the right");
    boolean right=sc.nextBoolean();
    if (right){
        System.out.println("enter the right value");
        int value=sc.nextInt();
        node.right=new Node(value);
        populate(sc,node.right);
    }
}
}
