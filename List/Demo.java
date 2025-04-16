import java.util.*;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Demo
{
    public static void main(String[] args) {
        //Custome Single LinkedList
        CustLinkedList list = new CustLinkedList();
        System.out.println(list.isEmpty());
        list.add(8);
        list.add(9);
        list.add(10);
        list.addFirst(7);
        list.add(2,1111);
        list.addLast(99);
        System.out.println(list.peek());
        System.out.println(list.isEmpty());
        list.display();
        for(int i=1;i<=10;i++)
        list.add(i*10);
        list.addFirst(00);
        //list.addLast(120);
        list.add(10, 11111);
        System.out.println(list.peek());
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        list.display();

        //Custom Double LinkedList
        DLinkedList Dlist = new DLinkedList();
        Dlist.add(10);
        Dlist.add(20);
        Dlist.add(30);
        Dlist.add(40);
        Dlist.add(50);
        Dlist.add(60);
        //Dlist.display();
        Dlist.addFirst(-10);
        Dlist.add(2,1111);
        Dlist.addLast(99);
        //System.out.println(Dlist.remove());
        Dlist.add(9,0);
        Dlist.display();



        

    }
}