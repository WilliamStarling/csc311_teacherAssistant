Treepackage domain;
import java.util.*;

import foundation.Assignment;
import foundation.Student;

public class ClassRoster {

	private String f_subjectName;
	private LinkedList f_chartList;
	private TreeMap<String, Student> f_studentList;
	private TreeMap<String, Assignment> f_assignmentList;
	private Student student;
	private SeatingChart seatingChart;

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
	 * This is adds a new student to the list.
	 * 
	 * @param newStudent: the student object that needs to be added to the list.
	 */
	public void addStudent(Student newStudent) {
		f_studentList.put(newStudent.getName(), newStudent);
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
