package jicu.thread;

public class ExtendThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NewThread1();
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Main Thread interrupted.");
			}
		}
		System.out.println("Main Thread exiting.");

	}

}
