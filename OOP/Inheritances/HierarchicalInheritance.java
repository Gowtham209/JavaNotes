import java.util.*;
/*
 * Hierarchical Inheritance
 * 
 * Multiple classes inherit from a Single superclass[a.k.a Parent Class]
 * 
 */
abstract class Vehicle{
   double speed;
   String name;
   static int count=0;
   abstract void start();
   abstract void stop();
}
class Car extends Vehicle{
    Car()
    {
     count++;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public void setspeed(double speed)
    {
        this.speed=speed;
    }
    public void start()
    {
        System.out.println("The "+this.name+" is moving at "+this.speed);
    }
    public void stop()
    {
        System.out.println("The "+this.name+" is Stopped");
    }
}
class Bike extends Vehicle{
    
    public void start()
    {
        System.out.println("The "+this.name+" is moving at "+this.speed);
    }
    public void stop()
    {
        System.out.println("The "+this.name+" is Stopped");
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public void setspeed(double speed)
    {
        this.speed=speed;
    }

}
public class HierarchicalInheritance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of wheelers:");
        int cr=sc.nextInt();
        sc.nextLine();
        Car car[]=new Car[cr];
        for(int i=0;i<cr;i++)
        {
        double speed=sc.nextDouble();
        String name=sc.nextLine();
        car[i] = new Car();
        car[i].setname(name);
        car[i].setspeed(speed);
        }
        System.out.println("Enter No of wheelers:");
        int r=sc.nextInt();
        sc.nextLine();
        Bike bike[]=new Bike[r];
        for(int i=0;i<r;i++)
        {
        double speed=sc.nextDouble();
        String name=sc.nextLine();
        //System.out.println(car[i]);
        bike[i] = new Bike();
        bike[i].setname(name);
        bike[i].setspeed(speed);
        }

        // Car car = new Car("Skoda",180.0);
        // Car bmw = new Car("BMW",290.9);
        // Car audi = new Car("Audi",289.9);
        // Bike re= new Bike("RoyalEnfield",140.0);
        // Bike duke = new Bike("KTM Duke 390",179.9);
        Vehicle xp[]=new Vehicle[cr+r];
         int t=0;
        for(int i=0;i<cr;i++)
        xp[t++]=car[i];
        for(int i=0;i<r;i++)
        xp[t++]=bike[i];
        for(Vehicle bp: xp)
        System.out.println("The car "+bp.name+" is Moving @ "+bp.speed);
        System.out.println(Vehicle.count);
    }
}