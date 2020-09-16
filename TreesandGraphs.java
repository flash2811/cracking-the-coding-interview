import java.util.Queue;

public class TreesandGraphs {

    // assume a TreeNode exists
    // sudo ish

    void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            // visit(node);
            inOrderTraversal(node.right);
        }
    }

    void preOrderTraversal(TreeNode node) {
        if (node != null) {
            // visit(node);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    void postOrderTraversal(TreeNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            // visit(node);
        }
    }
}

// binary tree --> each node has up to two children
// binary search tree --> all left descendants  <= n < all right descendants
// pre, post, and in are forms of dfs


// code from geeksforgeeks

class BinaryTree {
    // Root of Binary Tree
    private class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node root;

    BinaryTree() {
        root = null;
    }

    void printInorder(Node node) {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }

    void printPreorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    void printPostorder(Node node) {
        if (node == null)
            return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }

    // bfs --> remember that this uses a queue and is not recursive (generally)

    void printLevelOrder() {
        // 
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {

            Node tempNode = queue.remove();
            System.out.print(tempNode.key + " ");

            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }

    }
}

