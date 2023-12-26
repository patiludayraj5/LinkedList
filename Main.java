class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void appendNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void insertNode(int newData, int afterData) {
        Node newNode = new Node(newData);
        Node current = head;

        while (current != null && current.data != afterData) {
            current = current.next;
        }

        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        } else {
            System.out.println("Node with data " + afterData + " not found in the list.");
        }
    }

    public void pop() {
        if (head != null) {
            head = head.next;
        } else {
            System.out.println("LinkedList is empty. Cannot pop.");
        }
    }

    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print("->");
            }
            current = current.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Creating the linked list with the specified sequence
        linkedList.appendNode(56);
        linkedList.appendNode(30);
        linkedList.appendNode(70);

        // Deleting the first element (pop)
        linkedList.pop();

        // Displaying the linked list
        System.out.println("Final Sequence: ");
        linkedList.displayList();
    }
}
