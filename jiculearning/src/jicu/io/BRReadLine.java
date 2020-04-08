package jicu.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLine {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Enter lines of text.");
		System.out.println("Enter 'stop' to quit.");
		do {
			str= br.readLine();
			System.out.println(str);
		}while(!str.equals("stop"));
	}

}
