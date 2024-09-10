package Tree.BinaryTree;

public class KthAncestor {
    public static int KofN(BTI.node root, int n, int k){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }

        int left = KofN(root.left, n, k);
        int right = KofN(root.right, n, k);

        if(left == -1 && right == -1){
            return -1;
        }

        int max = Math.max(left, right);

        if(max+1 == k){
            System.out.println(root.data);
        }

        return max+1;
    }
    public static void main(String[] args){
        /*
         *      1
         *     2 3
         *   4 5 6 7
         */
        int n = 5, k = 2;
        BTI.node root = new BTI.node(1);
        root.left = new BTI.node(2);
        root.right = new BTI.node(3);
        root.left.left = new BTI.node(4);
        root.left.right = new BTI.node(5);
        root.right.left = new BTI.node(6);
        root.right.right = new BTI.node(7);
        KofN(root,n,k);
    }
}
