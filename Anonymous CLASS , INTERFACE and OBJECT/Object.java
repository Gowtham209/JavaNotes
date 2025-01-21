/*
 * Anonymous Object
 * Anonymous Object is a Object which does not have a Referance Variable to store its
 address* which means this Object can be used to call a Method Only one Time .If anothertime
you try to call that same Method a new Anonymous Object will be Created
 */
class Object
{
    public void OneTimeMethod()
    {
        System.out.println("This Method is Called by a Anonymous Object");
    }
}