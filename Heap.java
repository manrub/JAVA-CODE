public class Heap
{
    int[] heap;
    int maxSize;
    int size;

    Heap(int maxSize)
    {
        this.maxSize=maxSize;
        this.size=0;
        heap=new int[maxSize];
    }



    int leftChildIndex(int i)
    {
        return 2*i+1;
    }



    int rightChildIndex(int i)
    {
        return 2*i+2;
    }

    int parent(int i)
    {
      return (i-1)/2;
    }

    void  swap(int i,int j)
    {
        int temp=heap[i];
        heap[i]=heap[j];
        heap[j]=temp;
    }

    public void insert(int x)
    {

        if(size==0) {
            heap[size] = x;
            size++;
        }
        else
        {
            heap[size]=x;
           int current=size;
           //for minheap construction
            //while(heap[parent(current)]>heap[current])
            // for maxheap construction
            while(heap[parent(current)]<heap[current])
            {
                swap(current,parent(current));
                current=parent(current);
            }
            size++;
        }
    }
    public void print()
    {
        for (int i = 0; i <size / 2; i++ )
        {
            System.out.print(" PARENT : " + heap[i] + " LEFT CHILD : " + heap[2*i+1]
                    + " RIGHT CHILD :" + heap[2 * i  + 2]);
            System.out.println();
        }
    }
    public static void main(String[] args) {

        System.out.println("The Min Heap is ");
        Heap minHeap = new Heap(10);
        minHeap.insert(5);
        minHeap.insert(30);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(1);
        minHeap.insert(6);
        minHeap.insert(22);
        minHeap.insert(19);

        minHeap.print();
        for(int i=0;i<minHeap.size;i++)
        System.out.print(minHeap.heap[i]+"   ");

    }
}
/*heapify mean creation of heap
heap: it is binary tree having some special property
1.minheap
2.maxheap
3.deletion in heap
4.insertion in heap
5.heapsort
heap uses priority queue;
deletion:::::::::::::O(logn)
insertion::::::::::::O(logn)
searching::::::::::::Olog(n)
*/
