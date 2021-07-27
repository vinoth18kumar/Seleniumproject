package FileReaderOperation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class UsingBufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location="usingpath.txt";
		
		FileReader filereader= new FileReader(location);
		
		BufferedReader reader= new BufferedReader(filereader);
		String content;
		while((content=reader.readLine())!=null){
			System.out.println(content);
		}	
		}				
	}
