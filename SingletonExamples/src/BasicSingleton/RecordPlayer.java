package BasicSingleton;

public class RecordPlayer {

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

	public String play(int x) {
		return cd.getSongNumber(x);
	}
	
}
