package BasicDSA.Sorting;

import BasicDSA.Array.printer;

public class MergeSort {
    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid); // left
        divide(arr, mid + 1, ei); // right
        conquer(arr, si, ei, mid);// call conquer
    }

    public static void conquer(int arr[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];
        int i = si; // starting index for left
        int j = mid + 1; // starting index for right
        int k = 0; // starting index for temp

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) { // if elements remain in left part
            temp[k++] = arr[i++];
        }
        while (j <= ei) { // if elements remain in right part
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; i++, k++) { // copy sorted to orignal
            arr[i] = temp[k];

        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 3, 8 };
        divide(arr, 0, arr.length - 1);
        printer.print(arr);
    }
}
