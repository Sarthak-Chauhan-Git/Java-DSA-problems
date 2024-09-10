package Tree.BST;

public class BSTI {
    public static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static node builder(node root, int val) {       //O(h)
        if(root == null){
            root = new node(val);
            return root;
        }
        if(root.data > val){
            root.left = builder(root.left, val);
        }
        if(root.data < val){
            root.right = builder(root.right, val);
        }
        return root;
    }

    static boolean search(node root, int key){      //O(h)
        if(root == null){
            return false;
        }
        if(root.data == key){
            System.out.println("Found : "+root.data);
            return true;
        }
        if(key < root.data){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }
    static int inorderSuccesor(node root){
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }
    static node deleteNode(node root, int val){
        if(root == null){
            return root;
        }
        if(root.data < val){
            root.right = deleteNode(root.right, val);
        }
        else if(root.data > val){
            root.left = deleteNode(root.left, val);
        }
        else{
            //case 1
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            //case 3
            if(root.left != null && root.right != null){
                int IS = inorderSuccesor(root.right);
                root.data = IS;
                root.right = deleteNode(root.right, IS);
            }
        }
        return root;
    }
    
    static void preOrder(node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" -> ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inorder(node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" -> ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 3, 4, 2, 7 };
        node root = new node(arr[0]);
        for(int i = 1; i< arr.length; i++){
            builder(root, arr[i]);
        }
        inorder(root);
        System.out.println("NULL");
        deleteNode(root, 2);
        inorder(root);
    }
}