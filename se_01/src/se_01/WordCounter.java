package se_01;

import java.io.*;

public class WordCounter {
	public int countsWords() throws IOException{
		int result = 0;
		
		try (BufferedReader br = new BufferedReader(new FileReader("temp.txt"))){
			String line = br.readLine();
			
			while( line != null ){
				result += line.split(" ").length;
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			throw new IOException("File not found");
		}

		return result;
	}
	/*
	public static void main( String[] args ){
		WordCounter c = new WordCounter();
		int result = 0;
		try {
			result = c.countsWords();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(result);
	} */
}
