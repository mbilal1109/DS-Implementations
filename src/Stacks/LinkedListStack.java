package Stacks;

public class LinkedListStack {
     static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head; // represents the top element of the stack.

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public int pop() {
        if(isEmpty()) {
            return -1; // -1 representing the stack is empty.
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        LinkedListStack s = new LinkedListStack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        // this is a way of printing the elements, but a display method can also be implemented.
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

        System.out.println(s.isEmpty());
    }
}
