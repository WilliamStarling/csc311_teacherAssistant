Treepackage domain;
import java.util.*;

import foundation.Assignment;
import foundation.Student;

public class ClassRoster {

	private String f_subjectName;
	private LinkedList f_chartList;
	private TreeMap<String, Student> f_studentList;
	private TreeMap<String, Assignment> f_assignmentList;

	/*
	 * This method is the constructor for the classRoster class for the student. 
	 * It takes the name given and creates new lists to store the seating charts,
	 * assignments, and students.
	 * 
	 * @param courseName: The name of the course
	 */
	public ClassRoster(String courseName) {
		f_subjectName = courseName;
		f_assignmentList = new TreeMap();
		f_studentList = new TreeMap();
	}

	/*
	 * This adds a new assignment to the list.
	 * 
	 * @param newAssignment: the assignment object that needs to be added to the list.
	 */
	public void addAssignment(Assignment newAssignment) {
		f_assignmentList.put(newAssignment.getName(), newAssignment);
	}

	/*
	 * This creates a new student and adds them the student list.
	 * 
	 * @param name: the name of the new object being added.
	 */
	public void addStudent(String name) {
		f_studentList.put(name, new Student(name));
	}
	
	/*
	 * This returns the assignment associated with the name passed in.
	 * 
	 * @param assignmentName: the name used to search for an assignment
	 * 
	 * @return: the assignment that comes up after searching with the supplied name.
	 * returns "null" if does not exist. This case will be handled in a higher layer.
	 */
	public Assignment getAssignment(String assignmentName){
		return f_assignmentList.get(assignmentName);
	}
	
	/*
	 * This returns the student associated with the name passed in.
	 * 
	 * @param studentName: the name used to search for a student
	 * 
	 * @return: the student that comes up after searching with the supplied name.
	 * returns "null" if does not exist. This case will be handled in a higher layer.
	 */
	public Student getStudent(String studentName) {
		return f_studentList.get(studentName);
	}

}
