package DataStructure;

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
    public void push(long item){
        top++;
        stackContainer[top] = item;
    }

    /* Pop */
    public long pop() {

        int oldTop = top;
        top--;
        return stackContainer[oldTop];
    }





}
