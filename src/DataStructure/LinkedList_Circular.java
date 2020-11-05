package DataStructure;

public class LinkedList_Circular {

    public Node first;
    public Node last;

    /* Constructor */
    public LinkedList_Circular() { }

    /* Check if list us empty */
    public  boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(Object data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            last = newNode;
        }
        newNode.next = first;
        first = newNode;
    }

    public void insertLast(Object data) {

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last;
        if (isEmpty()) {
            first.next = newNode;
        }
        last.next = newNode; /* The last value of the last node will point to the new node*/
        last = newNode;      /* we make the new node we created to be the last node */
    }

    public Object deleteFirst() {

        Object temp = first.data;
        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }

    public void displayList() {

        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
    }

}
