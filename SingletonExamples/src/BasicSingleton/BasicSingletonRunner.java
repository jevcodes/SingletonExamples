package BasicSingleton;

public class BasicSingletonRunner {

	public static void main(String[] args) {

		CD beatles = new CD(new String[] { "Yellow Submarine", "Hey Jude" });
		CD drake = new CD(new String[] { "God's Plan", "Legend" });
		RecordPlayer.getRecordPlayer().setCD(beatles);

		RecordPlayer.getRecordPlayer().play(1);

		RecordPlayer.getRecordPlayer().setCD(drake);
		
		System.out.println(RecordPlayer.getRecordPlayer.play(1));

	}

}

