package LinkedList;

public class SLL {
    Node head;
    private int size = 0;

    SLL() {
        this.size = 0;
    }

     class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // check if linked list empty
    public boolean isEmpty() {
        return head == null;
    }

    // add in the beginning
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add in the last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    // printing the list
    public void printList() {
        if(head == null) {
            System.out.println("List is empty");
        }
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // delete a node from beginning
    public void deleteFirst() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast() {
        // if head itself is null, meaning no list.
        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        size--;
        // if list only has one node we can make head null.
        if(head.next == null) {
            head = null;
            return;
        }

        Node prev = head;
        Node curr = head.next;
        while(curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        SLL list = new SLL();

        list.addFirst("a");
        list.addFirst("is");
        list.addLast("hey");
        list.printList();

        list.deleteLast();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
    }
}
