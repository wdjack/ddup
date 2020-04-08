package jicu.thread.communicate;

public class Producer implements Runnable {
	Q q;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(i<10) {
			q.put(i++);
		}

	}

	Producer(Q q){
		this.q=q;
		new Thread(this,"Producer").start();
	}
}
