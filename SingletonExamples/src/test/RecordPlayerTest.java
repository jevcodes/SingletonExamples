package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import BasicSingleton.CD;
import BasicSingleton.RecordPlayer;

public class RecordPlayerTest {

	CD divide;
	
	
	
	@Before
	public void setup() {
		 divide = new CD(new String[] {"Dive","Perfect","Galway Girl"});
		
	}
	
	@Test
	public void Should_Test_BasicSingleton_Instantiated() {
		assertNotNull(RecordPlayer.getRecordPlayer());
	}
	
	@Test
	public void Should_Test_Song() {
		RecordPlayer.getRecordPlayer().setCD(divide);

		assertEquals("Perfect", RecordPlayer.getRecordPlayer().play(1));
	}

}
