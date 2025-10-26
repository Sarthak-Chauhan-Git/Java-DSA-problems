package Tree;

public class SumLRrange {
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

    public static int rangeSum(int l, int r, int sum, node root){

        if(root == null){
            return sum;
        }
        if(l < root.data && r > root.data){
            sum = sum + root.data;
        }
        if(l < root.data){
            sum = rangeSum(l, r, sum, root.left);
        }
        if(r > root.data){
            sum = rangeSum(l, r, sum, root.right);
        }
        return sum;
    }

    public static void main(String[] args){
        node root = new node(8);
        root.left = new node(5);
        root.left.left = new node(3);
        root.left.right = new node(6);
        root.right = new node(11);
        root.right.right = new node(20);

        int l = 5, r = 15;
        System.out.println("Sum is :"+rangeSum(l,r,0,root));
    }
}
