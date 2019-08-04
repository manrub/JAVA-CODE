import java.util.LinkedList;
import java.util.Queue;
import java.lang.Math;

public class diameterOfBinaryTree {
    Node root, temp;
    int i = 1;

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    void addNode(int data) {
        if (root == null)
            root = new Node(data);
        else {
            Queue<Node> q = new LinkedList<Node>();
            q.add(root);
            while (!q.isEmpty()) {
                temp = q.remove();
                if (temp.left == null) {
                    temp.left = new Node(data);
                    break;
                } else
                    q.add(temp.left);
                if (temp.right == null) {
                    temp.right = new Node(data);
                    break;
                } else
                    q.add(temp.right);
            }
        }

    }

    int diameter(Node root) {
        if (root == null)
            return 0;
        else {
            int option1 = height(root.left) + height(root.right);
            int option2 = diameter(root.left);
            int option3 = diameter(root.right);
            return Math.max(option1, Math.max(option2, option3));
        }

    }

    //height of a tree
    int height(Node root)
    {

        if(root==null)
            return 0;
        return Math.max(1+height(root.left),1+height(root.right));
}


    public static void main(String[] args) {
        diameterOfBinaryTree t=new diameterOfBinaryTree();
        t.addNode(14);
        t.addNode(5);
        t.addNode(3);
        t.addNode(2);
        t.addNode(1);
        t.addNode(21);
        t.addNode(10);
        t.addNode(49);
        System.out.println("diameter is:"+t.diameter(t.root));
        System.out.println("1+treeheight"+t.height(t.root));

    }
}
