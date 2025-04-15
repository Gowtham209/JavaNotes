
/*
 * ENUM:
 * !!!NOTE: Enum constants MUST be Typed in CAPITAL letter and separate by ',' and Ends with ';'
 *      Enum is a Listing of Constants in a Class
 *      Enum is a special "class" that represents a group of CONSTANTS (unchangeable variables, like final variables)
 *      Enum is More like A class that Holds objects of "itself" that are Immutable Designed as Singleton 
 *      Enum has Methods like class but they are used to performance with the Enum constants only
 *      Enum constants can have Attributes but these Attributes are field that "ARE ADVISED to be Private Final" so they are Assigned only Once and IMMUTABLE
 *      Enum have Constructor only when the Constants has Attributes (Constructors are Private)    
 * Advantage:
 *  Enum provides Type Safety since the Enum constants are Immutable
 * 
 *       An enum can, just like a class, have attributes and methods. The only difference is that
enum constants are public, static and final (unchangeable - cannot be overridden).
An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces)

When To Use Enums?
    Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc. 
 */

import java.util.*;

enum Day{

    // These are Constants with Attributes separated by ',' and ends with ';'
    // !! NOTE: Each Constant can have varing Attributes
    SUNDAY("weekend","Fun day"),
    MONDAY("weekday","work",8),
    TUESDAY("weekday","work",8),
    WEDNESDAY("weekday","work"),
    THURSDAY("weekday","work",6),
    FRIDAY("weekday","waiting for Leave",6),
    SATURDAY("weekend","Fun day");

    // Fields => even if we change the private final it will WORK but Not Advised to Change because to Attain Immutable condtion
    private final String dayType;
    private final String dayDescription;
    private final int workHours;

    // Constructor
    private Day(String dType,String desDescription)
    {
        this.dayType=dType;
        this.dayDescription=desDescription;
        this.workHours=0;
    }


    private Day(String dType,String desDescription,int workHours)
    {
        this.dayType=dType;
        this.dayDescription=desDescription;
        this.workHours=workHours;
    }

    // Methods that works around Enum constants and Fields

    public String getDay()
    {
        return ""+this;
    }

    public String getDayType(Day d)
    {
        return d.dayType;
    }

    public String getDayDescription(Day d)
    {
        return d.dayDescription;
    }

    public boolean isWeekEnd()
    {
        return (this.dayType).equals("weekend");
    }
    public void totalWorkHours(Day d)
    {
        if(d.workHours==0)
        {
            System.out.println(d+" is Leave");
        }
        else
        {
            System.out.println(d+" has totaly work hours of "+d.workHours);
        }
    }

    public void getSwitch(Day d)
    {
        switch (d.dayType) {
            case "weekend":
                System.out.println(d+" is a WEEK-END Leave from switch");
                break;
        
            default:
            System.out.println(d+" is a WEEKDay Work from switch");
                break;
        }
/*                                  Using the Enum Constant Directly to Compare
                            OR
        switch (d) {
            case SUNDAY:
                System.out.println(d+" is a WEEK-END Leave from switch");
                break;
            case SATURDAY:    
                 System.out.println(d+" is a WEEK-END Leave from switch");
                break;
            default:
            System.out.println(d+" is a WEEKDay Work from switch");
                break;
        }                    
 */
    }

} 

public class Enum {

    public static void main(String[] args) {
        // Accessing the Enum object(Constants)
        Day day=Day.MONDAY;
        System.out.println(day);   // Prints CONSTANT Name Iteslf Here MONDAY
        System.out.println(day.getDayType(day));
        System.out.println(day.getDayDescription(day));
        System.out.println("is today a week end:"+day.isWeekEnd());
        day.totalWorkHours(day);
        day.getSwitch(day);
        System.err.println(day==Day.SATURDAY);

        // Iterating over All Constants of ENUM
        for(Day x:Day.values())
        System.out.println(x+"\n Day Type:"+x.dayType); // => since the dayType field is private so its not Visible

        /*
         * REAL world Web Application use case => REFER my Zoho Full Stack Query Generator
         *   When a user login to your site we fetch the user Privilage like (Admin , Manager, Employee ,etc..)
         * Each user Privilage has different Access and Different Level of Access(Example: read only, read and write ,etc..) to our Site
         *By using Enum in BackEnd
                Like  getting the privilage value from the Cookie send by User
                 with that we Get the ENUM constant
                 Privilage pv = null;
                 switch( 1 )     => 1 getted from the cookie
                 {
                 case 1:
                    pv=Privilage.ADMIN;
                    break;
                 case 2:
                    pv=Privilage.MANAGER;
                    break; 
                 default:
                    pv=Privilage.EMPLOYEE;
                    break;   
                 }
                 if(pv.isAdmin())
                  return read+"-"+write;
                 if(pv.isManager()) 
                    return read;
                 return "No Access";      
         *
         */

         //
         //


    }
}
