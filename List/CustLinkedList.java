public class CustLinkedList<T>
{
    private Node head;
    private Node tail;
    private int size=0;
    CustLinkedList()
    {
        size=0;
    }
    private class Node
    {
        Node next;
        T data;
        Node(T data)
        {
            this.data=data;
            size++;
        }
        Node(T data,Node next)
        {
            this.next=next;
            this.data=data;
            size++;
        }
    }
    public boolean isEmpty()
    {
        if(size==0)
        return true;
        else
        return false;
    }
    public void add(T data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            tail.next=newNode;
            tail=newNode;   
        }
    }
    public void addFirst(T data)
    {
        Node newNode=new Node(data,head);
        head=newNode;
    }
    public void addLast(T data)
    {
        if(head==null)
        {
            addFirst(data);
        }
        Node newNode=new Node(data,null);
        tail.next=newNode;
        tail=newNode;
    }
    public void add(int index,T data)
    {
        if(index==0)
        {
            addFirst(data);
            return;
        }
        if(index==size)
        {
            addLast(data);
            return;
        }
        Node tem=head;
        for(int i=1;i<index;i++)
        {
            tem=tem.next;
        }
        Node node = new Node(data,tem.next);
        tem.next=node;
        size++;
    }
    public T peek()
    {
        return head.data;
    }
    public int size()
    {
        return size;
    }
    public void display()
    {
        Node tem=head;
        System.out.print("[ ");
        while(tem!=null)
        {
            System.out.print(tem.data+" ");
            if(tem.next!=null)
            System.out.print(" , ");
            tem=tem.next;
        }
        System.out.print(" ]");
    }

}
