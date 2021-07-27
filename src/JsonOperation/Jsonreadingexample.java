package JsonOperation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Jsonreadingexample {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		JSONParser jsonparser= new JSONParser();
		FileReader filereader= new FileReader("Jsonfile.json");		
		Object parsedobject=jsonparser.parse(filereader);
		JSONObject jsonobject= (JSONObject) parsedobject;
		String nam=(String) jsonobject.get("Name");
		Long ag=(Long) jsonobject.get("Age");
		JSONArray array=(JSONArray) jsonobject.get("Simple details");
		Iterator iterator=array.iterator();
		System.out.println("Name is: "+ nam);
		System.out.println("Age is: " + ag);
		while(iterator.hasNext()) {
			System.out.println("Simple details: "+ iterator.next());
					}
					
	}

}
