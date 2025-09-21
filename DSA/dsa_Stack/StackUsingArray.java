package dsa_Stack;

public class MyStack {
    private int[] stack;
    private int capacity;
    private int top;

    // Constructor
    public MyStack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    // Push element to stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow!");
            return;
        }
        stack[++top] = x;
    }

    // Pop element from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return stack[top--];
    }

    // Peek top element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack[top];
    }

    // Check if empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Display stack elements
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }

        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}


public class StackUsingArray {

    public static void main(String[] args) {
        
        MyStack stack = new MyStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack(); // Stack: 10 20 30 

        System.out.println("Top element is: " + stack.peek()); // Top element is: 30

        System.out.println("Popped element: " + stack.pop()); // Popped element: 30
        stack.printStack(); // Stack: 10 20 

        stack.push(40);
        stack.push(50);
        stack.push(60); // This will show Stack Overflow!
        stack.printStack(); // Stack: 10 20 40 50 

        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }
        
        stack.printStack(); // Stack is empty!
    }
}
