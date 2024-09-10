package Tree.BinaryTree;

import java.util.*;

public class BTI {
    public static Scanner sc = new Scanner(System.in);

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
    public static class Tree {
        static int count = 0;
        static int sum = 0;
        static int idx = -1;
        static node treeBuilder(int[] values){
            idx++;
            if(values[idx] == -1){
                return null;
            }
            count++;
            node newNode = new node(values[idx]);
            newNode.left = treeBuilder(values);
            newNode.right = treeBuilder(values);
            sum = sum + newNode.data;
            return newNode;
        }
        static int height(node root){
            if(root == null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh,rh)+1;
        }
        static void treeInfo(node root){
            System.out.println("Sum : "+sum);
            System.out.println("No. of nodes : "+count);
            System.out.println("Height : "+height(root));
            System.out.println("Diameter : "+diam.diam2(root).diam);
        }
        static void preOrder(node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" -> ");
            preOrder(root.left);
            preOrder(root.right);
        }
        static void inOrder(node root){
            if(root == null){
                return;
            }
            preOrder(root.left);
            System.out.print(+root.data+" -> ");
            preOrder(root.right);
        }
        static void postOrder(node root){
            if(root == null){
                return;
            }
            preOrder(root.left);
            preOrder(root.right);
            System.out.print(+root.data+" -> ");
        }
        static void levelOrder(node root){
            if(root == null){
                return;
            }
            Queue<node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                node curr = q.remove();
                if(curr == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(curr.data);
                    if(curr.left != null){
                        q.add(curr.left);
                    }
                    if(curr.right != null){
                        q.add(curr.right);
                    }
                }
            }
        }
        
        static class diam{
            int diam;
            int height;
            diam(int diam,int height){
                this.diam = diam;
                this.height = height;
            }
            static int diam1(node root){     //O(n^2)
                if(root == null){
                    return 0;
                }
                int ldiam = diam1(root.left);
                int rdiam = diam1(root.right);
                int lh = height(root.left);
                int rh = height(root.right);
                return Math.max(ldiam,Math.max(rdiam,lh+rh+1));
            }
            static diam diam2(node root){   //O(n)
                if(root == null){
                    return new diam(0,0);
                }
                diam ldiam = diam2(root.left);
                diam rdiam = diam2(root.right);
                int max = Math.max(ldiam.diam,Math.max(rdiam.diam,ldiam.height+rdiam.height+1));
                int maxHeight = Math.max(ldiam.height,rdiam.height)+1;
                diam newDiam = new diam(max,maxHeight);
                return newDiam;
            }
        }
    }
    public static void menu() {
        int i = 0;
        while (i == 0) {
            System.out.println("Enter your choice \n 1 - builder\n 2 - traverse\n 3 - height\n 4 - count\n 5 - sum\n");
            int ch = sc.nextInt();
            if (ch < 5) {
                i = 1;
                break;
            }
        }
    }

    public static void main(String[] args) {
        /*
         *           1
         *         /  \
         *        2    3
         *       / \  / \
         *      4  5 6  7
         */
        int[] values = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        node root = Tree.treeBuilder(values);
        {
            System.out.print("Pre order : ");
            Tree.preOrder(root);
            System.out.println("Null");
            System.out.print("In order : ");
            Tree.inOrder(root);
            System.out.println("Null");
            System.out.print("Post order : ");
            Tree.postOrder(root);
            System.out.println("Null");
            System.out.println("Level order : ");
            Tree.levelOrder(root);
            Tree.treeInfo(root);
        }
            //menu();

    }
}