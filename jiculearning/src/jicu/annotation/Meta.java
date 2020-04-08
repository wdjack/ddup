package jicu.annotation;

import java.lang.reflect.Method;

public class Meta {
	
	@MyAnno(str="Annotation Example",val = 100)
	public static void myMeth(String str,int i) {
		Meta ob = new Meta();
		try {
			//���÷����ȡclass����
			Class<?> c = ob.getClass();
			//��ȡ����ķ���
			Method m = c.getMethod("myMeth",String.class,int.class);
			//��ȡ������һ��ע��
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
