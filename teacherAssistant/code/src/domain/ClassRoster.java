package domain;
import java.util.*;

import foundation.Assignment;
import foundation.Student;

public class ClassRoster {

	private String f_subjectName;
	//private LinkedList f_chartList;
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
	 * This adds a new assignment to the list and returns a pointer to it.
	 * 
	 * @param name: the name of the assignment to be added.
	 * 
	 * @return: returns a pointer to the assignment, so that Control can immedietly open it up
	 * as the current assignment for editing.
	 */
	public Assignment addAssignment(String name) {
		Assignment newAssignment = new Assignment(name);
		f_assignmentList.put(name, newAssignment);
		return newAssignment;
	}

	/*
	 * This creates a new student and adds them the student list, and returns a pointer to it.
	 * 
	 * @param name: the name of the new student being added.
	 * 
	 * @return: Returns a pointer to the new student object, so that Control can set it as the 
	 * current student and immediately open up it's info for editing.
	 */
	public Student addStudent(String name) {
		Student newStudent = new Student(name);
		f_studentList.put(name, newStudent);
		return newStudent;
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
	
	/*
	 * This removes the specified student from the list.
	 * 
	 * @param studentName: the name of the student to be deleted.
	 */
	public void deleteStudent(String studentName)
	{
		f_studentList.remove(studentName);
	}
	
	/*
	 * This deletes the specified assignment from the assignment list
	 * 
	 * @param studentName: the name of the assignment to be deleted.
	 */
	public void deleteAssignment(String assignmentName)
	{
		f_assignmentList.remove(assignmentName);
	}
	
	/*
	 * This returns the TreeMap object containing the list of all students, for display
	 * purposes.
	 * 
	 * @return: The TreeMap containing the students in this class. 
	 */
	public TreeMap getStudentList()
	{
		return f_studentList;
	}
	
	/*
	 * This returns the TreeMap object containing the list of all assignments, for display
	 * purposes.
	 * 
	 * @return: The TreeMap containing the assignments in this class. 
	 */
	public TreeMap getAssignmentList()
	{
		return f_assignmentList;
	}
}
