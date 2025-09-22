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


public void addLast(int data){
    if(head == null){
        Node newNode = new Node(data);
        head = tail= newNode;
        return;
    }

    // step 1 : create new node
    Node newNode = new Node(data);

    // step 2 : tail next = newNode
    tail.next = newNode;

    // step 3 : tail = newNode
    tail = newNode;
}


 public void insertAtIndex(int index, int data) {
        Node newNode = new Node(data);

        // Case 1: Insert at beginning
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        int count = 0;

        // Traverse to (index - 1) node
        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }

        // If index is invalid (too large)
        if (current == null) {
            System.out.println("Index out of bounds");
            return;
        }

        // Insert in the middle or end
        newNode.next = current.next;
        current.next = newNode;
    }

    public void deleteAtEnd(Node head){
     // Delete the first node with the given value
    public static Node deleteNode(Node head, int value) {
        // If the list is empty
        if (head == null) return null;

        // If the node to delete is the head
        if (head.data == value) return head.next;

        Node current = head;

        // Traverse until the node before the one to delete
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        // If node with value is found
        if (current.next != null) {
            current.next = current.next.next;
        }

        return head;
    }
public void printList(){
    Node  temp = head;
    while(temp!=null){
        System.out.print(temp.data+"->" );
        temp = temp.next;
    }
    System.out.println("null");
}

    public static void main(String[] args) {
        Step1 ll = new Step1();
        ll.addFirst(0);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.printList();

    }
}
