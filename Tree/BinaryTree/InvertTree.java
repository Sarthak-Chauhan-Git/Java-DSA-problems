package Tree.BinaryTree;

public class InvertTree {
    public static int invert(BTI.node root){
        if(root == null){
            return -1;
        }
        BTI.node temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
        return root.data;
    }
    public static void main(String[] args){
        /*
         *      1
         *     2 3
         *   4 5 6 7
         */
        BTI.node root = new BTI.node(1);
        root.left = new BTI.node(2);
        root.right = new BTI.node(3);
        root.left.left = new BTI.node(4);
        root.left.right = new BTI.node(5);
        root.right.left = new BTI.node(6);
        root.right.right = new BTI.node(7);
        BTI.Tree.preOrder(root);
        invert(root);
        System.out.println();
        BTI.Tree.preOrder(root);
        //BTI.Tree.preOrder(newRoot);
    }
}
