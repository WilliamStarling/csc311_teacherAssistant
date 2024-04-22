package foundation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class AssignmentTest {

	Assignment example = new Assignment("Example");
	
	/*
	 * Tests the getName method in the Assignment Class by checking that the Assignment constructor
	 * Initialized the name correctly to 'Example' using getName().
	 * 
	 * */
	@Test
	void getNameTest() {
		assertEquals("Example", example.getName());
	}
	
	@Test
	void setNameTest() {
		example.setName("New Name");
		assertEquals("New Name", example.getName());
	}
	
	/*
	@Test
	void getPossiblePointsTest() {
		
	}
	*/

}
