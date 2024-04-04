package application;

import ui.Console;
import domain.ClassRoster;
import domain.SeatingChart;
import domain.Teacher;
import foundation.Assignment;
import foundation.Student;

public class Control {

	private Teacher f_selectedTeacher;

	private ClassRoster f_selectedClass;

	private Student f_selectedStudent;

	private Assignment f_selectedAssignment;

	private SeatingChart f_selectedChart;

	/*
	 *This is the main loop. When you start up the software it runs first.
	 *It opens up the UI to run to start taking user input.
	 * 
	 * @param args:
	 */
	public static void main(String[] args) {
		Console newSession = new Console();
		newSession.startConsole();
	}
	
	public void createAccount() {

	}
	
	public void createClass(String name) {
		f_selectedClass = new ClassRoster(name);
	}

	public void createChart() {

	}
	
	/*
	 * This creates a new student for the current class and adds it to the class's student list,
	 * and then sets the current student to be this newly created student.
	 * 
	 * @param name: the name of the new student being added.
	 */
	public void createStudent(String name) {
		f_selectedStudent = f_selectedClass.addStudent(name);
	}

	/*
	 * This creates a new assignment and adds them the current classes assignment list,
	 * and then sets the current assignment to be this new one so it can be quickly 
	 * updated with info.
	 * 
	 * @param name: the name of the new student being added.
	 */
	public void createAssignment(String name) {
		f_selectedAssignment = f_selectedClass.addAssignment(name);
	}

	public void viewClasses() {

	}

	public void viewStudentList() {

	}

	public void viewStudent() {

	}

	public void viewAssignmentList() {

	}

	public void viewAssignment() {

	}

}
