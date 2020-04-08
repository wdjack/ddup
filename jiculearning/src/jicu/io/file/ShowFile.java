package jicu.io.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		FileInputStream fin = null;
		
		if (args.length!=1) {
			System.out.println("Usage: ShowFile filename");
			return;
		}
		
		try {
			fin =  new FileInputStream(args[0]);
			do {
				i=fin.read();
				if(i!=-1)System.out.println(i);
			}
			while(i!=-1);
		}
		catch(FileNotFoundException e) {
			System.out.println("File not find.");
		}
		catch(IOException e) {
			System.out.println("An I/O Error Occurred");
		}
		finally {
			if(fin!=null) {
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error closing file");
			}
			}
		}
	}

}
