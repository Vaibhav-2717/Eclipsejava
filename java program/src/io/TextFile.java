package io;

import java.io.File;
import java.io.FileWriter;

public class TextFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String data ="\n Hello friends chai pi lo....";
	File f= new File("src\\io\\MyFile.txt");
	try {  
    FileWriter fw =new FileWriter(f,true);
    fw.write(data);
    fw.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
}}
