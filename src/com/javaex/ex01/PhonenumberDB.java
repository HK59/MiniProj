package com.javaex.ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class PhonenumberDB {

	private String phdb="C:\\javaStudy\\PhoneDB (1) - 원본.txt";
	public void prdb(List<Phone> list) throws IOException {
			
			Reader r = new FileReader(phdb);
			BufferedReader br = new BufferedReader(r);
			
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				String[] split = line.split(",");
				Phone person = new Phone(split[0], split[1], split[2]);
				
				list.add(person);
			}
			
			br.close();
		}
}
