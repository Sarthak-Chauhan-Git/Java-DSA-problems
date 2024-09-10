package BasicDSA.Sorting;

import BasicDSA.Array.printer;

public class QuickSort {
    public static void sort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pIdx = partition(arr, si, ei);
        sort(arr, si, pIdx - 1); // left
        sort(arr, pIdx + 1, ei); // right
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; ) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            i++;
            int temp = arr[i];
            arr[i] = arr[ei];
            arr[ei] = temp;
            return i;
        }

        return pivot;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        sort(arr, 0, arr.length-1);
        printer.print(arr);
    }
}
