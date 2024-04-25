package application;

import org.junit.jupiter.api.Test;

public class ControlTest {
	Control controller = new Control();
	
	@Test
	void createAccountTest() {
		
		assert(controller.createAccount("Test", "000"));
		
	}
}
