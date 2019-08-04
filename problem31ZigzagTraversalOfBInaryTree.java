import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class problem31ZigzagTraversalOfBInaryTree {

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

    void zigzag(Node root)
    {
        if(root==null)
            return;
        int lefttoright=1;
        Stack<Node> s1=new Stack<>();
        Stack<Node> s2=new Stack<>();
        s1.push(root);
        while(s1.isEmpty())
        {
            temp=s1.pop();
            if(temp!=null) {
                System.out.println(temp.data);
                if (lefttoright == 1) {
                    if(temp.left!=null)
                        s1.push(temp.left);
                    if(temp.right!=null)
                        s1.push(temp.right);

                }
            }

        }

    }


    public static void main(String[] args) {
        problem31ZigzagTraversalOfBInaryTree t=new problem31ZigzagTraversalOfBInaryTree();
        t.addNode(14);
        t.addNode(5);
        t.addNode(3);
        t.addNode(2);
        t.addNode(1);
        t.addNode(21);
        t.addNode(10);
        t.addNode(49);




    }


}
