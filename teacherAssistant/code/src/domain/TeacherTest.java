package domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TeacherTest {
	
	Teacher user = new Teacher("Account Name");

	@Test
	void addClassTest() {
		user.addClass("Example Class");
		assertEquals("Example Class", user.getClassList());
	}

}
