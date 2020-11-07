package com.besics;

import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFileUsingFileoutputStream {

	public static void main(String[] args) throws IOException {
		DataInputStream dis=new DataInputStream(System.in);
		FileOutputStream fos=new FileOutputStream("myfile.txt");
		
		System.out.println("enter text (if you want to end type '@')");
		char ch;
		while((ch=(char)dis.read())!='@')
			fos.write(ch);
		fos.close();
		
	}

}
