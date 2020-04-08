package jicu.thread;

public class SynoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Callme target = new Callme();
       Callme target1 = new Callme();
       Callme target2 = new Callme();
       Caller ca1 = new Caller(target1,"Hello");
       Caller ca2 = new Caller(target1,"Synchronized");
       Caller ca3 = new Caller(target1,"world");
       
//       try {
//    	   ca1.t.join();
//    	   ca2.t.join();
//    	   ca3.t.join();
//    	   
//       }
//       catch(InterruptedException e) {
//    	   System.out.println("Interrupted.");
//       }
	}
	
	

}
