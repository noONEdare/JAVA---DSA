class Tnode {
    int data;
    Tnode left, right;

    Tnode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class binaryTree {
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
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, -1 };
        Tnode root = binaryTree.buildTree(nodes);
        System.out.println(root.data);
    }
}