public class SingleLinkedList1 {
    Node start,temp;
    class Node
    {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    void addNode(int data)
    {
        Node n=new Node(data);
        if(start==null)
        {
            start=n;
            temp=start;
        }
        else
        {temp=start;
        while(temp.next!=null)
            temp=temp.next;
        temp.next=n;
        temp=temp.next;
        }

    }
    void deleteAtbeg(Node start)
    {
        System.out.println("start node is deleted"+start.data);
        this.start=start.next;

    }
    void deleteAtlast(Node start)
    {
        Node  temp=start;
        while(start.next!=null) {
            temp = start;
            start = start.next;

        }System.out.println("last node is deleted"+start.data);
        temp.next=null;
    }

    void print(Node start)
    {
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        SingleLinkedList1 ob=new SingleLinkedList1();
        ob.addNode(4);
        ob.addNode(5);
        ob.addNode(1);
        ob.addNode(3);
        ob.addNode(2);
        ob.addNode(20);
        ob.print(ob.start);
        ob.deleteAtbeg(ob.start);
        ob.print(ob.start);
        ob.deleteAtbeg(ob.start);
        ob.print(ob.start);
        ob.deleteAtlast(ob.start);
        ob.print(ob.start);
        ob.deleteAtlast(ob.start);
        ob.print(ob.start);


    }



}
