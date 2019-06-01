package readresolveSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ReadResolveSingletonRunner {

	public static void main(String[] args) throws Exception {

		CD beatles = new CD(new String[] { "Yellow Submarine", "Hey Jude" });
		CD drake = new CD(new String[] { "God's Plan", "Started From the Bottom" });
		RecordPlayer.getRecordPlayer().setCD(beatles);

		System.out.println(RecordPlayer.getRecordPlayer().play(0));

		RecordPlayer.getRecordPlayer().setCD(drake);
		
		System.out.println(RecordPlayer.getRecordPlayer().play(1));
		
		//testing serialization and deserialization
		
		Serializer serializer = new Serializer();
		
		String fileName = "testSerialization.txt";
		serializer.saveToFile(RecordPlayer.getRecordPlayer(), fileName);
		RecordPlayer rp2 = serializer.readFromFile(fileName);
		
		System.out.println("check if two singletons are equal " 
				+ (RecordPlayer.getRecordPlayer() == rp2));
		
		System.out.println(RecordPlayer.getRecordPlayer());
		System.out.println(rp2);
		
	}

}


