/*Normal Array Queue*/
public class Queue<T>
{
    private int front=0;
    private int end=0;
    private int size;
    private Object arr[];
    Queue()
    {
        this.size=10;
        this.arr=new Object[size];
    }
    Queue(int size)
    {
        this.size=size;
        this.arr=new Object[size];
    }
    public void add(T data)
    {
        if(isFull())
        {
            resize();
        }
        arr[end++]=data;    
    }
    public Object remove()
    {
        if(end==0)
        {
            System.out.println("Queue is Empty");
            return (Object)(-1);
        }
        T val=(T)arr[front];
        for(int i=0;i<end-1;i++)
        arr[i]=arr[i+1];
        end--;
        return val;
    }
    public boolean isFull()
    {
        return end==size;
    }
    private void resize()
    {
        Object tem[]=new Object[size*2];
        for(int i=0;i<size;i++)
        {
            tem[i]=arr[i];
        }
        size=size*2;
        arr=tem;
    }
    public String toString()
    {
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for(int i=0;i<end-1;i++)
        sb.append(arr[i]+",");
        sb.append(arr[end-1]+"]");
        return sb.toString();
    }
}