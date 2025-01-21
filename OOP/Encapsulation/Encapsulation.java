/*
 * Encapsulation:
 * 
 * Encapsulation is the practice of BUNDLING Data (fields) 
 and Methods (functions) that operate on the data into a Single Unit or class
 * 
 * Encapsulation Sub Topics
 * Access Modifiers 
 * Getters and Setter
 * 
 * 
 * Access Modifiers:
 *  Access Modifiers are nothing but the Keywords with unique Access power that can be Specified to Class's Fields and Methods
 ,Even for class itself
 *   Public , Default , Protected , Private
 * 
 * Public:
 *  If "public" is Specified to a Variable / Methods / Class then It will be Visisble and Accessible Own File , Folder and even to All other classes of the Project
Suppose the class A is specified in Another Folder we can Import that folder into the Current class can we can Access the class A by
both Object for Non-Static,Static fields and Methods  and Class Name itself for Static fields and Methods 
 * 
 * 
 * Default:
 *  Default is (Package-Private)
 *  If we not Declare the any other Types of Access specifier then Java by Default consider as "default" access specifier
 *  Or we can Explicitly use "default" keyword also 
 *  Default's  Visisble and Accessible is limited to Only within the Folder[Package],own File. Even if we Import we CAN'T Access the
 * default fields and methods of a class
 * 
 * 
 * Protected
 *  Protected is Little Restictive
 *  All the members of the OWN Package and OWN File and SUB-CLASSES can access protected specified Fields & Methods but This won't Visible to Other
 Package classes. If we want to Access or use this "protected specified class / fields / methods" Then we need to Inherit the Protected class 
 * 
 * 
 * Private
 *  Private is the MOST restictive Access Specifier Because we specify Private to a fields/methods/Class inside another class then 
 * ONLY the OWN CLASS Object has Access even SAME Package other classes CAN'T access it
 * 
 * NOTE:
 * IN Java, we cannot specify a class with the "private access specifier" at the "top level". 
 * Java only allows public or the default (package-private) access level for top-level classes. 
 * 
 * 
 * Getters and Setter:
 * 
 *  In a Class if we speciy the Fields as Private then what if we need to change or get the value from it.
 * In this situation we need to Define the Getters and Setters methods which MUST be "public" so that with this methods we can 
 * Manipulate the fields of the Class
 * 
 * Usually Setters methods are always Void as it Return type and with Paramater
 * Getters methods Return type varies depending upon what Data type we are Trying to return and does not have Parameter
 * 
 * 
 */



public class Encapsulation
{
    private String password;// ONLY accessible by the Class own Object
    protected String name;// only accessible within the Package & Sub class
    public int ID; // Directly accessible

    Encapsulation(String name,int i)
    {
        this.name=name;
        this.ID=i;
    }

    public void setPassword(String s)
    {
        this.password=s;
    }

    public String getPassword()
    {
        return this.password;
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation("Naan", 0);
        obj.setPassword("1234");
        System.out.println(obj.password);
    }
}