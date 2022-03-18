package com.client;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ManualReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader reader= new FileReader("src//application.properties");
		Properties p= new Properties();
		p.load(reader);
		
		System.out.println(p.getProperty("jdbc.driver"));
	}

}
