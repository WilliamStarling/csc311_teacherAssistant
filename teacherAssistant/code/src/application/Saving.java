package application;
//Libraries
import java.util.*;

import domain.Teacher;
import foundation.Student;
import java.io.*;

/**
 * This class handles saving data to enable data persistence.
 * 
 * @author william
 */
public class Saving implements Serializable{
	
	/**
	 * This class will save the linked list containing the list of users into the specified location.
	 * 
	 * @param list The linked list of users.
	 * @param filename The extention of the file that the data will be saved to.
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public void saveUsers(LinkedList<Teacher> list, String filename) throws IOException, ClassNotFoundException{
		FileOutputStream fileOutput = new FileOutputStream("saving/" + filename);
		ObjectOutputStream objectOutput = new ObjectOutputStream (fileOutput);
		objectOutput.writeObject(list);
		objectOutput.flush();
		objectOutput.close();
	}
	
	/**
	 * This linked list will load the specified file as a linked list of users and return it to be used as the new user list.
	 * 
	 * @param filename The extention of the file that needs to be loaded.
	 * 
	 * @return Returns the linked list of users.
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public LinkedList loadUsers(String filename) throws IOException, ClassNotFoundException {
		FileInputStream fileInput = new FileInputStream("saving/" + filename);
		ObjectInputStream objectInput = new ObjectInputStream(fileInput);
		LinkedList users = (LinkedList) objectInput.readObject();
		objectInput.close();
		return users;
	}

}
