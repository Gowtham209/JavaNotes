import java.util.*;
public class Demo {
    
    // public long gcd(int a,int b)
    // {
    //     if(b==0)
    //     return a;
    //     return gcd(b,a%b);
    // }

    // public long lcm(int a,int b)
    // {
    //     return (a*b)/gcd(a, b);
    // }

    // public long gcdArr(int arr[])
    // {
    //     long result=arr[0];
    //     for(int i=1;i<arr.length;i++)
    //     {
    //         result=gcd(result,arr[i]);
    //     }
        
    //     if(result==1)
    //     return 1;

    //     return result;
    // }


    
    
    
    
    
    
    
    public static void main(String[] args) {
        //long lcm=arr[0];
        //lcm=Long.
        // for(int i=1;i<arr.length;i++)
        // {
        //     lcm=lcm(lcm,arr[i]);
        // }
        int arr[]={1,2,3,4,5};
        List<Integer> lst = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            lst.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
            List<Integer> tem = new ArrayList<>(lst);
            tem.remove(i);
            System.out.println(": "+tem);
        }
        // Map<Character,Integer> map = new HashMap<Character,Integer>();
        // for(char x:"abbcccc".toCharArray())
        // map.put(x,map.getOrDefault(x,0)+1);

        // int count=1;
        // for(char key:map.keySet())
        // {
        //     if(map.get(key)>1)
        //     count+=(map.get(key)-1);
        // }
        // System.err.println(count);
        // CustArray list = new CustArray(5);
        // list.add(1);
        // list.add(3);
        //  list.add(12.0);
        //  list.add("Word");
        //  list.add('C');
        //  list.add(true);
        // list.add(new Sam());
        // list.set(0, "Zero");
        // System.out.println("Size ="+list.size());
        // for(int i=0;i<list.size();i++)
        // System.out.println(list.value(i));
    }
}
// Testing
class A<T>{
    T n;
    A()
    {
    }
        A(T a)
        {
           this.n=a;
        }
        void print()
        {
            System.out.println(n+" Works!!");
        }
    }
        /*A<Integer> ob1 = new A<>(12);
        A<Double> ob2 = new A<>(99.99);
        A<Sam> ob3= new A<>(new Sam());
        A<Sam> ob4=new A<>(new Sam());
        A ob5 = new A();
        ob1.print();
        ob2.print();
        ob3.print();
        ob5.print();
        ArrayList o = new ArrayList("Hai");
        Sam p= new Sam();
        o.add(1);
        o.add(12.8);
        o.add("str");
        o.add('b');
        o.add(p);
        o.add('@');
        System.out.println(o);*/
    