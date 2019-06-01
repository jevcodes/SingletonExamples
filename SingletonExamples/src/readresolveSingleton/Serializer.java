package readresolveSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializer {


	public Serializer() {
		
	}
	
	public void saveToFile(RecordPlayer rp, String fileName) throws Exception {
	  FileOutputStream output = new FileOutputStream(fileName);
	  ObjectOutputStream out = new ObjectOutputStream(output);
	  out.writeObject(rp);
	}
	
	public RecordPlayer readFromFile(String fileName) throws Exception{
		FileInputStream input = new FileInputStream(fileName);
		ObjectInputStream in = new ObjectInputStream(input);
		return (RecordPlayer) in.readObject();
	}
	
}
