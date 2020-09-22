package Algorithms;

public class QuickSort {

    public void printArr(int [] arr) {

        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.print("");
    }

    public int partition(int arr [], int low, int high) {

        // high is the last index in the array
        int pivot = arr[high];
        int i = low -1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;
                // swap arr[i] with arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i +1] and arr[high] (pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }






}
