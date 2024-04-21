package application;
//Libraries
import java.util.TreeMap;

import foundation.Student;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Saving implements Serializable{
	
	public void saveStudentList(TreeMap<String, Student> list, String filename) throws IOException{
		try (ObjectOutputStream serialize = new ObjectOutputStream(new FileOutputStream(filename))) {
			serialize.writeObject(list);
		}
	}

}
