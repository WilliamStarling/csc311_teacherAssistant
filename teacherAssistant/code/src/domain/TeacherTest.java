package domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TeacherTest {
	
	Teacher user = new Teacher("Account Name", "Password");

	@Test
	void addClassTest() {
		user.addClass("Example Class", "Ta0000");
		assertEquals("Example Class", user.getClassList());
	}

}
