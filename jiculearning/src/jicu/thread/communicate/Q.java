package jicu.thread.communicate;

/**
 * ģ����б�֤putһ��Ԫ��getһ��Ԫ��
 * @author timi
 * ÿ���������Լ�����ʽ��������������ö����ͬ���������ͻ��Զ�����������ʽ��������
 *  һ��ĳ���߳�λ��һ��ͬ�������У������߳̾Ͳ��ܵ���ͬһ��������κ�����ͬ������
 */
public class Q {
	int n;
	boolean valueSet = false;
	synchronized int get() {
		while(!valueSet) {
			try {
				//֪ͨ�����̷߳������������������ߣ�ֱ��������һЩ�߳̽���ͬһ��������������notify��������notifyALL()����
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("InterruptedException caught");
			}
		}
		System.out.println("Got: "+n);
		valueSet = false;
		//���ѵ�����ͬ�����wait()�������߳�
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
