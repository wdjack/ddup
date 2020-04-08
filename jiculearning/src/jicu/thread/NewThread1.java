package jicu.thread;

public class NewThread1 extends Thread {
	NewThread1(){
		super("Demo Thread");
		System.out.println("Child Thread: "+this);
		start();
	}
	public void run() {
		for(int i =0;i<5;i++) {
			System.out.println("Child Thread: "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Child Thread interrupted");
			}
		}
		System.out.println("Child Thread exiting.");
	}

}
