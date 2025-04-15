import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/*
 * Threads Keywords
 *  Atomicity Implementing Keywords:
 * 1) synchronized
 * 2) volatile
 * 3) AtomicInteger,AtomicBoolean ,etc use ATOMICITY(Indivisble Step)
        Basically these 3 Keywords Tries to implement Atomicity by their level. Atomicity Eliminate DeadLock,RACE condition
 */

 /*
  * !!! UNDERSTAND Atomicity Concept: Atomicity->(Cannot be Futher divided into Sub Process)
    Classic Example a Counter 
        We implement Counter by counter++ 
        If we closely understand this It is not a Single Process instead it consist of read,write,update
        so here it CAN be divided into futher so it Fails Atomicity.
     Example of Race Condition:
        When Two Separate Threads use a SAME Memory(SHARED Memory) Eample a Battery_Charge_Left=89%
                Thread 1-> Takes this  Battery_Charge_Left=89% does some Action 
				Thread 2-> Change  Battery_Charge_Left=78% (Due to some USEAGE) and Thread 2 also do some Action
Now Here the Updated  Battery_Charge_Left=78% might not be used by the Thread 1 because usually for Better & Fast execution the Thread 1 Cache the value itself and does not verify each Time with the Shared memory 
This can be solved by using Volatile keyword this Makes all the Threads to Verify each time with the Shared Memory    
  */

  /*
   * Volatile:
   *     Strictly used for Field(Maybe Global Variable) alone so cannot be used for Methods,class,Local variables
   *     Volatile cause the Thread to Refer the SHARED MEMORY each time so the value won't be CACHED by the Thread
   *     Volatile is Faster as compared to Synchronized
   *NOTE: volatile  does not GUARANTEE atomicity for compound actions  
   *
   * !!! BEST Situation to Use this is when we want to Stop a Thread with boolean refer below code  
   */
  
   /*
    *Synchronized:
    *   It is applicable to ONLY Blocks or Methods
    *   synchronized Keyword Makes Only Single Thread at a Time to Access this Method to Eliminates Collision
    *   synchronzed used when a multiple lines of code or method that needed to synchronized(Thread safe)
    *NOTE:   synchronized provide Lock so that it is slow  

	Monitor Object: synchronized( monitor_object ){ }
		When you use a synchronized block in Java, you need to specify an object to act as the monitor. The monitor object is the entity on which the lock is acquired.
    	
    	 Different Types of Monitor Objects
		1)this (Current Instance)
			Usage: When you want to synchronize instance methods or blocks within an instance of a class.
			Purpose: Ensures that only one thread can execute the synchronized block for a particular instance of the class at a time.
   		NOTE:
		Scope: When you use "this" as the monitor object, you are locking the entire instance of the class. This means that any other synchronized block or method in the 
  			same instance that also uses this as the monitor will be blocked until the lock is released.
		Effect: If multiple synchronized methods or blocks use this, they will all be mutually exclusive, meaning only one can execute at a time per instance.

  		2)ClassName.class (Class-Level) Lock
    		 	 Usage: When you want to synchronize static methods or blocks, or when you need to synchronize access across all instances of a class.
			 Purpose: Ensures that only one thread can execute the synchronized block for the entire class, regardless of the instance.
      		NOTE:
      		Scope: When you use Example.class as the monitor object, you are locking the entire class. This means that any synchronized block or method that uses ClassName.class as the monitor will be blocked until the lock is released, regardless of the instance.
		Effect: This is useful for synchronizing static methods or when you want to ensure that only one thread can execute a block of code across all instances of the class.

    		3)Custom Lock Object (private final Object lock = new Object())
			Usage: When you want more fine-grained control over synchronization, or when you want to synchronize only specific parts of a class without locking the entire instance or class.
			Purpose: Provides flexibility in synchronization, allowing you to lock only specific resources or operations.
      		NOTE:
		Scope: When you use a custom lock object, you are locking only the specific block of code that uses that lock object. Other synchronized blocks or methods that use different lock objects can execute concurrently.
		Effect: This allows for more fine-grained control over synchronization. You can have multiple independent locks within the same class, each controlling access to different resources or operations.
   
    */

    /*
     * Atomic classes:
     *      Java Provide few Atomic class DataType
     *      These works closely with HardWare so Total Atomicity is Attained
     *      Atomic provide few methods like 
     *          count.getAndIncrement()
     *          count.incrementAndGet()
     *          count.get()
     *          count.decrementAndGet()
     *          etc....                        
     * NOTE: This is suitable for Single variable so cannot be used for Block of code  
     * 
     * !!! BEST Situation to Use this is when we want to Monitor and count the Total USERS accessed our WebApplication a Day
     */



     // Atomic class , synchronized Implementation
class IdGenerator
{
    int id=0;
    AtomicInteger count = new AtomicInteger();
    
    volatile boolean loopRun=true;

    private void incrementeId()
    {

        id=id+1;
        count.incrementAndGet();
    }

    public synchronized int getId()
    {
        incrementeId();
        return id;
    }

    public int getCount()
    {
        return count.get();
    
    }


    // Using Synchronized Block
    private int cnt = 0;
    private final Object lock = new Object(); // => lock this object provided to enable Lock so that one Thread can be executed at a time
    
    public void increment() {
        synchronized (lock) {
            cnt++;
        }
    }

    public int getCnt() {
        synchronized (lock) {
            return cnt;
        }
    }


}

// Volatile Implementation
class MultiThread implements Runnable
{
    IdGenerator obj;
    volatile boolean loopRun=true;
    MultiThread(IdGenerator idgenObj)
    {
        this.obj=idgenObj;
    }
    public void run()
    {

        while(loopRun)
        {
        obj.getId();
        }
    }
    public void loopStop()
    {
        this.loopRun=false;
    }
}

public class ThreadKeywords {

    public static void main(String[] args) throws InterruptedException {
        IdGenerator idgen = new IdGenerator();
        MultiThread obj1 = new MultiThread(idgen);
        Thread one = new Thread(obj1);
        MultiThread obj2 = new MultiThread(idgen);
        Thread two = new Thread(obj2);
        one.start();
        two.start();
        one.join();
        two.join();
        System.out.println("Total"+idgen.id); 
    }
}
