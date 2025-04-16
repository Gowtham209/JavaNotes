import java.util.*;
class PriQueue
{
    public static void main(String[] args) {
       PriorityQueue q=new PriorityQueue();
       q.add(123);
       q.add(321); 
       q.add(123);
       q.add(1);
       q.add(2);
       Iterator i=q.iterator();
        while(i.hasNext())
       {
       System.out.println(q.remove());
       }
       

    }
}