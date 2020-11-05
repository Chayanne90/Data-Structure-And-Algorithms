package DataStructure;

public class LinkedList_Doubly {

    public Node first;
    public  Node last;

    /* Constructor */
    public LinkedList_Doubly() { }

    public boolean isEmpty() { return (first == null); }

    public void insertFirst(Object data) {

        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            last = newNode;  /* if is empty, last will refer to the new node created */
        } else {
            first.previous = newNode;
        }

        newNode.next = first;
        first = newNode;
    }


    public void insertLast(Object data ) {

        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode; /* assigning old last to newnode */
            newNode.previous = last; /* the old last will be the newNode */
        }
        last = newNode;
    }

    /* assume if is not an empty list*/
    public Node deleteFirst() {

        Node temp = first;
        if (first.next == null) {

            last = null;
        } else {
            first.next.previous = first;
        }
        first = first.next;
        return temp;
    }

   public Node deleteLast() {

        Node temp = last;
        if (first.next == null) {
            first = null;
        } else {
            last.previous.next = null;
        }

        last = last.previous;
        return temp;
   }

   public boolean insertAfter(Object key, Object data) {

        Node current = first;
        while (current.data != key) {
            current = current.next;
            if (current.next == null) {
                return false;
            }
        }

        Node newNode = new Node();
        newNode.data = data;
        if (current == last) {

            current.next = null;
            last = newNode;
        } else {
            newNode.next = current.next;
            current.next.previous = newNode;
        }
        newNode.previous = current;
        current.next = newNode;

        return true;
   }











}
