package Tree.BST;

import java.util.*;

import BasicDSA.Array.printer;

public class RootToLeaf {
    public static void pathPrinter(BSTI.node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printer.print(path);
        }
        pathPrinter(root.left, path);
        pathPrinter(root.right, path);
        path.remove(path.size()-1);
    }
    public static void main(String[] args){
        int arr[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14  };
        BSTI.node root = new BSTI.node(arr[0]);
        for(int i = 0; i< arr.length; i++){
            BSTI.builder(root, arr[i]);
        }
        pathPrinter(root, new ArrayList<>());
    }
}
