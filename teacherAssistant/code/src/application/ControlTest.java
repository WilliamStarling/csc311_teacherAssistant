package application;

import org.junit.jupiter.api.Test;

/**
 * ControlTest.java is for testing methods within the Control class
 * 
 * @author Savannah
 */

public class ControlTest {
	
	Control controller = new Control();
	
	/*
	 * Tests the that the createAccount() method in the Controller Class returns true
	 * 
	 * */
	@Test
	void createAccountTest() {
		
		assert(controller.createAccount("Test", "000"));
		
	}
}
