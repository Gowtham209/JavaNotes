class Demo
{
    static{
        /*
         * Static Block are Used Most to Load JDBC Connection or Process that Need to be Triggered When That Class is Utilized for FIRST Time and ONLY Once is Required
         * 
         */
        System.out.println("::::::\nThis Will be Triggered ONLY ONCE When This Class is Loaded into Execution Process\nThis Block will Run Even when One of the Static Feilds or Method is  'Utilized/Used' No need to Create Object to Trigger\n:::::::");
    }
    Demo()
    {
        System.out.println("Demo Object is Created");
    }
    public static void greet()
    {
        System.out.println("Hai There i am Static method from DEMO");
    }
}
public class StaticBlock {
    public static void main(String[] args) {
        Demo.greet();
        System.out.println("Hai Learner");
    }
}
