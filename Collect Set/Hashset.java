import java.util.*;
class Hashset
 {
public static void main(String[] args) {
 TreeSet hs=new TreeSet();
 hs.add(11);
 hs.add(12);
 hs.add(13);
 hs.add(12);
 hs.add(15);
 hs.add(16);
 hs.add(111);
 /*Integer a[]=new Integer[hs.size()];
//  a=hs.toArray(a);
//  for(int i=0;i<a.length;i++)
//  System.out.print(a[i]+" ");
 //*/ 
 int arr[]=new int[hs.size()];
 Iterator i=hs.iterator();
 int k=0;
  while(i.hasNext())
  {
  int t=(Integer)i.next();
  arr[k++]=t;
 }
 for(int j=0;j<hs.size();j++)
 System.out.print(arr[j]+" ");
}
}