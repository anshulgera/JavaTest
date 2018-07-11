package com.jda.test.algorithms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ReadFile {

	public static void main(String[] args) {
		BufferedReader reader;
		String data = "";
		ArrayList<String> words = new ArrayList<String>();
		String fileLocation = "C:\\Users\\1022772\\git\\JavaTest\\text.txt";
		try {
			reader = new BufferedReader(new FileReader(fileLocation));
			while((data=reader.readLine()) != null) {
				String[] array = data.split(",");
				for(String y:array) {
					words.add(y);
				}
			}
			reader.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		Collections.sort(words);
		System.out.println(words);
	}

}
