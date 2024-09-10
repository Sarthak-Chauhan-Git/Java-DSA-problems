package Tree.BST;

public class PrintInRange {
    public static void rangePrinter(BSTI.node root, int min, int max){
        if(root == null){
            return;
        }
        if(root.data >= min && root.data <= max ){
            rangePrinter(root.left, min, max);
            System.out.print(root.data+" -> ");
            rangePrinter(root.right, min, max);
        }
        else if(root.data <= min){
            rangePrinter(root.right, min, max);
        }
        else{
            rangePrinter(root.left, min, max);
        }
    }
    public static void main(String[] args){
        int arr[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        BSTI.node root = new BSTI.node(arr[0]);
        for(int i = 1; i< arr.length; i++){
            BSTI.builder(root, arr[i]);
        }
        int n = 5, m = 12;
        BSTI.inorder(root);
        System.out.println("NULL");
        rangePrinter(root,n,m);
        System.out.println("NULL");
    }
}
