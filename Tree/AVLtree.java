package Tree;

public class AVLtree {
    //node structure which store its own height
    static class node{
        int data,h;
        node left,right;
        public node(int data){
            this.data = data;
            this.h = 1;
        }
    }
    public static node root;

    //return height of each node
    public static int height(node root){
        if(root == null){
            return 0;
        }
        return root.h;
    }

    //preorder
    public static void preorder(node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" -> ");
        preorder(root.left);
        preorder(root.right);
    }

    //balance factor calculation
    public static int balanceFactor(node root){
        if(root == null){
            return 0;
        }
        return height(root.left) - height(root.right);
    }

    //Rotations of each case
    public static node leftRotation(node x){
        node y = x.right;
        node T2 = y.left;
        //rotate
        y.left = x;
        x.right = T2;
        x.h = Math.max(height(x.left),height(x.right)) + 1;
        y.h = Math.max(height(y.left),height(y.right)) + 1;
        //new root
        return y;
    }
    public static node rightRotation(node y){
        node x = y.left;
        node T2 = x.right;
        //rotation
        x.right = y;
        y.left = T2;
        x.h = Math.max(height(x.left),height(x.right)) + 1;
        y.h = Math.max(height(y.left),height(y.right)) + 1;
        //new root
        return x;
    }

    //function to insert nodes in AVL tree by checking balance factor
    public static node insert(node root, int val){
        if(root == null){
            return new node(val);
        }
        else if(val > root.data){
            root.right = insert(root.right, val);
        }
        else if(val < root.data){
            root.left = insert(root.left, val);
        }
        else{
            return root; // same value can't be inserted in bst
        }

        //update root height
        root.h = 1 + Math.max(height(root.left), height(root.right));

        int bf = balanceFactor(root);
        //case 1 : LL
        if(bf > 1 && val < root.left.data){
            return rightRotation(root);
        }
        //case 2: RR
        if(bf < -1 && val > root.right.data){
            return leftRotation(root);
        }
        //case 3: LR
        if(bf > 1 && val > root.left.data){
            root.left = leftRotation(root.left);
            return rightRotation(root);
        }
        //case 4: RL
        if(bf < -1 && val < root.right.data){
            root.right = rightRotation(root.right);
            return leftRotation(root);
        }

        return root;
    }
    public static void main(String[] args){
        root = insert(root,10);
        root = insert(root,20);
        root = insert(root,30);
        root = insert(root,40);
        root = insert(root,50);
        root = insert(root,25);
        preorder(root);
        System.out.println("NULL");
    }
}

