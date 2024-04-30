package domain;


//Libraries
import java.util.*;
import java.io.Serializable;
import foundation.Assignment;

/**
 * This is the user class, it will store information pertaining to the user the instance belongs to including name and password, and the classes they teach.
 * 
 * @author william
 */
public class Teacher implements Serializable{

	public String f_username;
	private String f_password;
	private String userID;
	private TreeMap<String, ClassRoster> f_classList = new TreeMap();
	private ClassRoster classRoster;
	
	/**
	 * The constructor for the teacher class, sets the username and password.
	 * 
	 * @param username The username for this account.
	 * @param password The password for this account.
	 */
	public Teacher(String username, String password) 
	{
		f_username = username;
		f_password = password;
	}

	/**
	 * This adds a class to the users list of classes.
	 * 
	 * @param className The name of the class being added.
	 * @param id The ID for this new class.
	 * 
	 * @return Returns a pointer to the new class for the control class to assign as the current class.
	 */
	public ClassRoster addClass(String className, String id) 
	{
		ClassRoster newClass = new ClassRoster(className, id);
		f_classList.put(className, newClass);
		return newClass;
	}
	
	/**
	 * Gets a class with the specified name.
	 * 
	 * @param className The name of the class your getting.
	 * 
	 * @return Returns a pointer to the class.
	 */
	public ClassRoster getClass(String className)
	{
		return f_classList.get(className);
	}
	
	/**
	 * Gets the list of all classes this teacher has access to.
	 * 
	 * @return The Tree map of classes.
	 */
	public TreeMap getClassList()
	{
		if (f_classList.isEmpty()) {
			return null;
		}
		return f_classList;
	}
	
	/**
	 * Deletes the specified class.
	 * 
	 * @param className The name of the class you wish to delete.
	 */
	public void deleteClass (String className)
	{
		f_classList.remove(className);
	}
	
	/**
	 * Compares the password provided against the one for this teacher. Used instead of a getter function
	 * for security purposes.
	 * 
	 * @param password The password the system wants to check.
	 * 
	 * @return Returns true if the password matches, and false otherwise.
	 */
	public boolean checkPassword(String password)
	{
		if(password.equals(f_password))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * the getter function for the username.
	 * 
	 * @return Returns the username. 
	 */
	public String getName()
	{
		return f_username;
	}

}
