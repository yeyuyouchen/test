package test;

import java.io.File;

public class Test {

    public static void main(String[] args) throws Exception{
	
	File file  = new File("D:/tools");
	if(file.isDirectory()){
	    String[] names = file.list();
	    for(String name : names){
		System.out.println(name);
	    }
	}
    }
}
