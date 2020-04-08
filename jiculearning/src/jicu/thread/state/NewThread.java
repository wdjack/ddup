package jicu.thread.state;
/**
 * 通过object类的wait及notify方法实现线程的挂起及恢复操作
 * @author timi
 *
 */
public class NewThread implements Runnable {
	String name;
	Thread t;
	boolean suspendFlag;

	public NewThread(String threadName) {
		// TODO Auto-generated constructor stub
		name = threadName;
		t=new Thread(this,name);
		System.out.println("New Thread: "+t);
		suspendFlag=false;
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=15;i>0;i--) {
				System.out.println(name + ": "+i);
				Thread.sleep(200);
				synchronized (this) {
					while(suspendFlag) {
						wait();
					}
				}
			}
		}
		catch(InterruptedException e) {
			System.out.println(name+" interrupted.");
		}
		System.out.println(name+" exiting.");
	}
	//被挂起
	synchronized void mysuspend() {
		suspendFlag=true;
	}
	//被恢复Only one thread at a time can own an object's monitor.
	synchronized void myresume() {
		suspendFlag=false;
		notify();
	}

}
