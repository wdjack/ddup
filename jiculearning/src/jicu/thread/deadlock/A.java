package jicu.thread.deadlock;

public class A {

	synchronized void fool(B b) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered A.fool");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("A interrupted");
		}
		System.out.println(name+" trying to call B.last()");
		b.last();
	}
	
	synchronized void last(){
		System.out.println("Inside A.last");
	}

}
