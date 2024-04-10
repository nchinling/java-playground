package extendthread;

public class Multithread {
    public static void main(String[] args)
    {
        int n = 12; // Number of threads
        for (int i = 0; i < n; i++) {
            MultithreadingDemo object
                = new MultithreadingDemo();
            object.start();
        }
    }
    
}

// Java code for thread creation by extending
// the Thread class
class MultithreadingDemo extends Thread {

    @Override
    public void run()
    {
        try {

            while(true){
            // Displaying the thread that is running
            System.out.println(
                "Thread " + Thread.currentThread().getName()
                + " is running");
            Thread.sleep(2000);
            }
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
 
