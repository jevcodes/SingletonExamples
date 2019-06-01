package readresolveSingleton;

import java.io.Serializable;

public class CD implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -7799748606387050649L;
	private String[] song;

	public CD(String[] song) {
		this.song = song;
	}

	public String getSongNumber(int x) {
		return song[x];
	}
	
}
