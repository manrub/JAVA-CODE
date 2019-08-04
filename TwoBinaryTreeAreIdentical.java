import java.util.Queue;
import java.util.LinkedList;
public class TwoBinaryTreeAreIdentical {

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
    void preOrderTraversal(Node root)
    {
        if(root!=null) {
            System.out.println(root.data);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }


    // check whether two binary tree are identical
    boolean identical(Node root,Node root1)
    {
        if(root==null&&root1==null)
            return true;
        if(root==null || root1==null)
            return false;
        return (root.data==root1.data)&&identical(root.left,root1.left)&&identical(root.right,root1.right);
    }

    public static void main(String[] args) {
        TwoBinaryTreeAreIdentical t1 = new TwoBinaryTreeAreIdentical();
        TwoBinaryTreeAreIdentical t2= new TwoBinaryTreeAreIdentical();
        t1.addNode(14);
        t1.addNode(5);
        t1.addNode(3);
        t1.addNode(2);
        t1.addNode(1);
        t1.addNode(21);
        t1.addNode(10);
        t2.addNode(14);
        t2.addNode(5);
        t2.addNode(3);
        t2.addNode(2);
        t2.addNode(1);
        t2.addNode(111);
        t2.addNode(10);
        t1.preOrderTraversal(t1.root);
        System.out.println("second tree");
        t2.preOrderTraversal(t2.root);
        System.out.println(t1.identical(t1.root,t2.root)?"identical":"not identical");
    }
}