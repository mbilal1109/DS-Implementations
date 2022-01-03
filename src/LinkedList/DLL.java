package LinkedList;

public class DLL {
    private int size = 0;

     class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
            size++;
        }
    }

    Node head;

    public boolean isEmpty() {
         return head == null;
    }

    public int getSize() {
        return size;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        newNode.prev = curr;
        curr.next = newNode;
    }

    public void printList(Node curr) {
        Node last = head;
        System.out.println("Printing in forward direction:");
        System.out.print("null <- ");
        while(curr != null) {
            System.out.print(curr.data + " -> ");
            last = curr;
            curr = curr.next;
        }
        System.out.println("null");

//        System.out.println("Printing in reverse direction:");
//        System.out.print("null <- ");
//        while(last != null) {
//            System.out.print(last.data + " <- ");
//            last = last.prev;
//        }
//        System.out.println("null");
    }

    public void deleteFirst() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        if(head.next == null) {
            head = null;
        }

        Node curr = head;
        while(curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
    }

    public static void main(String[] args) {
        DLL list = new DLL();

        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        list.printList(list.head);

        list.deleteFirst();
        list.printList(list.head);

        list.deleteLast();
        list.printList(list.head);
    }
}
