package Tree.BinaryTree;

public class DistanceNtoN {
    public static int lcaToN(BTI.node root, int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int left = lcaToN(root.left, n);
        int right = lcaToN(root.right, n);
        if(left == -1 && right == -1){
            return -1;
        }
        else{
            if(left == -1){
                return right+1;
            }
            else{
                return left+1;
            }
        }
    }
    public static int nToN(BTI.node root, int n1, int n2){
        BTI.node lca = LowestCommonAncestor.lca2(root,n1,n2);
        int left = lcaToN(lca, n1);
        int right = lcaToN(lca, n2);
        return left + right;
    }
    public static void main(String[] args){
         /*
         *      1
         *     2 3
         *   4 5 6 7
         */
        int n1 = 4, n2 = 7;
        BTI.node root = new BTI.node(1);
        root.left = new BTI.node(2);
        root.right = new BTI.node(3);
        root.left.left = new BTI.node(4);
        root.left.right = new BTI.node(5);
        root.right.left = new BTI.node(6);
        root.right.right = new BTI.node(7);
        System.out.println(nToN(root,n1,n2));
    }
}
