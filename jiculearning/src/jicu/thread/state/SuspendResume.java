package jicu.thread.state;

public class SuspendResume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       NewThread ob1 = new NewThread("one");
       NewThread ob2 = new NewThread("two");
       
       try {
    	   Thread.sleep(1000);
    	   ob1.mysuspend();
    	   System.out.println("Suspending thread One");
    	   Thread.sleep(1000);
    	   ob1.myresume();
    	   System.out.println("Resuming thread One");
    	   Thread.sleep(1000);
    	   ob2.mysuspend();
    	   System.out.println("Suspending thread Two");
    	   Thread.sleep(1000);
    	   ob2.myresume();
    	   System.out.println("Resuming thread Two");
    	   
       }
       catch(InterruptedException e) {
    	   System.out.println("Main Thread interrupted");
       }
       try {
    	   System.out.println("Waiting for threads to finish.");
    	   ob1.t.join();
    	   ob2.t.join();
       }
       catch(InterruptedException e) {
    	   System.out.println("Main thread interrupted.");
       }
       System.out.println("Main thread exits.");
	}

}
