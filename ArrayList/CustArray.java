import java.util.*;
public class CustArray<T> {
private T ar[];

private int size=0;
private int n=0;
private int Default_Size=10;
public CustArray(int n)
{
    this.n=n;
    this.ar=(T[])new Object[n];
}
public CustArray()
{
this.ar=(T[])new Object[Default_Size];
}
void add(T ele)
{
    if(isfull())
    {
        resize();
    }
    ar[size++]=ele;
}
void resize()
{
    T tem[] = (T[])new Object[size*2];
    this.n=size*2;
    for(int i=0;i<size;i++)
    tem[i]=ar[i];
    ar=tem;
}
private boolean isfull()
{
    return size==n;
}
Object value(int i)
{
    return (T)ar[i];
}
void set(int i,T a)
{
    T tem[]=(T[])new Object[n];
    for(int j=0;j<i;j++)
    tem[j]=ar[j];
    tem[i]=a;
    int k=i;
    size++;
    k++;
    for(int j=i;j<size;j++)
    {
      tem[k++]=ar[j];
    }
    ar=tem;
}
void append(T a)
{
    ar[size++]=a;
}
int size()
{
    return size;
}
}
