package Filewriteroperation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Usingbufferedwriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location="usingbufferedwriter.txt";
		String content="I am a king Maker!";
		FileWriter filewriter = new FileWriter(location);

		BufferedWriter bufferedwriter= new BufferedWriter(filewriter);
		bufferedwriter.write(content);
		bufferedwriter.close();
		
		
	}

}

