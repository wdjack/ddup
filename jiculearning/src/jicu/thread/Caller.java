package jicu.thread;

public class Caller implements Runnable {
	
	String msg;
	Callme target;
	Thread t;
	
	public Caller(Callme targ,String s) {
		msg=s;
		target=targ;
		t=new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
			target.call(msg);
		
		

	}

}
