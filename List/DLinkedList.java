public class DLinkedList<T>
{
    private Node head;
    private Node tail;
    private int size;
    DLinkedList()
    {
        size=0;
    }
    private class Node
    {
        Node next;
        Node pre;
        T data;
        Node(T data)
        {
            this.data=data;
            size++;
        }
    }
    public void add(T data)
    {
        Node node =new Node(data);
        if(head==null)
        {
            head=node;
            tail=node;
        }
        else
        {
            tail.next=node;
            node.pre=tail;
            tail=node;
        }
    }
    public T peek()
    {
        return head.data;
    }
    public T remove()
    {
        Node tem=tail.pre;
        T v=tail.data;
        tem.next=null;
        return v;
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
         Node tem=getNode(index);
         Node node=new Node(data);
         node.next=tem.next;
         node.pre=tem;
         tem.next=node;
    }
    public void addFirst(T data)
    {
        Node node = new Node(data);
        node.next=head;
        head=node;
    }
    public void addLast(T data)
    {
        Node node=new Node(data);
        node.pre=tail;
        tail.next=node;
        tail=node;
    }
    private Node getNode(int index)
    {
        Node tem=head;
        for(int i=0;i<index-1;i++)
        {
            tem=tem.next;
        }
        return tem;
    }
    public void display()
    {
        Node tem=head;
        System.out.println("Normal");
        System.out.print("[ ");
        while(tem.next!=null)
        {
            System.out.print(tem.data+" ");
            if(tem.next!=null)
            System.out.print(",");
            tem=tem.next;
        }
        System.out.println(tem.data+" ]");
        /*System.out.println("Reverse");
        Node t=tail;
        System.out.print("[ ");
        while(t.pre!=null)
        {
            System.out.print(t.data+" ");
            if(t.pre!=null)
            System.out.print(",");
            t=t.pre;
        }
        System.out.print(t.data+" ]");*/
    }

}