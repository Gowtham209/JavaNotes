public class CircularQueue<T>
{
     private int front=0;
     private int end=0;
     private int size=0;
     private Object arr[];
    CircularQueue()
    {
        arr=new Object[10];
    }
    CircularQueue(int size)
    {
        arr=new Object[size];
    }
    public void add(T data)
    {
        if(isFull())
        {
            resize();
        }
        arr[end]=data;
        end++;
        end=end%arr.length;
        size++;
    }
    public Object remove()
    {
        if(isEmpty())
        {
            return "No Elements in the CircularQueue";
        }
        T val=(T)arr[front];
        front++;
        front = front % arr.length;
        size--;
        return val;
    }
    public boolean isFull()
    {
        return end==arr.length;
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    private void resize()
    {
        Object tem[] =new Object[arr.length*2];
        for(int i=0;i<size;i++)
        tem[i]=arr[(front+i)%arr.length];
        arr=tem;
        front=0;
        end=size;
       
    }

    public String toString()
    {
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for(int i=front;i<end;i++)
        sb.append(arr[i]+",");
        sb.append("]");
        return sb.toString();
    }
}