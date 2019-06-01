package readresolveSingleton;

import java.io.Serializable;

public class RecordPlayer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CD cd;

	private static final RecordPlayer rp = new RecordPlayer();

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
	
	//Added this method for ObjectInput/Output Stream to test how 
	//serialization affects Singleton. If this method is commented out,
	//we get two instances, if this method is available, we get only one instance.
	@SuppressWarnings({ "unused", "static-access" })
	private Object readResolve() {
		return this.rp;
	}
	
	
}
