package Queues;

public class LinkedQueue {
    private int size = 0;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    Node front;
    Node rear;

    public boolean isEmpty() {
        return front == null;
    }

    public int getSize() {
        return size;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            front = newNode;
            rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if(isEmpty()) {
            return -1;
        }
        int top = front.data;
        front = front.next;
        size--;
        return top;
    }

    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        return front.data;
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node curr = front;
        while(curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        LinkedQueue q = new LinkedQueue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(34);
        q.enqueue(45);

        System.out.println(q.getSize());

        System.out.println(q.dequeue());
        System.out.println(q.getSize());
        System.out.println(q.dequeue());

        System.out.println(q.peek());
        System.out.println();

        q.display();
    }
}
