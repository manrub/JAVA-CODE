public class doubleLinkedList {
    Node start,temp;
    class Node
    {
        int data;
        Node prev,next;

        Node(int data) {
            this.data = data;
            prev=next = null;
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
        {
            temp=start;
            while(temp.next!=null)
                temp=temp.next;
            n.prev=temp;
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

        while(start.next!=null)
            start = start.next;
        System.out.println("last node is deleted"+start.data);
        start.prev.next=null;
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
        doubleLinkedList ob=new doubleLinkedList();
        ob.addNode(14);
        ob.addNode(51);
        ob.addNode(1);
        ob.addNode(13);
        ob.addNode(2);
        ob.addNode(210);
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
