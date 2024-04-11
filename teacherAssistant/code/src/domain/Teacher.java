package domain;
import java.util.*;

import foundation.Assignment;

public class Teacher {

	public String f_username;

	private String f_password;

	private TreeMap<String, ClassRoster> f_classList = new TreeMap();

	private ClassRoster classRoster;

	//Make these be the parameter: String newUsername, String newPassword
	public Teacher() {

	}

	public ClassRoster addClass(String className) 
	{
		ClassRoster newClass = new ClassRoster(className);
		f_classList.put(className, newClass);
		return newClass;
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
