package Tree.BST;

public class BiggestValidBST {
    static class info{
        boolean isBST;
        int size;
        int min;
        int max;
        public info(boolean isBST, int size, int min, int max){
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public static int maxBST = Integer.MIN_VALUE;
    public static info biggestBST(BSTI.node root){
        //base
        if(root == null){
            return new info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        info left = biggestBST(root.left);
        info right = biggestBST(root.right);
        int size = left.size + right.size + 1;
        int min = Math.min(root.data, Math.min(left.min, right.min));
        int max = Math.max(root.data,Math.max(left.max,right.max));
        if(left.max >= root.data || right.min <= root.data){
            return new info(false, size, min, max);
        }
        if(left.isBST && right.isBST){
            maxBST = Math.max(maxBST,size);
            return new info(true, size, min, max);
        }
        return new info(false, size, min, max);

    }
    public static void main(String[] args){
        BSTI.node root = new BSTI.node(50);
        root.left = new BSTI.node(30);
        root.left.left = new BSTI.node(5);
        root.left.right = new BSTI.node(20);
        root.right = new BSTI.node(60);
        root.right.left = new BSTI.node(45);
        root.right.right = new BSTI.node(70);
        root.right.right.left = new BSTI.node(65);
        root.right.right.right = new BSTI.node(80);
        biggestBST(root);
        System.out.println("Largest BST in tree is of size : "+maxBST);
    }
}
