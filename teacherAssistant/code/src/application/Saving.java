package application;
//Libraries
import java.util.*;

import domain.Teacher;
import foundation.Student;
import java.io.*;

public class Saving implements Serializable{
	
	public void saveUsers(LinkedList<Teacher> list, String filename) throws IOException, ClassNotFoundException{
		FileOutputStream fileOutput = new FileOutputStream("saving/" + filename);
		ObjectOutputStream objectOutput = new ObjectOutputStream (fileOutput);
		objectOutput.writeObject(list);
		objectOutput.flush();
		objectOutput.close();
	}
	
	public LinkedList loadUsers(String filename) throws IOException, ClassNotFoundException {
		FileInputStream fileInput = new FileInputStream("saving/" + filename);
		ObjectInputStream objectInput = new ObjectInputStream(fileInput);
		LinkedList users = (LinkedList) objectInput.readObject();
		objectInput.close();
		return users;
	}

}
