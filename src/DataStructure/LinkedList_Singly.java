package DataStructure;

public class LinkedList_Singly {

    public Node first;


    /* Constructor */
    public LinkedList_Singly() { }

    /* Check if list is empty */
    public boolean isEmpty() {
        return (first == null);
    }

    /* Insert in the front of the List */
    public void insertFirst(Object data) {

        Node nodeNew = new Node();
        nodeNew.data = data;
        nodeNew.next = first;
        first = nodeNew;
    }

    public void insertLast(Object data) {

        Node current = first;
        while (current.next != null) {

            current = current.next;
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }

    public Node deleteFirst() {

        Node temp = first;
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
