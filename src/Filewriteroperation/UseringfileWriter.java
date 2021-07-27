package Filewriteroperation;

import java.io.FileWriter;
import java.io.IOException;

public class UseringfileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1. file location 2. content
		
		String location="useringfilewriter.txt";
		String content="Learning java is simple!";
		
		FileWriter filewriter = new FileWriter(location);
		filewriter.write(content);
		filewriter.close();
		
		
	}

}
