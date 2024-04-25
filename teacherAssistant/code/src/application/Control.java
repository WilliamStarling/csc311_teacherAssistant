package application;

//Libraries
import ui.Console;
import java.util.*;
import domain.ClassRoster;
import domain.SeatingChart;
import domain.Teacher;
import foundation.Assignment;
import foundation.Student;

/**
 * This method is what's used to fufill all the different actions the user tries
 * to do with the UI. It handles all the dirty details like logic and calling
 * other classes so that the UI code is simple.
 * 
 * @author william
 */
public class Control {

	private Teacher f_selectedTeacher;
	private ClassRoster f_selectedClass;
	private Student f_selectedStudent;
	private Assignment f_selectedAssignment;
	private SeatingChart f_selectedChart;
	private LinkedList<Teacher> f_userList = new LinkedList<Teacher>();
	Random rand = new Random(); // for generating random numbers
	int lastID = 0000;

	/**
	 * Allows the user to make an account.
	 * 
	 * @param username the username for the account.
	 * 
	 * @param password the password for the account.
	 * 
	 * @return Returns true if the account was succesfully created, returns
	 *         false if a user with the given username already existed.
	 */
	public boolean createAccount(String username, String password) {
		int size = f_userList.size(); // Number of users
		for (int i = 0; i < size; i++) {
			System.out.println(f_userList.get(i).getName());
			if (f_userList.get(i).getName().equals(username)) {
				return false; // returns false if there's already a user with
								// that username.
			}
		}

		f_selectedTeacher = new Teacher(username, password); // Creates a new											// account and
																// sets it as
																// the current
																// user.
		f_userList.add(f_selectedTeacher);
		System.out.println("Size of list: " + f_userList.size());
		return true;
	}

