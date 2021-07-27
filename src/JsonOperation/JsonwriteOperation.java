package JsonOperation;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonwriteOperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		JSONObject jsonobject =new JSONObject();
		jsonobject.put("Name", "Vinoth");
		jsonobject.put("Age", 1);
		
		JSONArray array= new JSONArray();
		array.add("hello how are you");
		array.add("I am fine");
		
		jsonobject.put("Simple details", array);
		
		FileWriter filewriter= new FileWriter("Jsonfile.json");
		filewriter.write(jsonobject.toString());
		filewriter.close();
				
		
	}

}
