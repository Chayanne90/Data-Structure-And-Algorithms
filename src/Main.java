import DataStructure.StackArray;
import DataStructure.StackObjectsArr;

import java.util.ArrayList;

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

        StackObjectsArr theStack = new StackObjectsArr(3);
        theStack.push( 20);
        theStack.push( 12);
        theStack.push( 5);
        theStack.push( 6);

        while (!theStack.isEmpty()) {

            System.out.println(theStack.pop());
        }

       // System.out.println(reversString("chayanne"));
    }
}
