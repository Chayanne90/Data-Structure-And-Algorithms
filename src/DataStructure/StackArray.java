package DataStructure;

import java.util.Stack;

public class StackArray {

    private int maxSize;
    private long [] stackContainer;
    private int top;

    /* Constructor */
    public StackArray(int maxSize) {

        this.maxSize = maxSize;
        this.stackContainer = new long[maxSize];
        this.top = -1;
    }

    /* Push */
    public void push(long item) {

        if (maxSize-1 != top) {
            top++;
            stackContainer[top] = item;
        } else {
            System.out.println( "item: "+ item+" cannot be added, Stack is Full");
        }
    }

    /* Pop */
    public long pop() {

        if (isEmpty()) {
            System.out.println( "The Stack is Empty");
            return -1;
        } else {

            int oldTop = top;
            top--;
            return stackContainer[oldTop];
        }
    }

    /* Peak (the top of the array) */
    public long peak() {

        return stackContainer[top];
    }

    /* Check if the stack is empty */
    public boolean isEmpty() {

        return (top == -1);
    }

    /* Check is the stack is full */
    public boolean isFull() {

        return (maxSize-1 == top);
    }







}
