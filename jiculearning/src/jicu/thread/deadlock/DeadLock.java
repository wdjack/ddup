package jicu.thread.deadlock;
/**
 * ��2���߳�ѭ������һ��ͬ������ʱ���ᷢ������
 * ���磬����һ���߳̽�������X�ļ���������һ���߳̽���Y�ļ�������
 * ���X�е��߳���ͼ���ö���Y���κ�ͬ����������ô���ᱻ��Զ�����������Y�е��߳�Ҳ��ͼ���ö���A��
 * �κ�ͬ����������ôҲ����Զ�ĵȴ���ȥ
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
