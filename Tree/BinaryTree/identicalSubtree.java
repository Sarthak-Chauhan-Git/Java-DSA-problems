package Tree.BinaryTree;

public class identicalSubtree{
    public static boolean isSub(BTI.node root, BTI.node subRoot){
        if(root == null || subRoot == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            };
        }
        return isSub(root.left, subRoot) || isSub(root.right, subRoot);
    }
    public static boolean isIdentical(BTI.node root, BTI.node subRoot){
        if(root == null && subRoot == null){
            return true;
        }
        else if(root == null || subRoot == null){
            return false;
        }
        if(root.data != subRoot.data){
            return false;
        }
        boolean left = isIdentical(root.left, subRoot.left);
        boolean right = isIdentical(root.right, subRoot.right);
        if(left && right){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        /*int[] values = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
         *
         *           1
         *         /  \
         *        2    3
         *       / \   \
         *      4  5    6
         *
        int[] subValues = {2,4,-1,-1,5,-1,-1};
         *
         *          2
         *        /  \
         *       4    5
         *
         * BinaryTreeImplementation.node root = BinaryTreeImplementation.Tree.treeBuilder(values);
         * BinaryTreeImplementation.node subRoot = BinaryTreeImplementation.Tree.treeBuilder(subValues); */
        BTI.node root = new BTI.node(1);
        root.left = new BTI.node(2);
        root.right = new BTI.node(3);
        root.left.left = new BTI.node(4);
        root.left.right = new BTI.node(5);
        root.right.left = new BTI.node(6);
        root.right.right = new BTI.node(7);
        System.out.println("Tree 1 : ");
        BTI.Tree.preOrder(root);
        System.out.println("Null");
        System.out.println("Tree 2 : ");
        BTI.node subRoot = new BTI.node(2);
        subRoot.left = new BTI.node(4);
        subRoot.right = new BTI.node(5);
        BTI.Tree.preOrder(subRoot);
        System.out.println("Null");
        System.out.println("Is sub tree : "+isSub(root, subRoot));
    }
}