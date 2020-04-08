package jicu.thread.state;
/**
 * ͨ��object���wait��notify����ʵ���̵߳Ĺ��𼰻ָ�����
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
	//������
	synchronized void mysuspend() {
		suspendFlag=true;
	}
	//���ָ�Only one thread at a time can own an object's monitor.
	synchronized void myresume() {
		suspendFlag=false;
		notify();
	}

}
