import java.util.Arrays;
import java.util.*;
class Object 
{
    public static void main(String[] args) {
        int a[]=new int[]{1,8,9,3,5};
        char ch[]=new char[3];
        ch[0]='a';
        ch[1]='b';
        ch[2]='c';
        int b[]=new int[4];
        b[0]=1;
        b[1]=2;
        b[2]=3;
        b[3]=4;
        System.out.println(Arrays.toString(a));
        String str=new String(b);
        System.out.println(str);
    }
}
class A extends Object{
    
}