/*
 *Multi Level Inheritance 
 Here class are linked like chain together but main thing is Parent class 
 is followed by Single Child class and that child class becomes Parent to Another
 Child class and this goes on
 */

 import java.util.*;

//MultiLevel Inheritace

//Parent class A 
class A{
    void aa(){
        System.out.println("I'm Parent Class A");
    }
}

//child class B has Parent class A
class B extends A{
    void bb(){
       System.out.println("I'm both Parent And Child Class of A");
    }
}

//child class C has child class B (Which class B has Parent class A)
class C extends B{
    void cc(){
        System.out.println("I'm Chlid class of B");
    }
}
//Main class
class Main{
    public static void main(String[] args){
        System.out.println("");
        C o= new C();
        o.aa();
        o.bb();
        o.cc();
    }
}
