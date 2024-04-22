package domain;


//Libraries
import java.util.*;
import java.io.Serializable;
import foundation.Assignment;

public class Teacher implements Serializable{

	public String f_username;
	private String f_password;
	private String userID;
	private TreeMap<String, ClassRoster> f_classList = new TreeMap();
	private ClassRoster classRoster;
	
	/*
	 * The constructor for the teacher class, sets the username and password.
	 * 
	 * @param username: The username for this account.
	 * @param password: The password for this account.
	 */
	public Teacher(String username, String password) 
	{
		f_username = username;
		f_password = password;
	}

	public ClassRoster addClass(String className, String id) 
	{
		ClassRoster newClass = new ClassRoster(className, id);
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
	
	/*
	 * Compares the password provided against the one for this teacher. Used instead of a getter function
	 * for security purposes.
	 * 
	 * @param password: The password the system wants to check.
	 * 
	 * @return: Returns true if the password matches, and false otherwise.
	 */
	public boolean checkPassword(String password)
	{
		if(password == f_password)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/*
	 * the getter function for the username.
	 * 
	 * @return: Returns the username. 
	 */
	public String getName()
	{
		return f_username;
	}

}
