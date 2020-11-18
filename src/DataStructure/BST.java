package DataStructure;

public class BST {

    private Node_BST root;          /* This is the root or the first node */

     /* Insert a node */
    public void insert(int key, String value) {
        Node_BST newNode = new Node_BST(key, value);

        if (root == null) {         /* Check id the BST is empty by checking if a node exist! */

            root = newNode;
        } else {

            Node_BST current = root;
            Node_BST parent;

            while (true) {

                parent = current;
                if (key < current.key) {
                    current = current.LeftChild;
                    if (current == null) {  /* It's parent is the leaf node */
                        parent.LeftChild = newNode;
                        return;
                    }
                } else { // If the key is bigger the go to the right side
                    current = current.rightChild;
                    if (current == null) {

                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    } // End of the insert Method


    /* Find the Minimum Value */
    public Node_BST findMin() {

        Node_BST current = root;
        Node_BST last = null;               /* the last node is hold the las value when current hit null */

        while (current != null) {
            last = current;
            current = current.LeftChild;
        }
        return last;
    }

    /* Find the Maximum Value */
    public Node_BST findMax() {

        Node_BST current = root;
        Node_BST last = null;               /* the last node is hold the las value when current hit null */

        while (current != null) {
            last = current;
            current = current.rightChild;
        }
        return last;
    }









}
