import DataStructure.QueueArray;
import DataStructure.StackArray;

public class Main {

    public static String reversString(String str) {

        StackArray theStack = new StackArray(str.length());
        String newStr = "";
        if (!theStack.isFull()) {
            for (int j = 0; j < str.length(); j++) {
                theStack.push(str.charAt(j));
            }
        }
        while (!theStack.isEmpty()) {
            newStr = newStr+theStack.pop();
        }

       return newStr;
    }

    public static void main(String[] args) {
        /*
        StackObjectsArr theStack = new StackObjectsArr(3);
        theStack.push( 20);
        theStack.push( 12);
        theStack.push( 5);
        theStack.push( 6);

        while (!theStack.isEmpty()) {

            System.out.println(theStack.pop());
        }
        System.out.println(reversString("chayanne"));
         */


        QueueArray theQueue = new QueueArray(5);

        theQueue.enQueue(2);
        theQueue.enQueue(10);
        theQueue.enQueue(15);
        theQueue.enQueue(22);
        theQueue.enQueue(5);
        theQueue.enQueue(1);


        theQueue.displayQueue();
    }
}
