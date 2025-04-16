import java.util.*;


public class MaxHeap<T extends Number & Comparable<T>> {

    private List<T> arr;
    MaxHeap()
    {
        arr=new ArrayList<T>();
    }

    public void add(T val)
    {
        arr.add(val);
        insert(val);
    }

    public void insert(T val)
    {

        T child=val;

        int index=arr.size()-1;
        
        while(index>0)
        {
            int p=index/2;
            T parent=arr.get(p);
            if(child.compareTo(parent)>0)
            {
                swap(index,p);
                index=p;
            }
            else
            {
                break;
            }
        }
    }

    public void swap(int c,int p)
    {
        T tem=arr.get(c);
        arr.set(c,arr.get(p));
        arr.set(p,tem);
    }
    
    public T pop()
    {
        T ans=null;
        int len=arr.size();
        if(len>0)
        {
            ans=arr.get(0);
            
            T last=arr.get(len-1);
            arr.remove(len-1);

            // Suppose if we Have Removed the Last Value in the Array Then No Need to call delete()
            if(arr.isEmpty())
                return ans;

            arr.set(0,last);
            
            delete();

            return ans;
        }

        return ans;
    }

    public void delete()
    {
            int index=0;
            int len=arr.size();

            len-=1;
            /*  The Loop will Only Terminate When the index is Equal or Greater than the Array END which is (n-1) so
            ONLY when we Reduce the Len of the Array to One Less The Above Condition can Be Attained ELSE """STACK OVERFLOW Error"""  Infinite Loop */
            
            while(index<len)
            {
                int l=(index*2)+1;
                int r=(index*2)+2;
                T rootValue=arr.get(index);
                T leftValue=null;
                T rightValue=null;

                if(l<=len)
                leftValue=arr.get(l);

                if(r<=len)
                rightValue=arr.get(r);

                if( (leftValue!=null && rightValue!=null) && leftValue.compareTo(rightValue)>=0 && leftValue.compareTo(rootValue)>=0) 
                {
                    swap(index, l);
                    index=l;
                }
                else if(leftValue!=null && rightValue!=null && rightValue.compareTo(leftValue)>0 && rightValue.compareTo(rootValue)>0)
                {
                    swap(index, r);
                    index=r;
                }
                else if(rightValue==null && leftValue!=null && leftValue.compareTo(rootValue)>=0)
                {
                    swap(index,l);
                    index=l;
                }
                else
                {
                    //Suppose the Both the l & r goes out of the Array Length then giving the l is Better value to Terminate the Loop
                    index=l;
                }
            }
    }

    public T peek()
    {
        if(arr.isEmpty())
        return null;

        return arr.get(0);
    }

    public int size()
    {
        return arr.size();
    }
    public String toString()
    {
        if(arr.isEmpty())
        return "[]";
        StringBuilder ans = new StringBuilder("");
        
        for(T x:arr)
        {
            ans.append(""+x+",");
        }
        String result=ans.toString();
        result=result.substring(0,result.length()-1);

        return "["+result+"]";
    }
}
