import java.util.Queue;
import java.util.LinkedList;

class Tnode {
    int data;
    Tnode left, right;

    Tnode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class binaryTree {
    Tnode root;

    void inOrder(Tnode node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    void preOrder(Tnode node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void postOrder(Tnode node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    void levelOrder(Tnode root) {
        if (root == null){
            return;
        }
        Queue<Tnode> q = new LinkedList<Tnode>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Tnode curr = q.remove();
            if(curr == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(curr.data + " ");
                if (curr.left != null)
                q.add(curr.left);
                if (curr.right != null)
                q.add(curr.right);
            }
        }
    }

    static int idx = -1;

    public static Tnode buildTree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Tnode newNode = new Tnode(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    public static void main(String[] args) {
        binaryTree tree = new binaryTree();
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Tnode root = binaryTree.buildTree(nodes);
        System.out.println("ROOT NODE:" + root.data);

        System.out.print("preOrder: ");
        tree.preOrder(root);
        System.out.println();
        System.out.print("inOrder: ");
        tree.inOrder(root);
        System.out.println();
        System.out.print("postOrder: ");
        tree.postOrder(root);
        System.out.println();
        System.out.println("Level Order: ");
        tree.levelOrder(root);
    }
}