package Tree.BinaryTree;

import java.util.*;

public class DupliSubtree {
    public static HashMap<String, Integer> m;

    static String inorder(BTI.node node) {
        if (node == null)
            return "";
        String str = "(";
        str += inorder(node.left);
        str += Integer.toString(node.data);
        str += inorder(node.right);
        str += ")";
        if (m.get(str) != null && m.get(str) == 1)
            System.out.print(node.data + " ");
        if (m.containsKey(str))
            m.put(str, m.get(str) + 1);
        else m.put(str, 1);
        return str;
    }

    static void printAllDups(BTI.node root) {
        m = new HashMap<>();
        inorder(root);
    }

    public static void main(String[] args) {
        /*
         *        1
         *       4 3
         *      3 4 3
         *       3
         */
        BTI.node root = new BTI.node(1);
        root.left = new BTI.node(4);
        root.right = new BTI.node(3);
        root.left.left = new BTI.node(3);
        root.left.right = new BTI.node(4);
        root.right.right = new BTI.node(3);
        root.left.right.left = new BTI.node(3);
        printAllDups(root);
    }
}