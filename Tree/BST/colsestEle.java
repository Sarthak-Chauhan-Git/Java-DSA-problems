package Tree.BST;

public class colsestEle {
    public static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int colsestDiff(int target, int min, node root){
        if(root == null){
            return min;
        }
        int diff = root.data - target;
        min = Math.min(target, diff);
        if(root.data == target){
            return min = 0;
        }
        else if(target > root.data){
            min = colsestDiff(target, min, root.right);
        }
        else{
            min = colsestDiff(target, min, root.left);
        }
        return min;
    }
    public static void main(String[] args){
        node root = new node(8);
        root.left = new node(5);
        root.left.left = new node(3);
        root.left.right = new node(6);
        root.right = new node(11);
        root.right.right = new node(20);
        int target = 5;
        System.out.println("Nearest node distance : "+colsestDiff(target, Integer.MAX_VALUE, root));
    }
}
