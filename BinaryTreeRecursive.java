import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeRecursive
{
    Node root,temp;
    int i=1;
    class Node
    {   int data;
        Node left, right;
        Node(int data)
        {   this.data = data;
            left = right = null;
        }
    }
   void addNode(int data)
   {
       if(root==null)
           root=new Node(data);
       else
       {
           Queue<Node> q=new LinkedList<Node>();
           q.add(root);
           while(!q.isEmpty())
           {
               temp=q.remove();
               if(temp.left==null)
               {
                   temp.left = new Node(data);
                   break;
               }
               else
                   q.add(temp.left);
               if(temp.right==null)
               {
                   temp.right = new Node(data);
                   break;
               }
               else
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


    void inOrderTraversal(Node root)
    {
        if(root!=null) {
            inOrderTraversal(root.left);
            System.out.println(root.data);
            inOrderTraversal(root.right);
        }
    }
    void postOrderTraversal(Node root)
    {
        if(root!=null)
        {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.println(root.data);
        }
    }




    // max element in binary tree using recursive approach
    int maxElement(Node root)
    {
        int max=0,lmax,rmax;
        if(root!=null)
        {   max=root.data;
            lmax=maxElement(root.left);
            rmax=maxElement(root.right);
            if(lmax<rmax)
                lmax=rmax;
            if(max<lmax)
                max=lmax;
        }
        return max;

    }




    //min element in binary tree using recursive approach
    int minElement(Node root)
    {
        int min=Integer.MAX_VALUE,lmin,rmin;
        if(root!=null)
        {
            min=root.data;
            lmin=minElement(root.left);
            rmin=minElement(root.right);
            if(lmin>rmin)
                lmin=rmin;
            if(min>lmin)
                min=lmin;



        }
        return min;
    }




    //height of binary tree using recursive approach

    public int heightofBinaryTree(Node root)
    {
        int lheight, rheight, max = 0;

        if(root==null)
            return 0;
        else
        {
            lheight=heightofBinaryTree(root.left);
            rheight=heightofBinaryTree(root.right);
            if(lheight>=rheight)
                return lheight+1;
            return rheight+1;

        }
    }





    //search an Element in binary tree using recursive approach
    public void search(Node root,int x)
    {
        int num=0;
        if(root==null)
            return;
        else
        {
            num=root.data;
            if(num==x)
            {
                System.out.println("Element" + x + "is present");
            }
            else
            {
                search(root.left,x);
                search(root.right,x);

            }
        }
    }






    //size of Binary tree recursive approach
    int sizeOfBinaryTree(Node root)
    {
        if(root==null)
            return 0;
        return 1+sizeOfBinaryTree(root.left)+sizeOfBinaryTree(root.right);
    }








    public static void main(String[] args)
    {


        BinaryTreeRecursive t=new BinaryTreeRecursive();
        t.addNode(14);
        t.addNode(5);
        t.addNode(3);
        t.addNode(2);
        t.addNode(1);
        t.addNode(21);
        t.addNode(10);
        System.out.println("preOrder");
        t.preOrderTraversal(t.root);
        System.out.println("inOrder");
        t.inOrderTraversal(t.root);
        System.out.println("postorder traversal");
        t.postOrderTraversal(t.root);
        System.out.println("\n"+"max element in tree:  "+
                t.maxElement(t.root));
        System.out.println("\n"+"min element in tree:  "+
                t.minElement(t.root));
        t.search(t.root,-15);
        System.out.println("\n"+"Size of tree is:  "+t.sizeOfBinaryTree(t.root));
        System.out.println("Height of tree"+(t.heightofBinaryTree(t.root)-1));



    }
}
