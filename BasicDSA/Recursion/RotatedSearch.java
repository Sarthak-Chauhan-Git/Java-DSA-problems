package BasicDSA.Recursion;
// A sorted array is rotated on its pivot point now search an element in most optimised way

public class RotatedSearch {

    public static void search(int arr[], int key, int si, int ei) {
        int mid = si + (ei - si) / 2;
        if (arr[mid] == key) {
            System.out.println("Element found at index : " + mid);
            return;
        }
        if (si >= ei) {
            System.out.println("Not found!");
            return;
        }
        if (arr[si] <= key && key < arr[mid]) {
            search(arr, key, si, mid - 1);
        } else {
            search(arr, key, mid + 1, ei);
        }
    }

    /*
     * public static void search(int[] arr, int key, int si, int ei) {
     * for (int i = si; i <= ei; i++) {
     * int mid = si + (ei - si) / 2;
     * System.out.println(mid);
     * if (arr[mid] == key) {
     * System.out.println("Found at index : " + mid);
     * return;
     * }
     * if (i >= ei) {
     * System.out.println("Not found!");
     * }
     * if (arr[i] <= key && key < arr[mid]) {
     * System.out.println("ei = mid");
     * ei = mid;
     * }
     * if (arr[mid] < key && key <= arr[ei]) {
     * System.out.println("i = mid");
     * i = mid;
     * }
     * }
     * }
     */

    public static void main(String args[]) {
        int arr[] = { 3, 4, 5, 6, 7, 0, 1, 2 };
        int key = 3;
        search(arr, key, 0, arr.length - 1);
    }
}
