package BasicSingleton;

public class BasicSingletonRunner {

	public static void main(String[] args) {

		CD beatles = new CD(new String[] { "Yellow Submarine", "Hey Jude" });
		CD drake = new CD(new String[] { "God's Plan", "Started From the Bottom" });
		RecordPlayer.getRecordPlayer().setCD(beatles);

		System.out.println(RecordPlayer.getRecordPlayer().play(0));

		RecordPlayer.getRecordPlayer().setCD(drake);
		
		System.out.println(RecordPlayer.getRecordPlayer().play(1));

	}

}

