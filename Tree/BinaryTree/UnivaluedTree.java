package Tree.BinaryTree;

public class UnivaluedTree {
    public static boolean isUnivalued(BTI.node root){
        if(root == null){
            return true;
        }
        if(root.left != null && root.right != null){
            if(root.data != root.left.data || root.data != root.right.data || root.right.data != root.left.data){
                return false;
            }
        }
        boolean leftFlag = isUnivalued(root.left);
        boolean rightFlag = isUnivalued(root.right);
        if(leftFlag && rightFlag){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        /*
         *      2
         *     2 2
         *   2 22 2
         */
        BTI.node root = new BTI.node(2);
        root.left = new BTI.node(2);
        root.right = new BTI.node(2);
        root.left.left = new BTI.node(2);
        root.left.right = new BTI.node(2);
        root.right.left = new BTI.node(2);
        root.right.right = new BTI.node(2);
        root.right.right = new BTI.node(3);
        System.out.println(isUnivalued(root));
    }
}
