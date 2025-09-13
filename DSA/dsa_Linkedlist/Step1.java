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


public void addFirst(int data){

    if(head == null){
        Node newNode = new Node(data);
        head = tail = newNode;
        return;
    }

    // step 1 : create new node
    Node newNode = new Node(data);
    // step 2 : newNode next = head
    newNode.next = head;
    // step 3 : head = newNode
    head = newNode;
}

    public static void main(String[] args) {
        Step1 ll = new Step1();
        ll.addFirst(0);
        ll.addFirst(1);

    }
}
