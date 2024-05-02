package foundation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * AssisgnmentTest.java is for testing methods within the Assignment class
 * 
 * @author Savannah
 */

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
	 * Tests that the getPossiblePoints() method in the Assignment Class correctly
	 * returns the value set with the setPossiblePoints() method.
	 * 
	 * */
	@Test
	void getPossiblePointsTest() {
		example.setPossiblePoints(40);
		assertEquals(40, example.getPossiblePoints());
	}
	
	/*
	 * Tests that the getType() method in the Assignment Class correctly
	 * returns the assignment type set with the setType() method.
	 * 
	 * */
	@Test
	void getTypeTest() {
		example.setType("Quiz");
		assertEquals("Quiz", example.getType());
	}
	
	/*
	 * Tests that the getDueDate() method in the Assignment Class correctly
	 * returns the assignment due date set with the setDueDate() method.
	 * 
	 * */
	@Test
	void getDueDateTest() {
		example.setDueDate("05/01/24");
		assertEquals("05/01/24", example.getDueDate());
	}

}
