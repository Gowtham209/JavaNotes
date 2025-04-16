public class CircularLinkedList<T>
{
    private Node head;
    private Node tail;
    private int size;
    CLinkedList()
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
    }
    public void add(T data)
    {
        Node node = new Node(data);
        if(head==null)
        {
            head=node;
            tail=node;
        }
        else
        {
            tail.next=node;
            node.next=head;
            tail=node;
        }
    }
    public void display()
    {
        Node tem=head;
        if(head!=null)
        {
           do{
                System.out.print(tem.data+" ");
                tem=tem.next;
            }while(tem!=head);
        }
    }
}