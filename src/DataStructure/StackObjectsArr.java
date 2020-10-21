package DataStructure;

public class StackObjectsArr {

    private int maxSize;
    private Object [] stackContainer;
    private int top;

    /* Constructor */
    public StackObjectsArr(int maxSize) {

        this.maxSize = maxSize;
        this.stackContainer = new Object[maxSize];
        this.top = -1;
    }

    /* Push */
    public void push(Object item) {

        if (maxSize-1 != top) {
            top++;
            stackContainer[top] = item;
        } else {
            System.out.println( "item: "+ item +" cannot be added, Stack is Full");
        }
    }

    /* Pop */
    public Object pop() {

        if (isEmpty()) {
            System.out.println( "The Stack is Empty");
            return '0';
        } else {

            int oldTop = top;
            top--;
            return stackContainer[oldTop];
        }
    }

    /* Peak (the top of the array) */
    public Object peak() { return stackContainer[top]; }

    /* Check if the stack is empty */
    public boolean isEmpty() {  return (top == -1); }

    /* Check is the stack is full */
    public boolean isFull() {  return (maxSize-1 == top); }
}
