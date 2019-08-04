import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree
{
    Node root,temp;
        class Node
        {
            int data;
            Node left,right;
            Node(int data)
            {
                this.data=data;
                left=right=null;
            }

        }






// insert node in binary tree using queue
        void addNode(int data)
        {
            Node newnode=new Node(data);

            if(root==null)
                root=newnode;
            else
            {
                     Queue<Node> q=new LinkedList<Node>();
                    q.add(root);
                    while (!q.isEmpty())
                    {
                        temp=q.remove();
                        if(temp.left!=null)
                            q.add(temp.left);
                        else
                            {
                            temp.left = newnode;
                            return;
                        }
                        if(temp.right!=null)
                            q.add(temp.right);
                        else
                        {
                            temp.right=newnode;
                            return;
                        }

                    }
                }
            }




            //tree inordertraversal using stack

            void inOrderTraversal(Node temp)
            {
                Stack<Node> s=new Stack<Node>();
                while(true)
                {
                    while(temp!=null)
                    {   s.push(temp);
                        temp=temp.left;
                    }
                    if(s.empty())
                        break;
                    Node temp1=s.pop();
                    System.out.println(temp1.data);
                    temp=temp1.right;
                }

            }





            //tree preordertraversal using stack

            void preOrderTraversal(Node temp)
            {
                Stack<Node> s=new Stack<Node>();
                while (true)
                {
                    while(temp!=null)
                    {
                        System.out.println(temp.data);
                        s.push(temp);
                        temp=temp.left;

                    }
                    if(s.empty())
                        break;
                    Node temp1=s.pop();
                    temp=temp1.right;
                }
            }








    //tree postordertraversal using stack
            void postOrderTraversal(Node temp)
            {
                Stack<Node> s=new Stack<Node>();
                while(true)
                {
                    while(temp!=null)
                    {

                    }
                }
            }








            // level order traversal
    void levelOrderTraversal(Node root)
    {
        if(root==null)
        {
            return;
        }
        else
        {
            Queue<Node> q=new LinkedList<Node>();
            q.add(root);
            while(!q.isEmpty())
            {
                temp=q.remove();
                System.out.print(temp.data+" ");
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
            }
        }

    }









    // max element in binary tree
    int maxElementInBinaryTree(Node root)
    {
        System.out.println("hello");
        int max=Integer.MIN_VALUE;
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty())
        {
            temp=q.remove();
            if(max<=temp.data)
                max=temp.data;
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
        }
        return max;
    }









    //minimum element if binary tree
    int minElementInBinaryTree(Node root)
    {
        int min=Integer.MAX_VALUE;
        Stack<Node> s=new Stack<Node>();
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty())
        {
            temp=q.remove();
            if(min>=temp.data)
                min=temp.data;
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
        }
        return min;
    }








    //search an Element in binary tree
    public void search(Node root,int x)
    {
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()) {
            temp = q.remove();
            if (temp.data == x) {
                System.out.println("Element" + x + "is present");
                break;
            } else {
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }
        }
    }








    // size of tree
    void size(Node root)
    {
        int c=0;
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty())
        {
            temp=q.remove();
            c++;
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
        }
        System.out.println("Size is:::::::"+c);
    }

















    //height of a tree
    int  height(Node root)
    {
        Queue<Node> q=new LinkedList<Node>();
        if(root==null)
            return 0;
        q.add(root);
        q.add(null);

        int c=0;
        while(!q.isEmpty())
        {
            temp=q.remove();
            if(temp==null)
            {    if(!q.isEmpty())
                    q.add(null);
                c++;
            }
            else
            {
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }            }
        }
        return c-1;
    }

















    // all leaf node of binary tree
     void  leafNode(Node root)
    {
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty())
        {
            temp=q.remove();
            if(temp.left==null && temp.right==null)
                System.out.print(temp.data+"  ");
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                    q.add(temp.right);

        }

    }





    //full node in binary tree
    //full node : a node is called full node if both left and right child is not null
    void fullNode(Node n)
    {
        Queue<Node> q=new LinkedList<Node>();
         q.add(root);
        while(!q.isEmpty())
        {
            temp=q.remove();
            if(temp.left!=null && temp.right!=null)
                System.out.println(temp.data);
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
        }

    }
















// half nodes
    // A node is called half node if either left or right  child is null;

     void halfNode(Node n)
    {
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty())
        {
            temp=q.remove();
            if((temp.left!=null && temp.right==null)||(temp.left==null && temp.right!=null))
                System.out.println(temp.data);
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
        }

    }






  // level has maximum sum
    int levelHasMaxSum(Node root)
    {
        int max=0,s=0;
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {   temp=q.remove();
            if(temp!=null)
            s=s+temp.data;
            if(temp==null) {
                if (max < s)
                    max = s;
                s = 0;
            }
        }
        return max;
    }


    public static void main(String[] args)
        {
            BinaryTree t=new BinaryTree();
            t.addNode(14);
            t.addNode(5);
            t.addNode(3);
            t.addNode(22);
            t.addNode(15);
            t.addNode(91);
            System.out.println("inOrder");
            t.inOrderTraversal(t.root);
            System.out.println("preOrder");
            t.preOrderTraversal(t.root);
            System.out.println("levelOrderTravesal");
            t.levelOrderTraversal(t.root);
            System.out.println("\n"+"max element in tree"+
                    t.maxElementInBinaryTree(t.root));
            System.out.println("\n"+"min element in tree"+
                    t.minElementInBinaryTree(t.root));
            t.search(t.root,22);
            t.size(t.root);
            System.out.println("Height of tree is:"+t.height(t.root));
            System.out.println("leaf nodes are");
            t.leafNode(t.root);
            System.out.println("\n"+"full Nodes  are");
            t.fullNode(t.root);


            System.out.println("\n"+"half Nodes  are");
            t.halfNode(t.root);
        }


}
