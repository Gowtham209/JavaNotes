import java.util.*;

// NOTE:
//  Thread class Itself Implement "Runnable Interface"  so Runnable interface is the MAIN Parent 
/*
 THREAD Class:
*  Thread is a class that implements the Runnable Interface
*  Thread has Multiple methods that are Handy for MultiThreading processes

DisAdvantage:
    If we extends Thread class then we can't extends another class and so we can ONLY implements Multiple Interface

 run() => Runs on Main Thread itself Because run() DOESN'T create New Thread to Run Separately from the Main Thread
 start() => Parallel Processing Because start() creates New Thread for each Object

NOTE::
Like run() method We cannot "OverRide the start() method of the Thread class because the start() method is final. 
This means that it cannot be modified or overridden in any subclass. 

IMPORTANT:
start() Method: Cannot be overridden Because it is FINAL Method and is used to "initiate a new thread of execution".
run() Method: Can be overridden or implemented to define the task that the thread will execute.

EVEN if we use Thread Class extends We need to OVERRIDE run() method to DEFINE the CORE process the New Thread Going to Do

Use start(): To execute the run() method in a New Thread, ALWAYS Call "start()".
Do Not Use run() Directly: Calling run() directly "Will NOT create a New Thread" it will execute the method in the current thread.
By using start(), you ensure that your overridden run() method executes in a separate thread, allowing for concurrent execution with other threads.

 */
class ParallelMultiThread extends Thread    {

    public synchronized void add()
    {
        
    }

    public void run()
    {
        // This is similar to Runnable Interface's run() method
    }


}

public class Threads {
	 public static void main(String[] args) throws InterruptedException {
		ParallelMultiThread obj = new ParallelMultiThread();
        obj.start();
        // We can Directly use start() because we start() is sepcified in Thread class
		 
        
    }
}
