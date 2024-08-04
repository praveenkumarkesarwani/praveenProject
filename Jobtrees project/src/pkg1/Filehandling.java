package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filehandling 
{
public static void main(String[] args) throws IOException {

	File f= new File("../Jobtrees project/Book1.xlsx");
	FileReader fr= new FileReader(f);
	BufferedReader br= new BufferedReader(fr);
//	int a;
//	while ((a=fr.read())!=-1)
//	{
//		System.out.println((char)a);
//	}
//	
	
	String s;
	while ((s=br.readLine())!=null)
	{
		System.out.println(s);
	}
	
}
}
