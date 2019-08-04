import java.util.*;

public class verticalSumOfBinaryTree {

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
    public static void verticalOrderTraversal(Node root,int column,HashMap<Integer, ArrayList<Integer>> h)
    {
        if(root==null)
            return;
         verticalOrderTraversal(root.left,column-1,h);
         if(!h.containsKey(column)) {
             ArrayList<Integer> a=new ArrayList<>();
             a.add(root.data);
             h.put(column,a);
         }
         else {
             ArrayList<Integer> a1 = new ArrayList(h.get(column));
             a1.add(root.data);
             h.put(column, a1);
         }
         verticalOrderTraversal(root.right,column+1,h);

    }

    public static void main(String[] args) {
        verticalSumOfBinaryTree t=new verticalSumOfBinaryTree();
        t.addNode(14);
        t.addNode(5);
        t.addNode(3);
        t.addNode(2);
        t.addNode(1);
        t.addNode(21);
        t.addNode(10);
        t.addNode(49);
        HashMap<Integer,ArrayList<Integer>> h=new HashMap<>();
        t.verticalOrderTraversal(t.root,0,h);
        System.out.println(h);



    }
}
