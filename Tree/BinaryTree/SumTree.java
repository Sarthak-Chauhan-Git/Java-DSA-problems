package Tree.BinaryTree;

public class SumTree {
    public static int sumTree(BTI.node root){
        if(root == null){
            return 0;
        }
        int left = sumTree(root.left);
        int right = sumTree(root.right);
        int temp = root.data;
        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;
        root.data = newLeft+left+right+newRight;
        return temp;
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
        System.out.println(sumTree(root));
        BTI.Tree.preOrder(root);

    }
}
