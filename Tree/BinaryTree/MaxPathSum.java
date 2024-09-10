package Tree.BinaryTree;

class Res {
    public int val;
}

public class MaxPathSum {
    public static BTI.node root;
    int findMaxUtil(BTI.node node, Res res){
        if (node == null)
        return 0;
        int l = findMaxUtil(node.left, res);
        int r = findMaxUtil(node.right, res);
        int max_single = Math.max(Math.max(l, r) + node.data,node.data);
        int max_top = Math.max(max_single, l + r + node.data);
        res.val = Math.max(res.val, max_top);
        return max_single;
    }
    int findMaxSum(){
        Res res = new Res();
        res.val = Integer.MIN_VALUE;
        findMaxUtil(root, res);
        return res.val;
    }
    public static void main(String[] args){
        /*
         *          1
         *        2   3
         *      4   5
         * 
         *          4
         *        2   7
         */
        root = new BTI.node(1);
        root.left = new BTI.node(2);
        root.right = new BTI.node(3);
        root.left.left = new BTI.node(4);
        root.left.right = new BTI.node(5);
        // root = new BTI.node(4);
        // root.left = new BTI.node(2);
        // root.right = new BTI.node(7);
        System.out.println(new MaxPathSum().findMaxSum());
    }    
}