package day29exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E03 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=null;
		try {
		fis= new FileInputStream("src/day29exceptions/TextFil");
		
		int k=0;
		while((k=fis.read())!=-1) {
			System.out.print((char)k);
			
		}
		fis.close();
		
		}catch (IOException e) {
			System.out.println("Ya path yanlis ya okunmuyor ");
		}finally {
			fis.close();
		}
	}

}
