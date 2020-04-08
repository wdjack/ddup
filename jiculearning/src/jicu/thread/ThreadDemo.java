package jicu.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		new NewThread();
//		
//		for (int i=0;i<5;i++) {
//			System.out.println("Main Thread: "+i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				System.out.println("Main Thread interrupted.");
//			}
//		}
//		System.out.println("Main Thread exiting.");
		
		NewThread t1=new NewThread("One"); 
		NewThread t2=new NewThread("Two"); 
		NewThread t3=new NewThread("Three"); 
		System.out.println("Thread t1 is alive: "+t1.t.isAlive());
		System.out.println("Thread t2 is alive: "+t2.t.isAlive());
		System.out.println("Thread t3 is alive: "+t3.t.isAlive());
		

		try {
			System.out.println("Waiting for Threads to fininsh.");
			//该方法会一直等待，直到调用线程终止
			t1.t.join();
			t2.t.join();
			t3.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread t1 is alive: "+t1.t.isAlive());
		System.out.println("Thread t2 is alive: "+t2.t.isAlive());
		System.out.println("Thread t3 is alive: "+t3.t.isAlive());
		System.out.println("Main Thread exiting.");
		
	}

}
