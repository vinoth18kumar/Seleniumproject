package Filewriteroperation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location="usingFIO.txt";
		String content="good day, good day;";
		
		FileOutputStream fileoutput= new FileOutputStream(location);
		byte[] writenew=content.getBytes();
		
		fileoutput.write(writenew);
		fileoutput.close();
		
		
	}

}
