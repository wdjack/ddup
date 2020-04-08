package jicu.thread;

public class NewThread implements Runnable {
	
	Thread t;
	String threadName;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0;i<5;i++) {
			System.out.println(threadName+"Child Thread : "+i);
			try {
				t.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Existing child thread"+threadName);

	}
	
	NewThread(String name){
		threadName = name;
		t=new Thread(this,name);
		System.out.println("Child Thread: "+t);
		t.start();
	}

}
