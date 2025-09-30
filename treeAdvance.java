import java.util.LinkedList;
import java.util.Queue;

class treeInfo {
    int height;
    int diameter;

    treeInfo(int height, int diameter) {
        this.height = height;
        this.diameter = diameter;
    }
}

public class treeAdvance {
    Tnode root;
    static int idx = -1;

    public static Tnode buildTree(int[] nodes) {
        idx++;
        if (nodes[idx] == -1)
            return null;
        Tnode newNode = new Tnode(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    public int countNodes(Tnode root) {
        if (root == null)
            return 0;
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        return left + right + 1;
    }

    public int sumOfNodes(Tnode root) {
        if (root == null)
            return 0;
        int left = sumOfNodes(root.left);
        int right = sumOfNodes(root.right);
        return left + right + root.data;
    }

    public int heightOfTree(Tnode root) {
        if (root == null)
            return 0;
        int left = heightOfTree(root.left);
        int right = heightOfTree(root.right);
        int treeHeight = Math.max(left, right) + 1;
        return treeHeight;
    }

    public int diameterOfTree1(Tnode root) {
        if (root == null)
            return 0;

        int HL = heightOfTree(root.left);
        int HR = heightOfTree(root.right);

        int DL = diameterOfTree1(root.left);
        int DR = diameterOfTree1(root.right);

        return Math.max(HL + HR + 1, Math.max(DL, DR));
    }

    public static treeInfo diameterOfTree2(Tnode root) {
        if (root == null)
            return new treeInfo(0, 0);

        treeInfo left = diameterOfTree2(root.left);
        treeInfo right = diameterOfTree2(root.right);

        int myHeight = Math.max(left.height, right.height) + 1;
        int diaThroughRoot = left.height + right.height + 1;

        int myDiameter = Math.max(diaThroughRoot, Math.max(left.diameter, right.diameter));

        return new treeInfo(myHeight, myDiameter);
    }

    public boolean isIdentical(Tnode root, Tnode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        return false;
    }

    public boolean isSubTree(Tnode root, Tnode subRoot) {
        if (subRoot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }

        if (isIdentical(root, subRoot))
            return true;

        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

    public int sumAtLvlK(int k, Tnode root) {
        if (root == null)
            return 0;

        Queue<Tnode> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            int sum = 0;
            for (int i = 0; i < size; i++) {
                Tnode curr = q.poll();

                if (level == k) {
                    sum += curr.data;
                }

                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
            if (level == k)
                return sum;

            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Tnode root = treeAdvance.buildTree(nodes);
        System.out.println("Root Node: " + root.data);

        treeAdvance tree = new treeAdvance();
        int count = tree.countNodes(root);
        System.out.println("Count of nodes: " + count);

        int sum = tree.sumOfNodes(root);
        System.out.println("Sum of nodes: " + sum);

        int height = tree.heightOfTree(root);
        System.out.println("Height of Tree: " + height);

        int diameter1 = tree.diameterOfTree1(root);
        System.out.println("Diameter of Tree(O(n)^2): " + diameter1);

        int diameter2 = tree.diameterOfTree1(root);
        System.out.println("Diameter of Tree(O(n)): " + diameter2);

        idx = -1;
        int[] subNodes = { 2, 4, -1, -1, 5, -1, -1 };
        Tnode subRoot = treeAdvance.buildTree(subNodes);
        System.out.println("SubRoot Node: " + subRoot.data);

        boolean subTree = tree.isSubTree(root, subRoot);
        System.out.println("Sub of Tree: " + subTree);

        int sumAtLvl = tree.sumAtLvlK(2, root);
        System.out.println("Sub of nodes at level K: " + sumAtLvl);
    }
}
