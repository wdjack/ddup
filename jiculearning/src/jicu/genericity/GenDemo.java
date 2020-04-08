package jicu.genericity;

public class GenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Gen op;
        Gen oo;
        Integer[] s = {1,2,34,55,6};
        op=new Gen<Integer>(s);
        System.out.println(op.average());
        Double[] ss = {1.0,2.0,34.0,55.0,6.0};
        oo=new Gen<Double>(ss);
        System.out.println(op.average());
        System.out.println(oo.sameAvg(op));
		
	}

}
