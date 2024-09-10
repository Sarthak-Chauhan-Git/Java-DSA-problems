package Tree.BST;

public class MirrorBST {
    public static BSTI.node mirrorBST(BSTI.node root){
        if(root == null){
            return root;
        }
        BSTI.node leftS = mirrorBST(root.left);
        BSTI.node rightS = mirrorBST(root.right);
        root.right = leftS;
        root.left = rightS;
        return root;
    }
    public static void main(String[] args){
        int arr[] = { 8, 5, 10, 3, 6, 11};
        BSTI.node root = new BSTI.node(arr[0]);
        for(int i = 0; i< arr.length; i++){
            BSTI.builder(root, arr[i]);
        }
        BSTI.inorder(root);
        System.out.println("Null");
        mirrorBST(root);
        BSTI.inorder(root);
        System.out.println("Null");
    }
}
