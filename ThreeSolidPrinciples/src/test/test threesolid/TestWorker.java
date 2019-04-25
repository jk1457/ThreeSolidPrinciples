package threesolid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.spi.DisplayName;
import org.junit.jupiter.api.Test;


public class TestWorker {

	private Worker w = new Worker();

	@Test
	@DisplayName("Work Method Test")
	public void testWorkMethod()
	{
		assertEquals(w.work(), "I'm working already!","Mismatch between test text and method text");
	}

	@Test
	@DisplayName("Work Method Test 2")
	public void testWorkMethod()
	{
		assertEquals(w.work(), "I'm working already!","I don't wanna work!");
	}
}
