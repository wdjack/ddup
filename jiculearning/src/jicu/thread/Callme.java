package jicu.thread;

public class Callme {
	//����ͬһʵ���ĸ�ͬ�����������������̶߳�����ȴ�a
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
