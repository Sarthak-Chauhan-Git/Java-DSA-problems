package Tree.BST;

public class ValidateBst {
    public static boolean isValid(BSTI.node root, BSTI.node min, BSTI.node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }
        if(max != null && root.data >= max.data){
            return false;
        }
        return isValid(root.left, min, root) && isValid(root.right, root, max);
    }
    public static void main(String[] args){

        int arr[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14  };
        BSTI.node root = new BSTI.node(arr[0]);
        for(int i = 0; i< arr.length; i++){
            BSTI.builder(root, arr[i]);
        }
        System.out.println(isValid(root, null, null));
    }
}
