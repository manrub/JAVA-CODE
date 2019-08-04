public class CircularLinkedList {
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
                start.next=start;
                temp=start;
            }
            else
            {
                temp=start;
                while(temp.next!=start)
                    temp=temp.next;
                n.next=start;
                temp.next=n;
                temp=temp.next;
            }

        }
        void deleteAtbeg(Node start)
        {
            System.out.println("start node is deleted"+start.data);
            while(start.next!=this.start)
                start=start.next;
            start.next=this.start.next;
            this.start=start.next;

        }
        void deleteAtlast(Node start)
        {
            Node  temp=start;
            while(start.next!=this.start) {
                temp = start;
                start = start.next;

            }System.out.println("last node is deleted"+start.data);
            temp.next=this.start;
        }

        void print(Node start)
        {
            while(start.next!=this.start)
            {
                System.out.print(start.data+" ");
                start=start.next;
            }
            System.out.println(start.data);
        }

        public static void main(String[] args)
        {
            CircularLinkedList ob=new CircularLinkedList();
            ob.addNode(4);
            ob.addNode(15);
            ob.addNode(1);
            ob.addNode(3);
            ob.addNode(2);
            ob.addNode(20);
            ob.addNode(30);
            ob.addNode(5000);
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
