import java.util.*;

/*
 * TYPES of Threads
 *  There are Two Types of Threads
 *      1) Daemond Thread
 *      2) Non-Daement Thread(User Created Thread)
 *
 *Daemond Thread
    Daemon threads run in the background like Garbage Collection and do not prevent the JVM from exiting
    JVM does care to wait till the Daemond Thread complete is execution
 *Non-Daemond Thread
    Non-Daemond Thread are User Defined Threads
    Non-daemon (user) threads perform essential tasks and keep the JVM running until they complete
 NOTE: Non-Daemond Thread can be Converted into Daemond Thread
 */
class MultiThread implements Runnable
{
    MultiThread()
    {
    }

    @Override
    public void run()
    {

        System.out.println("Thread is created and is Started to run!!!");
    }

}


public class ThreadMethods {

    public static void main(String[] args) throws InterruptedException {
        // Object Only Created
        MultiThread obj = new MultiThread();
        
        // Now New Thread is Created [Converting to Thread Object]
        Thread thread = new Thread(obj);
        
        // Priority Setting to the New Thread
        thread.setPriority(10);
        /*
        NOTE: By DEFAULT 5 is the Priority
         * Every Thread has its own Priority Range from 1 to 10
         * 1 Lowest Priority
         * 10 Highest Priority
         * 
         * Higher Number Higher the Priority thread Execution 
         */


        // Setting New Thread Name
        thread.setName("FileThread");
        //Getting the Thread Name
        System.out.println(thread.getName());

        // Checking Thread is Alive or not
        thread.isAlive(); //  => Returns Boolean

        // Number of Threads that are Running
        System.out.println(Thread.activeCount());
        /*
         * Using Thread Class itself for Few Methods like Thread.currentThread(),Thread.activeCount()
         */

        // Finding the Current Thread
        System.out.println(Thread.currentThread()); 
        
        // Now a New Separate Thread is Created and Runned Parallely
        thread.start();   

        // Making Thread to Sleeping 
        thread.sleep(1000); // => Wait for 1 second 
        /*
         * sleep() Makes the Current called Thread to wait for specified Time but the Other Threads Continuous to Run
         * sleep() Throws Exception so we need to use try catch or declare throws(Not Recommended)
         * 
         */

        // Join WITHOUT Time
        thread.join();
        /*
            join() makes the Previous Thread to WAIT untill the current Thread that called the join()
            Explained:
            Here the MAIN thread waits Untill the thread(obj) DIES 
        */ 
        // Join WITH Time
        thread.join(2000);
        // Here This cause Main thread to Wait for 2 seconds Unlike thread(obj) DIES

        // Converting User Thread into Daemond Thread
        thread.setDaemon(true); //  => By default setDaemond(false) so that the User thread will Always be Non-Daemond Thread
        // Checking the Type of the Thread
        System.out.println(thread.isDaemon());
        

    }
}