package jicu.io;

import java.io.PrintWriter;
/**
 * 向控制台写输出，PrintWriter.println
 * @author timi
 *
 */
public class PrintWriterDemo {
	
	public static void main(String[] args) {
		PrintWriter pr =  new PrintWriter(System.out,true);
		pr.println("this is a string");
		int i = 10;
		pr.println(i);
		double e=0.5f;
		pr.println(e);
	}

}
