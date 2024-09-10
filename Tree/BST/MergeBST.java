package Tree.BST;

import java.util.*;

public class MergeBST{
    public static BSTI.node builder(ArrayList<Integer> arr, int min, int max){
        if(min > max){
            return null;
        }
        int mid = (min+max)/2;
        BSTI.node root = new BSTI.node(arr.get(mid));
        root.left = builder(arr, min, mid-1);
        root.right = builder(arr, mid+1, max);
        return root;
    }
    public static ArrayList<Integer> inorder(BSTI.node root, ArrayList<Integer> arr){
        if(root == null){
            return arr;
        }
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
        return arr;
    }
    public static BSTI.node merge(BSTI.node firstRoot, BSTI.node secRoot){

        ArrayList<Integer> arr1 = inorder(firstRoot,new ArrayList<>());
        ArrayList<Integer> arr2 = inorder(secRoot,new ArrayList<>());

        int pt1=0,pt2 = 0;
        ArrayList<Integer> mergeArr = new ArrayList<>();
        while (pt1 < arr1.size() && pt2 < arr2.size()) {
            if(arr1.get(pt1) < arr2.get(pt2)){
                mergeArr.add(arr1.get(pt1));
                pt1++;
            }
            else{
                mergeArr.add(arr2.get(pt2));
                pt2++;
            }
        }
        while (pt1 < arr1.size()) {
            mergeArr.add(arr1.get(pt1));
            pt1++;
        }
        while (pt2 < arr2.size()) {
            mergeArr.add(arr2.get(pt2));
            pt2++;
        }
        BSTI.node root = builder(mergeArr,0,mergeArr.size()-1);
        return root;
    }
    public static void main(String[] args) {
        // First BST
        BSTI.node firstRoot = new BSTI.node(2);
        firstRoot.left = new BSTI.node(1);
        firstRoot.right = new BSTI.node(4);

        // Second BST
        BSTI.node secRoot = new BSTI.node(9);
        secRoot.left = new BSTI.node(3);
        secRoot.right = new BSTI.node(12);

        //call
        BSTI.node root = merge(firstRoot,secRoot);
        BSTI.inorder(root);
        System.out.println("NULL");
    }
}