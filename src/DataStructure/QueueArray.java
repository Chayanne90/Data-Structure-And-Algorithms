package DataStructure;

public class QueueArray {

    private int maxSize;                     /* The size of teh Queue */
    private long [] queueArray;              /* the array that will store items of the Queue */
    private int front;                       /* This is the index position for the items that is in the front of the Queue */
    private int rear;                        /* This is the index position for the items that is in the back of the Queue */
    private int amountOfItems;               /* This is is the counter of items in the Queue */

    /* Constructor */
    public QueueArray(int maxSize) {

        this.maxSize = maxSize;
        this.queueArray = new long[maxSize];
        this.front = 0;                      /* Index position of the first slot of the array*/
        this.rear = -1;                      /* there is no item in the array yet to be consider the las item. */
        this.amountOfItems = 0;              /* we don't have elements in the array */
    }

    /* insert to Queue */
    public void enQueue(long item) {

        if (isFull()) {
            System.out.println("Oops the Queue is Full " + item + " cannot be added");
        } else {
            rear++;
            queueArray[rear] = item;
            amountOfItems++;
        }
    }

    /* Display the elements of the Queue */
    public void displayQueue() {

        System.out.print("[ ");
        for (int i = 0; i < queueArray.length; i++) {
            System.out.print(queueArray[i]+" ");
        }
        System.out.print("]");
    }

    /* Remove and display the element at the front */
    public long deQueue() {

        long temp = queueArray[front];
        front++;

        if ( front == maxSize) {                  /* This is use to set the front back to 0 su that we can use the queue again */
            front = 0;
        }
        amountOfItems--;
        return temp;
    }

    /* Display the first also known as peak element of the Quque but it doesn't remove it */
    public long first() { return queueArray[front]; }

    /* Check if the Queue is Empty */
    public boolean isEmpty() { return (amountOfItems == 0); }

    /* Check if the Queue is full */
    public boolean isFull() { return (rear == maxSize-1); }
}
