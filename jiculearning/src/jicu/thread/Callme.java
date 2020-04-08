package jicu.thread;

public class Callme {
	//调用同一实例的该同步方法的所有其他线程都必须等待a
	synchronized void call(String msg) {
		System.out.println("["+msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}

}
