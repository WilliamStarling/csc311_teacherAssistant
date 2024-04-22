package foundation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {
	
	Student person = new Student("Example Student");

	/*
	 * Test the getAbsences() method in the Student Class by using getAbsences() to see if the student's absences were initialized correctly.
	 * Then uses setAbsences() to change the student's absence count. Calls getAbsences() to ensure it returns the updated value.
	 * 
	 * Specifically checks that f_absences equals 0 then equals 5
	 * 
	 * */
	@Test
	void getAbsencesTest() {
		boolean check = false;
		if(person.getAbsences() == 0) {
			check = true;
		}
		
		person.setAbsences(5);
		if(person.getAbsences() != 5) {	
			check = false;
		}
		assert(check);
	}
	
	/*
	 * Tests the setAbsences() method in the Student Class by using setAbsences() to change the value of the f_absences variable then
	 * using the getAbsences() method to check that setAbsences() updated the value properly.
	 * 
	 * Specifically checks that f_absences equals 1 then 3
	 * 
	 * */
	@Test
	void setAbsencesTest() {
		boolean check = false;
		person.setAbsences(1);
		if(person.getAbsences() == 1) {
			check = true;
		}
		person.setAbsences(3);
		if(person.getAbsences() != 3) {
			check = false;
		}
		assert(check);
		
	}
	
	/*
	 * Tests the that the setAbsences() method in the Student Class gives an error when given a negative value.
	 * 
	 * */
	@Test
	void negativeAbsencesTest() {
		
		assertThrows(IllegalArgumentException.class,
				() -> {			
					person.setAbsences(-1);
				});
	}
	
}
