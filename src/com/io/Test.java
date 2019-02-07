package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
   public static void main(String[] args) throws IOException, FileNotFoundException{
	
	   
	   FileInputStream fis=new FileInputStream("abc.txt");
	   FileOutputStream fos=new FileOutputStream("xyz.txt");
	   int c;
	  while((c= fis.read())!=-1){
		  System.out.println((char)c+" "+c);
		  fos.write(c);
	  }
	  fis.close();
	  fos.close();
}
	
	
}
