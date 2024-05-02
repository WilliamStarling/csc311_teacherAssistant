package domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * ClassRosterTest.java is for testing methods within the ClassRoster class
 * 
 * @author Savannah
 */

class ClassRosterTest {
	
	ClassRoster course = new ClassRoster("Example Class", "Ta0000");

	/*
	 * Tests that the addStudent() method in the ClassRoster Class does not return null
	 * 
	 * */
	@Test
	void addStudentTest() {
		assert(course.addStudent("test") != null);
	}
	
	/*
	 * Tests that the getStudent() method in the ClassRoster Class works
	 * 
	 * */
	@Test
	void getStudentTest() {
		course.addStudent("test");
		assert(course.getStudent("test") != null);
	}
	
	/*
	 * Tests that the deleteStudent() method in the ClassRoster Class deletes a student object
	 * 
	 * */
	@Test
	void deleteStudentTest() {
		course.addStudent("test");
		course.deleteStudent("test");
		assert(course.getStudent("test") == null);
	}
	
	/*
	 * Tests that the addAssignment() method in the ClassRoster Class does not return null
	 * 
	 * */
	@Test
	void addAssignmentTest() {
		assert(course.addAssignment("example") != null);
	}
	
	/*
	 * Tests that the getAssignment() method in the ClassRoster Class does not return null
	 * 
	 * */
	@Test
	void getAssignmentTest() {
		course.addAssignment("example");
		assert(course.getAssignment("example") != null);
	}
	
}