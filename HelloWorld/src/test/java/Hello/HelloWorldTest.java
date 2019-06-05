package Hello;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
	
	@Test
	public void helloWorldTest() {
		HelloWorld hello = new HelloWorld();
		assertEquals("Hello World!", hello.helloWorld());
	}
}
