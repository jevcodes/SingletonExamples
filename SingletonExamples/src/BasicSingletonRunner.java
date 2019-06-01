
public class BasicSingletonRunner {

	public static void main(String[] args) {

		CD beatles = new CD(new String[] { "Yellow Submarine", "Hey Jude" });
		CD drake = new CD(new String[] { "God's Plan", "Legend" });
		RecordPlayer.getRecordPlayer().setCD(beatles);

		RecordPlayer.getRecordPlayer().play(1);

		RecordPlayer.getRecordPlayer().setCD(drake);

		RecordPlayer.getRecordPlayer().play(1);

	}

}

class RecordPlayer {

	private CD cd;

	private static RecordPlayer rp = new RecordPlayer();

	private RecordPlayer() {

	}

	public static RecordPlayer getRecordPlayer() {
		return rp;
	}

	public void setCD(CD cd) {
		this.cd = cd;
	}

	public void play(int x) {
		System.out.println(cd.getSongNumber(x));
	}

}

class CD {

	private String[] song;

	public CD(String[] song) {
		this.song = song;
	}

	public String getSongNumber(int x) {
		return song[x];
	}

}
