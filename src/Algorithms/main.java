package Algorithms;

public class main {

    public static void main(String[] args) {

        MergeSort ms = new MergeSort();


        int [] array = {5,2,7,1};

        System.out.println("Un Sorted Array");
        ms.printArray(array);

        System.out.println();


        System.out.println("Sorted Array");
        array =  ms.mergeSort(array);
        ms.printArray(array);





    }
}
