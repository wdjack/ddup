package jicu.annotation;

import java.lang.reflect.Method;

public class Meta {
	
	@MyAnno(str="Annotation Example",val = 100)
	public static void myMeth(String str,int i) {
		Meta ob = new Meta();
		try {
			//利用反射获取class对象
			Class<?> c = ob.getClass();
			//获取对象的方法
			Method m = c.getMethod("myMeth",String.class,int.class);
			//获取方法的一个注解
			MyAnno anno = m.getAnnotation(MyAnno.class);
			System.out.println(anno.str() +" " + anno.val());
			
		}catch(NoSuchMethodException exc) {
			System.out.println("Method not found.");
		}
		
	}
	
	public static void main (String[] args) {
		myMeth("aaa",10);
	}

}
