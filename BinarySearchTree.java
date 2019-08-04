public class BinarySearchTree
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
    public void addNode(int data)
    {
        if(root==null)
            root=new Node(data);
        else
        {
            temp=root;
            while(temp!=null)
            {
                if(temp.data>data)
                {
                    if (temp.left == null) {
                        temp.left = new Node(data);
                        break;
                    }
                    temp=temp.left;
                }
                else
                {
                    if (temp.right == null) {
                        temp.right = new Node(data);
                        break;
                    }
                    temp=temp.right;
                }

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

    public static  void main(String[] args)
    {
        BinarySearchTree t=new BinarySearchTree();
        t.addNode(1);
        t.addNode(5);
        t.addNode(3);
        t.addNode(22);
        t.addNode(15);
        t.addNode(1);
        t.addNode(2);
        System.out.println("preOrder");
        t.preOrderTraversal(t.root);
        System.out.println("inOrder");
        t.inOrderTraversal(t.root);
        System.out.println("postorder traversal");
        t.postOrderTraversal(t.root);

    }
}
