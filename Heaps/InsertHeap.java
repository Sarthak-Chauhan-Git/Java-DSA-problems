package Heaps;

import java.util.*;

public class InsertHeap {
    class Heaps {
        ArrayList<Integer> heap = new ArrayList<>();

        public void heapify(int data) {

        }

        public void add(int data) { // O(logn)
            heap.add(data);

            int child_idx = heap.size() - 1; // child
            int par_idx = (child_idx - 1) / 2; // parent

            while (heap.get(child_idx) < heap.get(par_idx)) { // O(logn)
                // swap
                int temp = heap.get(child_idx);
                heap.set(child_idx, heap.get(par_idx));
                heap.set(par_idx, temp);
            }
        }

        public void peak() { // view top or min value
            System.out.println(heap.get(0));
        }

        public int delete() { // delete min idx
            // step 1 swap first to last node
            int data = heap.get(0);
            heap.set(0, heap.size() - 1);
            heap.set(heap.size() - 1, data);

            // step 2 delete_Last
            heap.remove(heap.size() - 1);

            // heapify

        }
    }

    public static void main(String[] args) {

    }
}