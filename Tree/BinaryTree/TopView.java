package Tree.BinaryTree;

import java.util.*;

public class TopView {
    static class info {
        BTI.node node;
        int hd;

        info(BTI.node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(BTI.node root) {
        HashMap<Integer, BTI.node> map = new HashMap<>();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        // BFS
        Queue<info> q = new LinkedList<>();
        q.add(new info(root, 0));
        q.add(null);
        while (!q.isEmpty()) {
            info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                // top view
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }

                // next calls
                if (curr.node.left != null) {
                    q.add(new info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd-1);
                }

                if (curr.node.right != null) {
                    q.add(new info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd+1);
                }
            }
        }

        System.out.println("Top view : ");
        for (int i = min; i < max + 1; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }

    public static void main(String[] args) {
        /*
         * 1
         * 2 3
         * 4 5 6 7
         */
        BTI.node root = new BTI.node(1);
        root.left = new BTI.node(2);
        root.right = new BTI.node(3);
        root.left.left = new BTI.node(4);
        root.left.right = new BTI.node(5);
        root.right.left = new BTI.node(6);
        root.right.right = new BTI.node(7);
        topView(root);
    }
}
