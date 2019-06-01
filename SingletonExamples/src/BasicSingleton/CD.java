package BasicSingleton;

public class CD {


	private String[] song;

	public CD(String[] song) {
		this.song = song;
	}

	public String getSongNumber(int x) {
		return song[x];
	}
	
}