	/**
	 * Lets the user login and set the current teacher.
	 * 
	 * @param username The Username of the user trying to login.
	 * 
	 * @param password The password for that account.
	 * 
	 * @return Returns true if login succeeded, returns false if no account was
	 *         found with matching info or if password is incorrect.
	 */
	public boolean login(String username, String password) {
		int size = f_userList.size(); // Number of users

		Teacher currentTeacher; // Declares a variable to store the current
		// teacher so you don't have to call to get it twice.
		for (int i = 0; i < size; i++) // Loops through the user list checking
										// each user until a login matches.
		{
			currentTeacher = f_userList.get(i);
			if (currentTeacher.getName().equals(username)) {
				if (currentTeacher.checkPassword(password)) {
					f_selectedTeacher = currentTeacher;
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}

	/**
	 * Creates a new class for the teacher currently logged in.
	 * 
	 * @param className the name of the class that the user is making.
	 */
	public void createClass(String className) {
		String newID = generateID('C', lastID);
		f_selectedClass = f_selectedTeacher.addClass(className, newID);
		lastID = Integer.valueOf(newID.substring(2));
	}

	public void createChart() {

	}

	/**
	 * This creates a new student for the current class and adds it to the
	 * class's student list, and then sets the current student to be this newly
	 * created student.
	 * 
	 * @param name the name of the new student being added.
	 */
	public void createStudent(String name) {
		f_selectedStudent = f_selectedClass.addStudent(name);
	}

	/**
	 * This creates a new assignment and adds them the current classes
	 * assignment list, and then sets the current assignment to be this new one
	 * so it can be quickly updated with info.
	 * 
	 * @param name the name of the new student being added.
	 */
	public void createAssignment(String name) {
		f_selectedAssignment = f_selectedClass.addAssignment(name);
	}

	/**
	 * Returns the list of classes for display.
	 * 
	 * @return returns a string of the classes available.
	 */
	public String viewClasses() {
		return "no";
	}

	/**
	 * Displays the different students that have been made for the current
	 * class.
	 * 
	 * @return Returns a string containing the set of students and their names.
	 */
	public String viewStudentList() {
		return "The students for current class: \n"
				+ f_selectedClass.getStudentList().keySet();
	}

	/**
	 * Gathers all the information pertaining to the specified student, and puts
	 * it together into a string to display.
	 * 
	 * @param studentName The name of the student whose information you're
	 *                    gathering.
	 * 
	 * @return Returns the string containing all the information for the
	 *         specified student.
	 */
	public String viewStudent(String studentName) {
		f_selectedStudent = f_selectedClass.getStudent(studentName);
		String studentInfo;
		studentInfo = f_selectedStudent.getName() + "\n"
				+ f_selectedStudent.getGrade() + "\n"
				+ f_selectedStudent.getAbsences() + "\n"
				+ f_selectedStudent.getNotes();
		return studentInfo;
	}

	/**
	 * Displays the different assignments that have been made for the current
	 * class.
	 * 
	 * @return Returns a string containing the set of assignments and their
	 *         names.
	 */
	public String viewAssignmentList() {

		return "The assignments for current class: \n"
				+ f_selectedClass.getAssignmentList().keySet();
	}

	/**
	 * This gathers all the information pertaining to the specified assignment,
	 * and puts it together into a single string.
	 * 
	 * @param assignmentName The name of the assignment that your getting the data for.
	 * 
	 * @return The string to be displayed.
	 */
	public String viewAssignment(String assignmentName) {
		f_selectedAssignment = f_selectedClass.getAssignment(assignmentName);
		String assignmentInfo;
		assignmentInfo = f_selectedAssignment.getName() + "\n"
				+ f_selectedAssignment.getType() + "\n"
				+ f_selectedAssignment.getDueDate() + "\n"
				+ f_selectedAssignment.getPossiblePoints()
				+ f_selectedAssignment.getDescription();
		return assignmentInfo;
	}

	/**
	 * Edits the information on the current student by deleting the old student
	 * object and creating a new one in the case that the name changes and then
	 * sets the information for the new student object.
	 *
	 * @param oldName  The original name of the student whose information your
	 * @param newName  The new name of the student whose information your
	 * @param notes    The notes that you wish to be saved for the student.
	 * @param absenses the number of absences you wish for this student to have.
	 */
	public void editStudent(String oldName, String newName, String notes,
			int absenses) {
		deleteStudent(oldName);
		f_selectedStudent = f_selectedClass.addStudent(newName);
		f_selectedStudent.setNotes(notes);
		f_selectedStudent.setAbsences(absenses);
	}

	/**
	 * Edits the information on the current assignment by deleting the old
	 * assignment object and creating a new one in case the name changes, and
	 * then sets the information for the new assignment object.
	 * 
	 * @param oldName     The old name of the assignment being edited.
	 * @param newName     The new name of the assignment.
	 * @param description The new description of the object.
	 * @param type        The new type (homework, quiz, test, final) of the
	 * @param maxPoints   The new maximum number of points that can be earned.
	 * @param dueDate     The new due date for the assignment.
	 */
	public void editAssignment(String oldName, String newName,
			String description, String type, int maxPoints, String dueDate) {
		deleteAssignment(oldName);
		f_selectedAssignment = f_selectedClass.addAssignment(newName);
		f_selectedAssignment.setDescription(description);
		f_selectedAssignment.setType(type);
		f_selectedAssignment.setPossiblePoints(maxPoints);
		f_selectedAssignment.setDueDate(dueDate);
	}

	/**
	 * Uses the deleteStudent function in the ClassRoster class to delete a
	 * student with the specified name.
	 * 
	 * @param name the name of the student that you're deleting.
	 */
	public void deleteStudent(String name) {
		f_selectedClass.deleteStudent(name);
	}

	/**
	 * Uses the delete assignment function in the ClassRoster class to delete an
	 * assignment.
	 * 
	 * @param name The name of the assignment that you're deleting.
	 */
	public void deleteAssignment(String name) {
		f_selectedClass.deleteAssignment(name);
	}

	/**
	 * Deletes the specified class from the current teacher's class list.
	 * 
	 * @Param name The name of the class to be deleted.
	 */
	public void deleteClass(String name) {
		f_selectedTeacher.deleteClass(name);
	}

	/**
	 * generates a unique ID for identification that won't be changed.
	 * 
	 * @param typeLetter the type of object, ID's for objects of the same type
	 *                   will all begin with the same letter.
	 * @param previousID the ID for the most recent object needs to be passed in
	 *                   to ensure that this objects ID is unique and an
	 *                   increase from the last one.
	 * 
	 * @return returns the ID that was generated.
	 */
	public String generateID(char typeLetter, int previousID) {
		char randChar = (char) ('a' + rand.nextInt(26));

		return String.valueOf(typeLetter) + String.valueOf(randChar)
				+ String.valueOf(previousID + 1);
	}

}
