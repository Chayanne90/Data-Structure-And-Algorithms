package DataStructure;

public class LinkedList {


    public static void main(String[] args) {
        Node nodeA = new Node();
        nodeA.data = 5;

        Node nodeB = new Node();
        nodeB.data = 9;

        Node nodeC = new Node();
        nodeC.data = 4;

        nodeA.next = nodeB;
        nodeB.next = nodeC;

        System.out.println(listLenght(nodeB));
    }


    public static Object listLenght(Node node) {

        int length = 0;

        //Node currentNode = node;

        while (node != null) {
            length++;
            node = node.next;
        }

        return length;
    }
}
