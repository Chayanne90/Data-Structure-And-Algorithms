package DataStructure;

public class Queue {

    private int maxSize;
    private long [] queueArray;
    private int front;
    private int rear;
    private int amountOfItems;

    /* Constructor */
    public Queue(int maxSize) {

        this.maxSize = maxSize;
        this.queueArray = new long[maxSize];
        this.front = 0; /* Index position of the first slot of the array*/
        this.rear = -1; /* there is no item in the array yet to be consider the las item. */
        this.amountOfItems = 0; /* we don't have elements in the array */
    }

    /* insert to Queue */
    public void insert(long item){

        rear++;
        queueArray[rear] = item;
        amountOfItems++;
    }
}
