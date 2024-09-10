package Tree.BST;

public class BSTarray {
    public static BSTI.node balanceTree(int[] arr, int min, int max){
        if(min > max){
            return null;
        }
        int mid = (min+max)/2;
        BSTI.node root = new BSTI.node(arr[mid]);
        root.left = balanceTree(arr, min, mid-1);
        root.right = balanceTree(arr, mid+1, max);
        return root;
    }
    public static void main(String[] args){
        int arr[] = {3, 5, 6, 8, 10, 11, 12};
        BSTI.node root = balanceTree(arr, 0, arr.length-1);
        BSTI.preOrder(root);
        System.out.println("Null");
    }
}
