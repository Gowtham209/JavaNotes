public class Demo
{
    public static void main(String[] args) {
        // Queue que=new Queue();
        CircularQueue que=new CircularQueue();
         System.out.println(que.isFull());
        // //for(int i=0;i<7;i++)
        System.out.println(que.remove());
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
       // System.out.println(que.remove());
        que.add(50);
        que.add(60);
        System.out.println(que.remove());
        System.out.println(que.remove());
        System.out.println(que.remove());
        System.out.println(que.remove());
        System.out.println(que);
        //System.out.println(que.arr[0]+" "+que.arr[1]);
       // System.out.println(que.front+" "+que.end);
        
        //System.out.println(que.size+" "+que.end);
        // int a[]=new int [6];
        // a[0]=1;
        // a[1]=2;
        // a[2]=3;
        // System.out.println(a.length);
    }
}