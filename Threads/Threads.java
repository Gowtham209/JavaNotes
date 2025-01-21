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