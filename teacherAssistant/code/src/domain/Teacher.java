package domain;
import java.util.*;

import foundation.Assignment;

public class Teacher {

	public String f_username;

	//private String f_password;

	private TreeMap<String, ClassRoster> f_classList;

	private ClassRoster classRoster;

	//Make these be the parameter: String newUsername, String newPassword
	public Teacher(String newUsername) {
		f_username = newUsername;
	}

	public ClassRoster addClass(String subjectName) 
	{
		ClassRoster newSubject = new ClassRoster(subjectName);
		f_classList.put(subjectName, newSubject);
		return newSubject;
	}
	
	public ClassRoster getClass(String className)
	{
		return f_classList.get(className);
	}
	
	public TreeMap getClassList()
	{
		return f_classList;
	}
	
	public void deleteClass (String className)
	{
		f_classList.remove(className);
	}

}
