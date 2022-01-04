package Queues;

import java.util.ArrayList;

public class ArrayListQueue {
    ArrayList<Integer> q = new ArrayList<>();

    public boolean isEmpty() {
        return q.size() == 0;
    }

    public int getSize() {
        return q.size();
    }

    public void enqueue(int data) {
        q.add(data);
    }

    public int dequeue() {
        if(isEmpty()) {
            return -1;
        }
        int first = q.get(0);
        q.remove(0);
        return first;
    }

    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        return q.get(0);
    }

    public void display() {
        for(int i = 0; i < q.size(); i++) {
            System.out.print(q.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        ArrayListQueue list = new ArrayListQueue();

        System.out.println(list.isEmpty());

        list.enqueue(1);
        list.enqueue(2);
        list.enqueue(3);
        list.enqueue(4);
        list.enqueue(5);
        list.enqueue(6);
        list.enqueue(7);

        System.out.println(list.getSize());
        System.out.println();

        list.display();
        System.out.println();

        System.out.println(list.dequeue());
        System.out.println();

        System.out.println(list.getSize());
        System.out.println();

        list.display();

        System.out.println();
        System.out.println(list.peek());
    }
}
