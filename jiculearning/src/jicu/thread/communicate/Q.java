package jicu.thread.communicate;

/**
 * 模拟队列保证put一个元素get一个元素
 * @author timi
 * 每个对象都有自己的隐式监视器，如果调用对象的同步方法，就会自动进入对象的隐式监视器，
 *  一旦某个线程位于一个同步方法中，其他线程就不能调用同一个对象的任何其他同步方法
 */
public class Q {
	int n;
	boolean valueSet = false;
	synchronized int get() {
		while(!valueSet) {
			try {
				//通知调用线程放弃监视器并进入休眠，直到其他的一些线程进入同一个监视器并调用notify方法或者notifyALL()方法
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("InterruptedException caught");
			}
		}
		System.out.println("Got: "+n);
		valueSet = false;
		//唤醒调用相同对象的wait()方法的线程
		notify();
		return n;
	}
	synchronized void put(int n) {
		while(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("InterruptedExcepton caught");
			}
		}
		this.n=n;
		valueSet = true;
		System.out.println("Put: "+n);
		notify();
	}

}
