package Tree.BinaryTree;

public class DelLeafX {
    public static BTI.node delLeaf(BTI.node root, int x){
        if(root == null){
            return null;
        }
        BTI.node left = delLeaf(root.left, x);
        BTI.node right = delLeaf(root.right, x);
        if(left == null && right == null){
            if(root.data == x){
                root.data = -1;
            }
        }
        else{
            if(root.left.data == -1){
                root.left = root.left.left;
            }
            if(root.right.data == -1){
                root.right = root.right.right;
            }
        }
        return root;
    }
    public static void main(String[] args){
        /*
         *      1
         *     3 2
         *   4 3 6 3
         */
        BTI.node root = new BTI.node(1);
        root.left = new BTI.node(3);
        root.right = new BTI.node(4);
        root.left.left = new BTI.node(3);
        root.left.right = new BTI.node(2);
        root.right.left = new BTI.node(6);
        root.right.right = new BTI.node(3);
        int x = 3;
        BTI.Tree.preOrder(root);
        System.out.println();
        delLeaf(root,x);
        BTI.Tree.preOrder(root);
    }
}
