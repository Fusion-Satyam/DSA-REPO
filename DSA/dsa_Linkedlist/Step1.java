package dsa_Linkedlist;


public class Step1 {
    public static class Node{
    int data ;
    Node next;
    Node(int data ){
        this.data = data;
        this.next = null;
    }
}

public static Node head ;
public static Node tail ;

    public static void main(String[] args) {
        Step1 ll = new Step1();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(3);
        ll.tail = ll.head;
    }
    
}
