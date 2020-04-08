package jicu.thread.deadlock;
/**
 * 当2个线程循环依赖一对同步对象时，会发生死锁
 * 例如，假设一个线程进入对象的X的监视器，另一个线程进入Y的监视器。
 * 如果X中的线程试图调用对象Y的任何同步方法，那么将会被永远阻塞如果对象Y中的线程也试图调用对象A的
 * 任何同步方法，那么也将永远的等待下去
 * @author timi
 *
 */
public class DeadLock implements Runnable {
	A a= new A();
	B b = new B();

	public DeadLock() {
		// TODO Auto-generated constructor stub
	   Thread.currentThread().setName("Main Thread");
	   Thread t= new Thread(this,"RacingThread");
	   t.start();
	   a.fool(b);
	   System.out.println("Back in main thread");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		b.bar(a);
		System.out.println("Back in other thread");
		
		
	}
	
	public static void main(String[] args) {
		new DeadLock();
	}

}
