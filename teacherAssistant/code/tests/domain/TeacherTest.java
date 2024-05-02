package domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * TeacherTest.java is for testing methods within the Teacher class
 * 
 * @author Savannah
 */

class TeacherTest {
	
	Teacher user = new Teacher("Account Name", "Password");

	
	/*
	 * Tests that the addClass() method in the Teacher Class adds a class to the class list
	 * 
	 * */
	@Test
	void addClassTest() {
		user.addClass("Example Class", "Ta0000");
		assert(user.getClass("Example Class") != null);
	}
	
	/*
	 * Tests that the checkPassword() method in the Teacher Class returns true when correct
	 * 
	 * */
	@Test
	void checkPasswordTest() {
		assert(user.checkPassword("Password"));
	}
	
	/*
	 * Tests that the getClassList() method in the Teacher Class works
	 * 
	 * */
	@Test
	void getClassListTest() {
		user.addClass("Example Class", "Ta0000");
		assert(user.getClassList() != null);
	}

}
